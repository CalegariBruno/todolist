package com.example.todolist.controllers;

import com.example.todolist.domain.Tarefa;
import com.example.todolist.dtos.TarefaDTO;
import com.example.todolist.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody TarefaDTO tarefaDTO){
        Tarefa novaTarefa = new Tarefa(tarefaDTO);
        repository.save(novaTarefa);
        return new ResponseEntity<>(novaTarefa, HttpStatus.CREATED);
    }

}
