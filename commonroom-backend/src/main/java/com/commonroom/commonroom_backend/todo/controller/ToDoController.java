package com.commonroom.commonroom_backend.todo.controller;

import com.commonroom.commonroom_backend.todo.model.ToDoItemModel;
import com.commonroom.commonroom_backend.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(path ="/getToDoItems", method = RequestMethod.GET)
    public List<ToDoItemModel> getToDoItems() {
        List<ToDoItemModel> items = toDoService.findAll();
        return items;
    }

   // @PostMapping(path = "/")

}
