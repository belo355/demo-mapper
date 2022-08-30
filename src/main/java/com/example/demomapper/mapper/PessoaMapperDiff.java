package com.example.demomapper.mapper;

import com.example.demomapper.domain.Pessoa;
import com.example.demomapper.domain.dto.PessoaDTO2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PessoaMapperDiff {

    @Mapping(target="nome", source="pessoa.nome")
    @Mapping(target="hasConhecimentos", source="pessoa.manja")
    PessoaDTO2 toMapperPessoaDto(Pessoa pessoa);

    @Mapping(target="nome", source="dto.nome")
    @Mapping(target="manja", source="dto.hasConhecimentos")
    Pessoa toMapperPessoa(PessoaDTO2 dto);
}
