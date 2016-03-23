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

package com.hit.learn.thinkinginjava.innerclass.usethisandnew;

/**
 * Created by Acceml on 2016/3/23.
 * Email: huminghit@gmail.com
 */
class DotThis {

    public void f() {
        System.out.println("f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String [] args) {
        DotThis dotThis=new DotThis();
        DotThis.Inner inner=dotThis.inner();
        inner.outer().f();
    }
}
