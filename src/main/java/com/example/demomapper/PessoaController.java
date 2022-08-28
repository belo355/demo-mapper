package com.example.demomapper;

import com.example.demomapper.domain.Pessoa;
import com.example.demomapper.domain.PessoaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaMapper mapper;

    @GetMapping("/{nome}")
    public ResponseEntity<PessoaDTO> getPessoa(@PathVariable String nome) {
        List<Pessoa> listPessoas = createListPessoas();
        listPessoas.removeIf(p -> !p.getNome().equalsIgnoreCase(nome));
        if (listPessoas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        PessoaDTO pessoaDTO = mapper.toMapperPessoaDto(listPessoas.get(0));
        return ResponseEntity.ok(pessoaDTO);
    }

    private List<Pessoa> createListPessoas() {
        List<Pessoa> pessoaList = new ArrayList<>();
        pessoaList.add(new Pessoa("Ana",10, true));
        pessoaList.add(new Pessoa("Bea",200, false));
        pessoaList.add(new Pessoa("Cah",55, true));
        return pessoaList;
    }
}
