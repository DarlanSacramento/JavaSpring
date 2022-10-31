package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ListPessoasService {

   @Autowired
    private PessoasRepository rep;


    public Object execute() throws Exception {
        return rep.findAllPessoas();
    }

}
