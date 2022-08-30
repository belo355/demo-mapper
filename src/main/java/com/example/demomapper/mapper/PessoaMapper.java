package com.example.demomapper.mapper;

import com.example.demomapper.domain.Pessoa;
import com.example.demomapper.domain.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
    Pessoa toMapperPessoa(PessoaDTO pessoaDTO);
    PessoaDTO toMapperPessoaDto(Pessoa pessoa);
}
