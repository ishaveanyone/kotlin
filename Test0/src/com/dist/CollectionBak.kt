package com.dist
//集合测试
fun testListSet(){
    //只能遍历
    val numbersList= listOf<Any>("one", "two", "three", "four",1)

    numbersList.forEach { it->
        print(it)
    }
    //可以遍历可以添加删除

   val mlist= mutableListOf<String>("1");
    mlist.add("hhhh");

}
fun testMap(){
   val map= mapOf<String,Any>("1" to "a","2" to "b");
   val mmap= mutableMapOf<String,Any>()
    mmap["a"] = 333;
}
fun main() {
    testListSet()
}
