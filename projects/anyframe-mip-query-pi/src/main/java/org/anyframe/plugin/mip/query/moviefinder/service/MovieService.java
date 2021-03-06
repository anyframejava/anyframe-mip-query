/*
 * Copyright 2008-2012 the original author or authors.
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
package org.anyframe.plugin.mip.query.moviefinder.service;

import org.anyframe.mip.query.service.MiPService;

import com.tobesoft.platform.data.Dataset;
import com.tobesoft.platform.data.DatasetList;
import com.tobesoft.platform.data.VariableList;

/**
 * This MovieService class is an Interface class to provide movie crud
 * functionality.
 * 
 * @author Jonghoon Kim
 */
public interface MovieService extends MiPService {

	public void getList(VariableList inVl, DatasetList inDl, VariableList outVl, DatasetList outDl) throws Exception;

	public void saveAll(VariableList inVl, DatasetList inDl, VariableList outVl, DatasetList outDl) throws Exception;

	public void create(Dataset ds) throws Exception;
}
