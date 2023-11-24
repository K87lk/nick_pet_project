package com.example.nickpetproject.controller;

import com.example.nickpetproject.entity.Group;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GroupController {

    @GetMapping("/groups")
    public void getGroup() {
        System.out.println("GET");
    }

    @PostMapping("/groups-create")
    public Group addGroup(@RequestBody Group group) {
        System.out.println("Group created");
        return group;
    }
}
