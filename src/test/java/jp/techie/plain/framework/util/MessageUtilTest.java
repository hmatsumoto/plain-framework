/*
 * Copyright 2012 Project UNKONW.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.techie.plain.framework.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * MessageUtilTest
 * 
 * @author bose999
 *
 */
public class MessageUtilTest {
    /**
     * messages.properties値取得テスト<br />
     * 設定通りの値が返ってくるか？
     */
    @Test
    public void testGetMessage(){
        assertEquals(MessageUtil.getMessage("actionServletTimeoutValueErrorMessage"),"Missing ActionServlet timeout.");
    }
}
