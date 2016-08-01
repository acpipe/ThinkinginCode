//object 就是单例的class
object Hello {
  def main(args: Array[String]) {
    val x = 1
    val a = if (x > 0) 1 else -1
    //if 表达式也是有值的
    println(a)
    val b = if (x > 0) "hello" else -1
    println(b)
    //any 类型
    val c = if (x > 0) 1 else ()
    println(c)
    //缺省类型
  }
}