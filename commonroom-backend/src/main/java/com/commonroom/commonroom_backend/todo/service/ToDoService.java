package com.commonroom.commonroom_backend.todo.service;

import com.commonroom.commonroom_backend.todo.model.ToDoItemModel;
import com.commonroom.commonroom_backend.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDoItemModel> findAll() {
        return toDoRepository.findAll();
    }
}
