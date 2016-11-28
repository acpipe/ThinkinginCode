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

import java.io.File
import java.util.Scanner

/**
 * Created by Acceml on 2016/8/5.
 * Email: huminghit@gmail.com
 */
/**
 * Practice 2
 */
object WordCount {
  def main(args: Array[String]) {
    val in = new Scanner(new File("G:\\learn\\project\\git\\Thinkinginjava\\src\\main\\scala\\com\\acceml\\basic\\chapter4\\practice\\myfile.txt"))
    val mutableMap = scala.collection.mutable.Map[String, Int]()
    while (in.hasNext) {
      val text = in.next()
      val splitedText = text.split(" ")
      for (word <- splitedText) {
        mutableMap.put(word, mutableMap.getOrElse(word, 0) + 1)
      }
    }
    print(mutableMap)
  }
}
