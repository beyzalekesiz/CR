package com.commonroom.commonroom_backend.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToDoItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public static void main(String args[]){
        System.out.println("hello world");
    }

    private String title;
    private boolean done;


}
