package com.dist

/**
 * kt 中的接口
 */
//接口中没有幕后字段
//kt 中具有 抽象属性 和抽象方法
//顶层概念 就是 和 类 同一级的 对象就是 顶层对象 类 也算是 顶层对象
interface  MyInterface1{
    val v
        get() = "aa";//属性访问器
    val v3:String;

    fun f1();

    fun f2(){

    }

}

interface  MyInterface0{

    fun f2(){

    }

}

interface  MyInterface2:MyInterface1{
//    val v
////        get() = "bb";
    val v2
        get() = "cc"
    override val v
        get() = "dd"
//    var v3//接口中是否可以存在var变量
//        set(value) {
//            field=value
//        }


}

//接口之间可以多继承
interface  MyInterface3:MyInterface1,MyInterface2{

}

class MyClass1:MyInterface2,MyInterface0{
    //实现多个父类中共有的方法
    override fun f2() {
        super<MyInterface0>.f2()
        super<MyInterface2>.f2()
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    //实现父类中的抽象方法
    override fun f1() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val v3: String
        get() = "cs"//To change initializer of created properties use File | Settings | File Templates.
}

fun main(){
    val myClass1=MyClass1();
    print(myClass1.v2)
    print(myClass1.v)
    print(myClass1.v3)
}