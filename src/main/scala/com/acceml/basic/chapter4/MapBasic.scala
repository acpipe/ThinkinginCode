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
object MapBasic {
  def main(args: Array[String]) {
    //定义，减去一个新的，然后得到
    val scores = Map("vczh" -> 1, "huming" -> 2, "chenbiren" -> 3)
    val newScores = scores - "vczh"

    val mutableMap = scala.collection.mutable.Map("vczh" -> 1, "huming" -> 2, "chenbiren" -> 3)
    mutableMap += ("Bob" -> 4)
    mutableMap -= "Bob"
    //声明的时候需要指定类型
    val nullMap = new scala.collection.mutable.HashMap[String, Int]

    //如果不存在会抛出异常
    val vczh = scores("vczh")
    println(vczh)

    //可以用contain来判断是否包含
    var humingScore = if (scores.contains("huming")) scores("huming") else 0
    println(humingScore)
    //等价写法，这种写法更简洁
    humingScore = scores.getOrElse("huming", 0)
    println(humingScore)

    //遍历,利用for循环生成器翻转
    for (v <- mutableMap) println(v)
    val convertMutableMap = for ((k, v) <- mutableMap) yield (v, k)
    for (v <- convertMutableMap) println(v)
  }
}
