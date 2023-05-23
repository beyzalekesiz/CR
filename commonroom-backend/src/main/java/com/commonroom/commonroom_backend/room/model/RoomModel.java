package com.commonroom.commonroom_backend.room.model;

import com.commonroom.commonroom_backend.user.model.UsersModel;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class RoomModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomID;

    @Column(name = "roomName")
    private String name;

    @Column(name = "capacity")
    private int capacity;

    //One room can contain many users
    @OneToMany(mappedBy = "room", cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true)
    private Set<UsersModel> products = new LinkedHashSet<>();




}
