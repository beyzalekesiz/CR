package com.commonroom.commonroom_backend.todo.repository;

import com.commonroom.commonroom_backend.todo.model.ToDoItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
ToDoRepository extends JpaRepository<ToDoItemModel,Long> {
}
