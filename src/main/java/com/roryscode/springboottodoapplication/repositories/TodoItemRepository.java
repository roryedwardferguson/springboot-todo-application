package com.roryscode.springboottodoapplication.repositories;

import com.roryscode.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
