package com.dist

/**
 * 测试 函数功能  顶层函数 可以不用事先创建类
 */
fun test(arg1:Int=1,arg2:String="cs"){
    print(""+arg1+""+arg2);
}
//vararg 可变参数
fun foo(vararg strings: String){
    var its=strings.iterator();
    its.forEach { it ->
        if(it.equals("a")){
            print(1)
        }else{
            print(2)
        }

    }

}

//返回值是 unit 是可以或者不反回
fun reunit(arg:String):Unit{
    if(arg.equals("a")){
        return;
    }
//    return;
}
fun reunit2(arg:String){
    if(arg.equals("a")){
        return;
    }
}
//返回表达式结果 返回值由 表达式推断出来
fun double(x: Int): Int = x * 2
fun double2(x: Int) = x * 2//可以不显示指定返回
//中缀表示法 必须是扩展函数 或者是 成员函数
infix fun Int.ddd(arg:Int){
    //使用this表示调用方
    print(this+arg)
}
infix fun String.test(arg:Int){
    //使用this表示调用方
    print(this+arg)
}


//lamdal 表达式 高阶函数 就是 一个函数可以接受 另外一个函数的函数
fun lamdaltest(){
    val items = listOf(1, 2, 3, 4, 5)
    // Lambdas 表达式是花括号括起来的代码块。
    items.fold(0, {
        // 如果一个 lambda 表达式有参数，前面是参数，后跟“->”
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // lambda 表达式中的最后一个表达式是返回值：
        result
    });

    // lambda 表达式的参数类型是可选的，如果能够推断出来的话：
    val joinedToString = items.fold("Elements:",
            { acc, i -> acc + " " + i })

// 函数引用也可以用于高阶函数调用：
    val product = items.fold(1, Int::times)

}


fun main() {
    test();
    foo(*arrayOf("a", "b", "c"))
    print(double2(3))
    1.ddd(1);
    1.ddd(1);
    "aaa".test(1)
}

