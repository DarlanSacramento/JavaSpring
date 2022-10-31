package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoasControler {

        private ListPessoasService listPessoas;

        public PessoasControler(ListPessoasService listPessoas) {
            this.listPessoas = listPessoas;
        }

        @RequestMapping(value = "/list", method = RequestMethod.GET)
        public Object listPessoas() throws Exception {
            var obj = listPessoas.execute();
            return new ResponseEntity<>(obj, HttpStatus.OK);
        }
    }
