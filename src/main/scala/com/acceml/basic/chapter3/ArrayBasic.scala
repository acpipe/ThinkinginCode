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

package com.acceml.basic.chapter3

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Acceml on 2016/8/2.
 * Email: huminghit@gmail.com
 */
object ArrayBasic {

  def main(args: Array[String]) {
    val nums = new Array[Int](10)
    //全部初始化为0
    val s = new Array[String](10)
    //全部初始化为null
    val helloScala = Array("hello", "scala")
    //类型是推倒出来的
    println(helloScala(0) + " " + helloScala(1))
    //数组用() 访问  而不是[]
    val b = ArrayBuffer[Int]()
    //用 += 来追加元素
    b += 1
    b +=(2, 3, 4, 5, 6)
    b ++= ArrayBuffer(7, 8, 9, 10)
    println(b)

    for (i <- 0 until b.length) {
      print(b(i) + " ")
    }
    println()
    //上面实际上是调用下面的方法，数字也是有方法的
    for (i <- 0.until(b.length)) {
      print(b(i) + " ")
    }
    println()
    //隔两个元素跳一个
    for (i <- 0 until(b.length, 2)) {
      print(b(i) + " ")
    }
    println()

  }
}
