package com.example.infobipApiTest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.infobipApiTest.responses.GenericResponse;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "v1/")
@SuppressWarnings("rawtypes")
public class ChatBot {

    @GetMapping("test")
    public ResponseEntity test() {
        return ResponseEntity.ok(new GenericResponse("200", "ok"));
    }

}
