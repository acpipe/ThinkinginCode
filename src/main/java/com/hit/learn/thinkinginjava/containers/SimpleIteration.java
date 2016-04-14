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

package com.hit.learn.thinkinginjava.containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Acceml on 2016/4/14.
 * Email: huminghit@gmail.com
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String p = it.next();
            System.out.println(p);
        }
        for (String p : list) {
            System.out.println(p);
        }
        it=list.iterator();
        for(int i=0;i<5;i++) {
            it.next();
            it.remove();
        }
        System.out.println(list.toString());
    }
}
