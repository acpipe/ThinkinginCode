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

package com.acceml.basic.chapter6.prcatice

/**
 * Created by Acceml on 2016/8/7.
 * Email: huminghit@gmail.com
 */
/**
 * 扩展过app的直接有main函数，不用定义
 */
object Card extends Enumeration with App {
  val M = Value("♣")
  val T = Value("♠")
  val H = Value("♥")
  val F = Value("♦")
  println(Card.M)
  println(Card.T)
  println(Card.H)
  println(Card.F)
  isRed(Card.H)

  def isRed(c: Card.Value) {
    if (c == Card.M || c == Card.T) println("black") else println("red")
  }

}
