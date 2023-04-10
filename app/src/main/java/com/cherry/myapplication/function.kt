package com.cherry.myapplication

fun some(data1:Int) : Int {
    return data1 * 10
}

fun some(data1:Int, data2:Int): Int{
    return data1*data2
}
fun main(){
    fun some(data1:Int, data2:Int):Int{
        return data1*data2
    }
    println(some(10))
    println(some(10,20))
}