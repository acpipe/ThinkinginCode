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

package com.acceml.basic.chapter4.practice

/**
 * Created by Acceml on 2016/8/6.
 * Email: huminghit@gmail.com
 */
object DateMap {
  def main(args: Array[String]) {
    val weekMap = new scala.collection.mutable.LinkedHashMap[String, Int]()
    val week = Array("Monday", "Sunday")
    val javaWeek = Array(java.util.Calendar.MONDAY,
      java.util.Calendar.SATURDAY)
    for (i <- 0 until week.length) yield {
      weekMap += (week(i) -> javaWeek(i))
    }
    //for循环似乎总是和yield一起用，实际上，我的理解是，有返回值的就用yield，没有返回值的就用普通的遍历就可以了。
    //如果返回值不好在yield中生成，那么就用普通的遍历赋值，返回的类型是受for 和yield中间的语句类型限制的，比如本例只能返回一个vertor.
    println(weekMap.mkString(","))
  }
}
