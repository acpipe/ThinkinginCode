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
 * Created by Acceml on 2016/3/26.
 * Email: huminghit@gmail.com
 */
public class Pacel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Pacel6 p = new Pacel6();
        p.track();
    }
}
