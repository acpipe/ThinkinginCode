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

package com.hit.learn.thinkinginjava.concurrency.sync;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Acceml on 2016/6/21.
 * Email: huminghit@gmail.com
 */
class CriticalSection {
    static void testApproaches(PairManager pairManager1, PairManager pairManager2) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        PairManipulator pm1 = new PairManipulator(pairManager1);
        PairManipulator pm2 = new PairManipulator(pairManager2);

        PairChecker pairChecker1 = new PairChecker(pairManager1);
        PairChecker pairChecker2 = new PairChecker(pairManager2);

        executorService.execute(pm1);

    }
}
