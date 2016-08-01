package com.acceml.basic

//object 就是单例的class

object PrintAndDefine {
  def main(args: Array[String]) {
    val x = 1
    var y = 2

    //! x = 3,是错误的，val不允许改变
    val a = if (x > 0) 1 else -1
    //if 表达式也是有值的
    println(a)
    val b = if (x > 0) "hello" else -1
    println(b)
    //any 类型
    val c = if (x > 0) 1 else ()
    println(c)
    //缺省类型
    val d = {
      val dx = x
      x * x
    }
    println(d)
    //{}最后一个表达式的值是这个语句块的值
    val e = {
      val dx = x
      val ddx = x * x
    }
    println(e)
    //没有值的，或者最后一个值是unit 所以打印出()
    printf("a:%d,b:%s\n", a, b)
    //c风格的打印
  }
}