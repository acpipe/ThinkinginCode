/*
 * Copyright (c) 2016. The Acceml.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.acceml.basic.chapter2

/**
 * Created by Acceml on 2016/8/1.
 * Email: huminghit@gmail.com
 */
object Function {
  //必需指出参数的类型，返回类型可以根据表达式的类型去推测
  def abs(x: Double) = if (x >= 0) x else -x

  //返回值为最后一条语句
  def fac(n: Int) = {
    var x = 2
    for (i <- 1 to 4) {
      x = i * x
    }
    x
  }

  //默认参数
  def decorate(str: String, left: String = "{", right: String = "}") = {
    left + str + right
  }

  //变长参数
  def sum(args: Int*) = {
    var res = 0
    for (tmp <- args) res += tmp
    res
  }

  //不返回值的函数叫做过程，注意花括号前面没有等号
  def sayHello(s: String): Unit = {
    println("hello :" + s)
  }

  def main(args: Array[String]) {
    println(abs(-1))
    println(fac(1))
    println(decorate("hello,world!"))
    println(decorate("hello,world!", "[", "]"))
    println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(sum(1, 2, 3, 4, 5))
    sayHello("acceml")
  }
}
