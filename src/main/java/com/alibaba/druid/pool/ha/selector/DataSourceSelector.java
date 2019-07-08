/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.pool.ha.selector;

import javax.sql.DataSource;

/**
 * Interface for those selector to implement.
 * e.g. Random and Named
 *
 * @author DigitalSonic
 */
public interface DataSourceSelector {
	/**
	 * 选取一个数据源
	 * 
	 * @return 返回被选取的数据源
	 */
    DataSource get();

	/**
	 * 设置指定的数据源名称（目前主要再‘按名称’选择策略中）
	 * 
	 * @param name
	 *            设置你想选取的数据源的名称
	 */
    void setTarget(String name);

	/**
	 * 返回选举器的名称
	 * 
	 * @return 当前选举器的名称
	 */
	String getName();

	/**
	 * 用于选举器需要的初始化操作
	 */
    void init();
}
