package com.example.demomapper.controller;

import com.example.demomapper.domain.Pessoa;
import com.example.demomapper.domain.dto.PessoaDTO2;
import com.example.demomapper.mapper.PessoaMapperDiff;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PessoaControllerTest {

    @Autowired
    private final PessoaMapperDiff mapper;

    public PessoaControllerTest() {
        this.mapper = Mockito.mock(PessoaMapperDiff.class); 
    }


//    @Test
//    void shouldMapperRequestWithDiffParams() {
//        PessoaDTO2 dto = new PessoaDTO2();
//        dto.setNome("Ana");
//        dto.setHasConhecimentos(true);
//
//        Pessoa entity = mapper.toMapperPessoa(dto);
//
//        assertEquals(dto.getNome(), entity.getNome());
//        assertEquals(dto.getHasConhecimentos(), entity.getManja());
//    }
}