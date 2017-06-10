package com.evasquez.mykotlintest

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by evasquez on 7/6/17.
 */

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}