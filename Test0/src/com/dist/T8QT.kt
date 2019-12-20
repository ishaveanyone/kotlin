package com.dist
class Outer {
    private val bar: Int = 1
    class Nested { //嵌套类
        fun foo() = 2
    }
}

class Outer2 {
    private val bar: Int = 1
    inner class Inner2 {//内部类
        fun foo() = bar
    }
}


fun main(){
    //创建嵌套类对象
    var inc=Outer.Nested();
    print(inc.foo())
    //内部类可以使用外部类成员
    print(Outer2().Inner2().foo())
}