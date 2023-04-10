package com.cherry.myapplication

/*
fun main(){
    var sum:Int = 0
    for(i in 1..10){
        sum+=i
    }
    println(sum)
}
 */

/*
fun main(){
    var data = arrayOf<Int>(10,20,30)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size - 1) print(",")
    }
}
*/

/*
fun main(){
   var data = arrayOf<Int>(10,20,30)
   for((index, value) in data.withIndex()){
       print(value)
       if(index !== data.size - 1) print(",")
   }
}
*/

fun main(args: Array<String>){
    var x = 0
    var sum1 = 0
    while (x<10){
        sum1 += ++x
    }
    println(sum1)
}