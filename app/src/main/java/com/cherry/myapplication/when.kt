package com.cherry.myapplication
/*
fun main(){
    var data = 10
    when (data) {
        10-> println("data is 10")      이 부분이 출력됨
        20-> println("data is 20")
        else->{
            println("data is not valid data")
        }
    }`
}
 */

/*
fun main(){
    var data = "hello"
    when (data){
        "hello"->println("data is hello")       이 부분이 출력됨
        "world"->println("data is world")
        else->{
            println("data is not valid data")
        }
    }
}
 */

/*
fun main() {
    var data: Any = 10
    when (data) {
        is String -> println("data is String")
        20,30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10")        이 부분이 출력됨
          else -> println("data is not valid")
    }
}
 */

/*
fun main(){
    var data = 10
    when{
        data <= 0 -> println("data is <= 0")
        data > 100 -> println("data is > 100")
        else -> println("data is valid")        이 부분이 출력됨
    }
}
 */

fun main(){
    var data = 10
    val result = when{              //변수에 when을 이용해서 값 저장
        data <= 0 -> "data is <= 0"
        data > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result)         //result는 data is valid가 저장되어있음
}