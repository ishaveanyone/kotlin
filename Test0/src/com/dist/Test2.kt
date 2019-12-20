package com.dist

/**
 * kt 中的 类
 */
//不需要 和文件同名
class Address constructor(name:String){

}
//如果要将类作为父类 被继承 必须使用open 关键字 进行修饰
//如果派生类有一个主构造函数，其基类型可以（并且必须） 用基类的主构造函数参数就地初始化。
open class People constructor( name:String, address: Address){//主构造方法
    var children: MutableList<People> = mutableListOf<People>();
    init {
        //类似非静态代码块
        println("the name is $name")
    }
    //如果类有一个主构造函数，每个次构造函数需要委托给主构造函数，
    constructor(number: Int,name:String,address: Address):this(name,address){
        print(number);
    }

}


class Man(name: String,address: Address) :People(name,address){

}


fun main1(){
//    val o:Any?=Any();
//    //注意 Kotlin 并没有 new 关键字。
//    val p1=People(1,"a", Address("ccc"));

    val b=B("cs");

    F.create();
}
//如果子类 有主构造函数 那么必须使用 父类的主构造函数进行初始化
//如果子类没有主构造函数 那么就
open class A(age:Int){
    open val name="";
    val age:Int=0;
    constructor(name:String):this(1){
        print(1);
    }
    //不能被覆盖
    fun f(){

    }
    //使用open 可以被覆盖
    open fun  f1(){

    }
}

class B(age: Int):A(age) {
    constructor(name: String) :this(1);
}

class C:A {
    override val name: String get() =super.name
    constructor(name: String) :super(name);
    //可以进行覆盖
    override fun f1() {
        super.f1()
    }

    //
}

abstract class D{
    abstract fun a()

}

 interface E{
    fun a()

}

class F:D(),E{
    override fun a(){

    };

    //类中定义静态方法
    companion object sum{
        fun create():F=F();
    }
}


class G{
    val readOnlyColum="";//只读属性
    var rwCloum="";//可以读写的属性

    fun copyG(g:G):G{
        val tg=G();
        tg.rwCloum=g.rwCloum;
        return tg;
    }
}


class H{
    constructor(name: String,age: Int,address: String){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    var name=""
        set(value) {
            field=value//我去必须使用这个所谓的幕后字段进行字段赋值
        }
        get() = field;//只有get

    var age=0
        set(value) {
            field=value
        }
        get() = field;

    var address:String=""
        set(value) {
            field=value
        }
        get() = field
}

fun main2() {
    val h=H("a",1,"b");
    print(h.age)
    print(h.name)
    print(h.address)
}
//如果申明了 次构造函数 没有申明 主构造函数 那么 主构造函数 不存在
open class G1{
    constructor(name: String){

    }
    init {
        print("cs")
    }
}
//如果之类没有次构造函数 那么 父类 一定要指定构造函数 进行初始化
/**
 * 如果类中 没有申明 主构造函数 那么就会 有一个 无参的 构造函数 派生类 没有指定 父类 实现方法 就会使用 这个
 * 下面这个话有问提
 * 如果派生类没有主构造函数，那么每个次构造函数必须使用 super 关键字初始化其基类型，或委托给另一个构造函数做到这一点。
 * 注意，在这种情况下，不同的次构造函数可以调用基类型的不同的构造函数：
 *
 */
class G11:G1("a"){

}

fun  main(){
    G11();

}