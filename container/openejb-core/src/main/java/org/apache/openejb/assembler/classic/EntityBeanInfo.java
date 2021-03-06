/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openejb.assembler.classic;

import java.util.ArrayList;
import java.util.List;

public class EntityBeanInfo extends EnterpriseBeanInfo {
    public String abstractSchemaName;
    public String primKeyClass;
    public String primKeyField;
    public String persistenceType;
    public String reentrant;
    public final List<String> cmpFieldNames = new ArrayList<String>();
    public final List<CmrFieldInfo> cmrFields = new ArrayList<CmrFieldInfo>();
    public int cmpVersion;
    public final List<QueryInfo> queries = new ArrayList<QueryInfo>();

    public EntityBeanInfo() {
        type = ENTITY;
    }

}
