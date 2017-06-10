package com.evasquez.mykotlintest

/**
 * Created by evasquez on 7/6/17.
 */

fun getCatsList(): List<CatItem>{
    return (1..10).map { CatItem(it.toLong(), "Cat $it", "http://lorempixel.com/400/400/cats/$it/") }
}

data class CatItem(val id : Long, val title : String, val url : String)
