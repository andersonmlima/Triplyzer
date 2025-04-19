package com.anderson.triplyzer.controller;

import com.anderson.triplyzer.domain.Roteiro;
import com.anderson.triplyzer.dto.response.ValorPassagemDTO;
import com.anderson.triplyzer.service.PrecoService;
import com.anderson.triplyzer.service.RoteiroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("roteiro")
public class RoteiroController {
    private final RoteiroService roteiroService;
    private final PrecoService precoService;

    public RoteiroController(RoteiroService roteiroService, PrecoService precoService) {
        this.roteiroService = roteiroService;
        this.precoService = precoService;
    }
    @GetMapping
    public ResponseEntity<List<Roteiro>> listarRoteiros() {
        List<Roteiro> roteiros = roteiroService.listarTodos();
        return ResponseEntity.ok(roteiros);
    }
    @PostMapping
    public ResponseEntity<Roteiro> adicionarRoteiro(@RequestBody Roteiro roteiro) {
        Roteiro novoRoteiro = roteiroService.salvar(roteiro);
        return ResponseEntity.ok(novoRoteiro);
    }
    @GetMapping("preco")
    public ResponseEntity<ValorPassagemDTO> listarValorPassagem(@PathVariable("id") String id) {
        return roteiroService.buscarPorId(id).map(roteiro -> {
            ValorPassagemDTO valorDTO = precoService.calcularValorPorCidade(roteiro.getCidade());
            return ResponseEntity.ok(valorDTO);
        }).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
