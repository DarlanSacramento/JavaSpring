package com.example.demo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="pessoas")
public class PessoaEntity {

    @Id
    private String cpf;

    @Column(nullable = false)
    private String nome;

}