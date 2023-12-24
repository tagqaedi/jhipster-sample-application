package com.edi.sea.repository;

import com.edi.sea.model.TodoList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository
  extends PagingAndSortingRepository<TodoList, Long> {}
