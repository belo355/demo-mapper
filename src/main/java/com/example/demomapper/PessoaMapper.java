package com.example.demomapper;

import com.example.demomapper.domain.Pessoa;
import com.example.demomapper.domain.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
    Pessoa toMapperPessoa(PessoaDTO pessoaDTO);
    PessoaDTO toMapperPessoaDto(Pessoa pessoa);
}
