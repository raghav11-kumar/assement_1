package com.example.git_pract.Module1

fun main(){
val list=listOf<Image>(
    Image("http10","content1"),
    Image("http10","content1"),
    Image("http10","content1"),
    Image("http10","content1"),
    Image("http10","content1")
)
    val set=listOf(
        10,20,30,10,10,10,102,30
    )
    println(set.toSet())
    val list2=mutableListOf<Image>()
    list2.add(Image(null,"content1"))
    list2.add(Image(content = "content3"))
    val map=mapOf(
        1 to "One",
        2 to "two",
        3 to "three",
        4 to "Four",
        5 to "Five"
    )
    val mapMut=mutableMapOf<Int, String>()
    mapMut[10]="Ten"
    mapMut[20]="Twenty"
    mapMut[30]="Thirty"
    for((id,value) in mapMut)
        println("${id}->${value}")
    val obj1= operations()
    obj1.prod(1,3,5,7,8,9)
    obj1.sum(10,20,30,40,50)
    obj1.println()

obj1.xml("name1",1,10)
    for(it in list2)
        it.println()
}
class Image(private val url: String?="default",private val content:String){
    fun println(){
        println("${url}:${content}")
    }
}
class operations{
    var total:Int?=0

    fun sum(vararg num: Int):Int{

        var total1=0
        for(it in num)
            total1+=it
        total=total1
        return total1
    }
    var product:Int=1

    fun multiply(a:Int,b: Int): Int{
        product=a*b
        return a*b
    }
    fun prod(vararg nums: Int): Int{
        var prod=1
        for(it in nums)
            prod*=it
        product=prod
        return prod

    }
    fun println(){
        println("sum ->${total}: prod ->${product}")
    }
    fun xml(name: String,id: Int,age: Int){
        val str="<Student><name>${name}</name><id>${id}</id><age>${age}</age></Student>"
        println(str)
    }
    fun isEven(num:Int): Boolean{
        return num%2==0
    }
}