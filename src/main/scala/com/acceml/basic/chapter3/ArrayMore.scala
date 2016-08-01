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
object ArrayMore {
  def main(args: Array[String]) {
    val a = Array(1, 2, 3, 4, 5)

    var res = for (elem <- a) yield 2 * elem
    //利用for循环推导式产生一个新的数组
    for (elem <- res) {
      print(elem + " ")
    }
    println()
    //使用守卫
    res = for (elem <- a if elem % 2 == 0) yield 3 * elem
    for (elem <- res) {
      print(elem + " ")
    }
    println()
    //使用filter and map，推荐
    res = a.filter(_ % 2 == 0).map(3 * _)
    for (elem <- res) {
      print(elem + " ")
    }
    println()
    //practice filter 和map
    println(ArrayBuffer(1, 2, 3, 4, 5).sum)
  }
}
