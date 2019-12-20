package com.dist


/**
 * kt 中的 变量
 */
val c=2;//顶层变量 不能被改变
var d=2;//顶层变量
fun main(){

    //不能将小数据类型隐式转换成大数据类型
    // 假想的代码，实际上并不能编译：
    //val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
    //val b: Long? = a?.toLong(); // 隐式转换产生一个装箱的 Long (java.lang.Long)
    // 惊！这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long
//    println(f4())
//    println(f6())
     //使用标签可以随意控制 循环状态
    val arr1= arrayOf(1,2,3,4);
    val arr2= arrayOf(5,6,7);
     for(i1 in arr1){
         loop@for (i2 in arr2){
            if(i2==6){
                break@loop;
            }else{
               println("$i1,$i2");//必须第一个是字符串
            }
        }
    }
}

fun f():Int{
    //定义局部只读变量
    val a=1;//自动推断是int
    //a=2;不能在被重新赋值
    var b=2;
    b=3;//可以重新赋值
    return a;
}

fun f2(){
  d=3;
}

fun f3(){
    val i1=1;
    val f1=1.33333333333f;
    print(i1+f1);
    val i2=1000_000_000;//挖草 还能这样
    print(i2);

}

fun f4():String{
    //在字符串中使用占位符代码
    val arr= arrayOf(1,2,3);

    val str="${arr?.size} is big";
    return str;
}

fun f5():String{
    //在字符串中使用占位符代码
    //"" 转义字符串
    //""" 原始字符串
    val arr= arrayOf(1,2,3);

    val str="""
        ${arr?.size} is big
        """;
    return str;
}

fun f6():Int{
    var flag :Int?=null;
    flag=if(1==1) 1 else 2;
    return flag;

}

fun f7(a:Int){
    when(a){
        1-> print("ok")
        2-> print("no")
        else->{
            print("can't match")
        }
    }
}

