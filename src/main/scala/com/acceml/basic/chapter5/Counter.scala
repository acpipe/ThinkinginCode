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

package com.acceml.basic.chapter5

/**
 * Created by Acceml on 2016/8/6.
 * Email: huminghit@gmail.com
 */
//不生明为public
class Counter {
  private var value = 0
  val name = "huming"
  //不能修改，相当于final
  //必须赋值
  def increament() {
    value += 1
  }
  //这个返回 Unit

  def current() = value
  //函数可以赋值
//  有3种方式处理：
//  var foo : scala 自动生成getter和setter方法
//  val foo : scala 自动生成gettter方法。类似于java中的final字段
//  自定义foo foo_方法

}

