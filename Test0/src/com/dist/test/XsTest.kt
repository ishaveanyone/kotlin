package com.dist.test

import com.dist.C2
import com.dist.C3
import com.dist.C4
import com.dist.CC3
    //扩展在顶层定义 只需要 引入 就可以使用
//  如果在类内定义 就只能 在类内部使用
fun main(){
    C2();//所有地方都能看到
    val c4=C4("fff");//模块内可见
    print(c4.name)
    val c3=CC3("cs");
    c3.test2()//扩展函数 太牛逼了
    print(c3.v2)

    val c3n:CC3?=null;
    c3n.test3();//卧槽
    CC3.test4()

}

//利用扩展的功能
fun CC3.test2(){
    print(this.name.length);
}
//利用扩展的功能
fun CC3?.test3(){
    if(this==null){
        print("null")
    }
}
val CC3.v2
    get() = "222"

 fun CC3.Companion.test4(){
    //好乱啊
}