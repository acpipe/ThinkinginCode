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

package com.hit.learn.thinkinginjava.innerclass.create;

/**
 * Created by Acceml on 2016/3/22.
 * Email: huminghit@gmail.com
 */
public class CreateInnerClass {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String lable;

        public Destination(String whereTo) {
            lable = whereTo;
        }

        String readLable() {
            return lable;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination destination = to(dest);
        System.out.println(destination.readLable());
    }

    public static void main(String[] args) {
        CreateInnerClass p = new CreateInnerClass();
        p.ship("huming");
        CreateInnerClass q = new CreateInnerClass();
        CreateInnerClass.Contents contents= q.contents();
        CreateInnerClass.Destination d = q.to("huming2");
    }
}
