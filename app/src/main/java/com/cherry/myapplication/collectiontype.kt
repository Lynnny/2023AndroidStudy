package com.cherry.myapplication

/*fun main(){
    val data1:Array<Int> = Array(3, {0})
    data1[0]=10
    data1[1]=20
    data1.set(2, 30)

    println("""
        array size : ${data1.size}
        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
    """)
}
 */

fun main(){
    val data1 = arrayOf<Int>(10,20,30)
    println(
        """
            array size : ${data1.size}
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """
    )
}

// val data1:IntArray = IntArray(3, {0})
//val data1 = intArrayOf(10,20,30)
