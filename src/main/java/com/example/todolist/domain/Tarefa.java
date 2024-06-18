package com.example.todolist.domain;

import com.example.todolist.dtos.TarefaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;

    private String descricao;

    public Tarefa (TarefaDTO dto){
        this.descricao = dto.descricao();
        this.titulo = dto.titulo();
    }

}
