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

package com.hit.learn.thinkinginjava.Arrays;

import com.hit.learn.thinkinginjava.exception.example.ex9.Strike;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Acceml on 2016/5/3.
 * Email: huminghit@gmail.com
 */
public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere [] sphere=new BerylliumSphere[10];
        for(int i=0;i<5;i++) {
            sphere[i] = new BerylliumSphere();
        }
        System.out.printf(Arrays.toString(sphere));
    }
}
