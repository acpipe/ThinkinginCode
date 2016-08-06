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
 * Created by Acceml on 2016/8/5.
 * Email: huminghit@gmail.com
 */

/**
 * Practice 1
 */
object price {
  def main(args: Array[String]) {
    val a = Map("A" -> 15, "B" -> 20, "C" -> 25)
    val aa = for ((k, v) <- a) yield (k, v * 0.9)
    println(a)
    println(aa)
  }
}
