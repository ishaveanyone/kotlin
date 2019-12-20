package com.dist

import java.lang.reflect.Field

/**
 * kt 中的修饰符
 *
 *
private 意味着只在这个类内部（包含其所有成员）可见；
protected—— 和 private一样 + 在子类中可见。
internal —— 能见到类声明的 本模块内 的任何客户端都可见其 internal 成员；
public —— 能见到类声明的任何客户端都可见其 public 成员。
 */
//只能在文件内被访问
//顶层对象 文件 开始开始对象 ，
private  class C1{

}
//默认
public  class C2{

}

//文件开始的对象
//protected 不能修饰类
val a="";
abstract class C3{

    protected val v1="";

}


class CC3:C3{
     companion object { }  // 将被称为 "Companion"
     var name=""
     get() = field
     set(value){
        field=value
     }
    constructor(name:String){
        this.name=name;
    }
    fun test(){
        //子类可见 而且 修饰仍然为 protect
        print(v1);
    }

}
//标准的 类定义
//如果一个类定义有一个成员函数与一个扩展函数，而这两个函数又有相同的接收者类型、
// 相同的名字，并且都适用给定的参数，这种情况总是取成员函数。 例如：
internal class C4(name:String){
     var name:String?=name
        get() =field
        set(value) {
            field=value
        }
     init {
         this.name=name;
     }


//    init {
//        print("the name is $name")
//    }

}

