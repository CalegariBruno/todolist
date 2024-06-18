package com.example.todolist.domain;

import com.example.todolist.dtos.TarefaDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String descricao;

    public Tarefa (TarefaDTO dto){
        this.descricao = dto.descricao();
        this.titulo = dto.titulo();
    }

}
