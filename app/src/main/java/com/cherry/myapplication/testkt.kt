package com.cherry.myapplication

lateinit var data1:String
val data4: Int by lazy{
    println("in lazy......")
    10
}
val a1:Byte = 0b00001011
val a2:Int = 123
val a3:Short = 123
val a4:Long = 10L
val a5:Double = 10.0
val a6:Float = 10.0f
val a7:Boolean = true

fun main(){
    val str1 = "Hello \n World"
    val str2 = """
        Hello
        World
    """
    val data3: Int
    data3 = 10
    println("Data3 : $data3")
    println("in main.....")
    println(data4+10)
    println("str1 : $str1")
    println("str2 : $str2")
}