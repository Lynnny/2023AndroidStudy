package com.cherry.myapplication

//List
/*
fun main(){
    val list = listOf<Int>(10,20,30)
    println(
        """
            list size : ${list.size}
            list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
        """.trimIndent()
    )
}
*/

//mutablelist
/*fun main(){
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3,40)
    mutableList.set(0,50)
    println(
        """
            list size : ${mutableList.size}
            list data : ${mutableList[0]}, ${mutableList.get(1)},
                        ${mutableList.get(2)}, ${mutableList.get(3)}
        """.trimIndent()
    )
}
 */

//Map
fun main(){
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size}
            map dat : ${map.get("one")}, ${map.get("two")}
        """
    )
}