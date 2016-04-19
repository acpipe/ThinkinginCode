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

package com.hit.learn.thinkinginjava.container.iterator;

import java.util.*;

/**
 * Created by Acceml on 2016/4/14.
 * Email: huminghit@gmail.com
 */
class CrossContainerIteration {

    public static <T> void display(Iterator<T> it) {
        while(it.hasNext()) {
            T p=it.next();
            System.out.print(p.toString());
        }
        System.out.println();
    }

    public static void main(String [] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(String.valueOf(i));
        }
        LinkedList<String> linkList=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkList.add(String.valueOf(i));
        }
        HashSet<String> hashSet=new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(String.valueOf(i));
        }
        TreeSet<String> treeSet=new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            treeSet.add(String.valueOf(i));
        }
        display(arrayList.iterator());
        display(linkList.iterator());
        display(treeSet.iterator());
        display(hashSet.iterator());
    }
}
