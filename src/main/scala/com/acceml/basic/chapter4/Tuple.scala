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

package com.acceml.basic.chapter4

/**
 * Created by Acceml on 2016/8/4.
 * Email: huminghit@gmail.com
 */
object Tuple {
  def main(args: Array[String]) {
    val tuple = (1, 3.14, "hello")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    //使用模式匹配来获取tuple
    val (first, second, _) = tuple
    println(first)
    println(second)

    //拉链操作,可以用来把两个array合并成一个map
    val symbols = Array("huming", "hello", "world")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts).toMap
    println(pairs)

  }
}
