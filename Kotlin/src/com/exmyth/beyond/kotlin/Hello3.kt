package com.exmyth.beyond.kotlin

/**
 * Created by exmyth on 18/2/19.
 */
fun main(args: Array<String>) {
    println(convert(123))
}

fun convert(x: Any): String? {
    if(x is String){
        return x.toUpperCase()
    }
    return null
}