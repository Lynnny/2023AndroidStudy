package com.cherry.myapplication
/*
fun main(){
    var data = 10
    if(data>10){
        println("daata>10")
    }
    else if(data > 0 && data <= 10){
            println("data>0 && data<=10")
        }
        else {
        println("data<=0")
    }
}
 */

fun main(){
    var data = 10
    val result = if(data > 0) {
        println("daata > 0")
        true
    }
    else {
        println("data <= 0")
        false
    }
    println(result)
}