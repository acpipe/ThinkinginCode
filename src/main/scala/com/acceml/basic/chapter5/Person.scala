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
class Person {
  var age = 0
  //公有字段，如果是私有字段的话，age age_= （相当于java中的getter 方法和 setter方法）也是私有的
  private var privateAge = 0
  //自定义getter setter方法
  def pAge = privateAge

  def pAge_(v: Int) = {
    if (v > privateAge) privateAge = v
  }
}
