package com.exmyth.beyond.kotlin

/**
 * Created by exmyth on 18/2/20.
 */
fun main(args: Array<String>) {
    for(i in 1.rangeTo(10) step 2){
        println(i)
    }

    for(i in 9 downTo 1 step 2){
        println(i)
    }

    for(i in 10.downTo(1) step 2){
        println(i)
    }
}
