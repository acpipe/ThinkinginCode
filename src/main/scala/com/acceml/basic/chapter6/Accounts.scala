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

package com.acceml.basic.chapter6

/**
 * Created by Acceml on 2016/8/6.
 * Email: huminghit@gmail.com
 */
//类
class Accounts {
  val id = Accounts.newUniqueNumber()
  private var balance = 0.0

  def deposit(v: Double) = {
    balance += v
  }
}
//伴生对象，类和他的伴生对象，必须存在于同一个文件中
object Accounts {
  private var lastNumer = 0

  def newUniqueNumber() = {
    lastNumer += 1
    lastNumer
  }
}
