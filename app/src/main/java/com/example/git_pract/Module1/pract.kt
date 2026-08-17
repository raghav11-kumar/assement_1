package com.example.git_pract.Module1

fun main(){
    val name="Name1"//to assign value using val the
    // val cannot be changed
    var age=12//value can be reassigned
    age=24//now age ->24 not 12
    println("Name : ${name}-> Age${age}")
    val rollNo:Int=246
    val cgpa: Double=8.12
    val isGraduate:Boolean=true
    val initial: Char='M'
    println(
        "Intial ->:${initial} name->${name}->:RollNo ${rollNo}->:cgpa ${cgpa} ->:Graduate :" +
            "${isGraduate} "
    )


}
fun add(a:Int,b: Int): Int{
    return a+b
}
