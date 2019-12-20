package com.dist

fun main(){
    println("ceshi")
    println(sum(1,2));
    println(sum2(1,2))
}

fun sum(a:Int,b:Int):Int{
    return a+b;
}

fun sum2(a:Int,b:Int)=a+b;

//没有返回值 或者说是无意义的值
fun sum3(a:Int,b:Int):Unit{
    return ;
}
//可以省略
fun sum4(a:Int,b:Int){
    return ;
}