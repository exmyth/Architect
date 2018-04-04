package com.exmyth.beyond.kotlin

import java.util.function.Consumer

fun main(args: Array<String>){
    println("Hello World")
    val list: List<String> = listOf("hello", "world")
    for(str in list){
        println(str)
    }
    list.forEach (Consumer{println(it)})
    list.forEach (System.out::println)
    println(plus(1,2))
}

fun plus(a: Int, b: Int): Int{
    return a + b
}

fun plus2(a: Int, b: Int) = a + b

fun plus3(a: Int, b: Int){
    println("$a + $b = ${a + b}")
}