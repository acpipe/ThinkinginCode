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

package com.acceml.basic.chapter6.apply

/**
 * Created by Acceml on 2016/8/7.
 * Email: huminghit@gmail.com
 */
//这里的private什么意思：私有主构造器
class Account private(val id: Int, init: Double) {
  private var balance = init
}

//伴生对象,主要是为了解决静态方法调用的问题的，而不用new 就产生一个对象，实际上就是调用apply方法，通常的做法是在apply中new 对象
object Account {
  private var lastNumer = 0

  def newUniqueNumber() = {
    lastNumer += 1
    lastNumer
  }

  def apply(init: Double) = {
    new Account(newUniqueNumber(), init)
  }

  def main(args: Array[String]) {
    val acct = Account(100.0)
  }
}