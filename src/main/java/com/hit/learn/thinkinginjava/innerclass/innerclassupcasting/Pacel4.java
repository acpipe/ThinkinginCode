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

package com.hit.learn.thinkinginjava.innerclass.innerclassupcasting;

/**
 * Created by Acceml on 2016/3/23.
 * Email: huminghit@gmail.com
 */
class Pacel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int valur() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readTable() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
