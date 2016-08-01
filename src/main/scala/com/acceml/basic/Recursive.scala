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

package com.acceml.basic

/**
 * Created by Acceml on 2016/8/1.
 * Email: huminghit@gmail.com
 */
/**
 * 循环
 */
object Recursive {
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      println(i)
      //i 是什么类型？var,val 都不是  是集合的元素类型
    }
    printf("----------------")
    for (i <- 1 until 5) {
      println(i)
      //到4
    }
    var sum =0
    for (i <- 0 to 10) {
      sum += i
    }
    printf("0+1+...+10=%d", sum)
    //没有break 和 continue

    printf("----Advance-------")

  }
}
