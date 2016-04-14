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

package com.hit.learn.thinkinginjava.concurrency.thread.volatileandstatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Acceml on 2016/3/20.
 * Email: huminghit@gmail.com
 */
public class StaticClass implements Runnable {

    public static int i = 0;

    @Override
    public void run() {
        i += 2;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        StaticClass staticClass = new StaticClass();
        while (true) {
            executorService.execute(staticClass);
            System.out.println(StaticClass.i);
            if (StaticClass.i % 2 != 0) {
                System.exit(0);
            }
        }
    }
}
