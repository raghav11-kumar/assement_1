package com.example.git_pract.Module1

import androidx.annotation.IntegerRes

fun sum(vararg  nums:Int):Int{
    var total=0
    for(it in nums)
        total+=it
    return total
}

fun showList(list:List<Int>){
    for(it in list)
        println(it)
}