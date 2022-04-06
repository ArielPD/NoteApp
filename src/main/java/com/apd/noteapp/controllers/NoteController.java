package com.apd.noteapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class NoteController {

    @GetMapping("/notes")
    public ResponseEntity<Map<String, String>> readNotes() {
        Map<String, String> notes = new HashMap<>();
        notes.put("course1", "Java 11 spring boot");
        notes.put("course2", "Terraform with Ansible");
        notes.put("course3", "Full stack React & spring Boot");
        return new ResponseEntity<>(notes, HttpStatus.OK);
    }
}
