/**
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.netflix.conductor.tests.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.netflix.conductor.common.metadata.events.EventExecution;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskExecLog;
import com.netflix.conductor.common.run.SearchResult;
import com.netflix.conductor.common.run.Workflow;
import com.netflix.conductor.core.events.queue.Message;
import com.netflix.conductor.dao.IndexDAO;

/**
 * @author Viren
 *
 */
public class MockIndexDAO implements IndexDAO {

	@Override
	public void index(Workflow workflow) {
	}

	@Override
	public SearchResult<String> searchWorkflows(String query, String freeText, int start, int count, List<String> sort) {
		return new SearchResult<>(0, new ArrayList<>());
	}
	
	@Override
	public void remove(String workflowId) {
	}
	
	@Override
	public void update(String workflowInstanceId, String key, Object value) {
		
	}
	@Override
	public void index(Task task) {
		
	}
	
	@Override
	public void add(TaskExecLog log) {
	}
	
	@Override
	public void add(EventExecution ee) {
		
	}
	
	@Override
	public void addMessage(String queue, Message msg) {
		
	}
	
	@Override
	public SearchResult<Map<String, Object>> searchEvents(String freeText, int start, int count, List<String> sort) {
		return null;
	}
}
