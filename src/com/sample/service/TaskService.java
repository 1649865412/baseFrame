/**
 *  code generation
 */
package com.sample.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.sample.entity.Task;
import com.base.util.dwz.Page;

public interface TaskService {
	Task get(Long id);

	void saveOrUpdate(Task task);

	void delete(Long id);
	
	List<Task> findAll(Page page);
	
	List<Task> findByExample(Specification<Task> specification, Page page);
}
