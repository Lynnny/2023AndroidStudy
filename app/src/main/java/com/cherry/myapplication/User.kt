package com.cherry.myapplication

class User(var name : String, var age : Int) {
    fun print(){
        println("제 이름은 $name 이고 나이는 $age 살 입니다.")
    }
    constructor(name : String, age : Int, email : String) : this(name, age){
            println("제 이름은 $name 이고 나이는 $age 살 이메일은 $email 입니다. ")
        }
    }


fun main(){
    var user = User("김채린", 23)
    var user2 = User("김챈", 22, "happykcr")
    user.print()
}