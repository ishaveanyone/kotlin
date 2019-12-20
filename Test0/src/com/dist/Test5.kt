package com.dist

/**
 * 数据类
 */
data class C5(var name:String){

}
//定义的时候 一定要定义具体 不能 修饰符 和类型 必须都是存在
class C6(protected var name:String){

}
/**
 *
 * 密封类 强制定义了一套继承关系
 * 默认是一个抽象类
        */
sealed class C7{
    abstract val v1:String;
}

class CC71:C7(){
    override val v1: String=""
        get() =field //To change initializer of created properties use File | Settings | File Templates.

}
class CC72:C7(){
    override val v1: String=""
        get() =field //To change initializer of created properties use File | Settings | File Templates.

}
class CC73:C7(){
    override val v1: String=""
        get() =field //To change initializer of created properties use File | Settings | File Templates.

}



fun compare(c:C7)=when(c){
    is CC71->{

    }
    is CC72->{

    }
    is CC73->{

    }
}

fun compare(c:String)=when(c){
   "aa"->{

   }
    //必须要有else
   else->{

   }
}

class J{

}
//如果构造函数里参数 前加了限定符不能重名
class Uc1( name: String){
    val name=name;
}

//（在1.1之前）数据类只能实现接口。 数据类中的构造函数参数和 属性不能重名
data class UserC(val name2:String) {
//    val j:J =j2;
    var age:Int=0;
}

fun main(){
    val v=UserC("1");
    val v2= v.copy("1")//copy函数是深复制 不是浅复制
    v.age=3;
    v2.age=1;

    print(v.equals(v2))//如果有组合参数好像排除字段并不起作用
    print(v==v2)
//    Pair
//    Triple
}

