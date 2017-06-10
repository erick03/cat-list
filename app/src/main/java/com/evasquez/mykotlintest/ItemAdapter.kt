package com.evasquez.mykotlintest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_item.view.*

/**
 * Created by evasquez on 7/6/17.
 */
class ItemAdapter(val items : List<CatItem>, val lister : (CatItem) -> Unit ) :
        RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cat = items[position]
        holder.itemView.txt_title.text = cat.title
        holder.itemView.img_cat.loadUrl(cat.url)
        holder.itemView.setOnClickListener { lister(cat) }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)

}
