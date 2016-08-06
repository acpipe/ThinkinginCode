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
class BeanProperty {
  @BeanProperty var name : String = _
//  生成四个方法：
//  name:String
//  name_ = (v : String) : Unit
//  getName() :String
//  setName(v : String) :Unit
}
