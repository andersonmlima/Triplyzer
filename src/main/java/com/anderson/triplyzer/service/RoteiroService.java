package com.anderson.triplyzer.service;

import com.anderson.triplyzer.domain.Roteiro;
import com.anderson.triplyzer.repository.RoteiroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RoteiroService {
    private final RoteiroRepository roteiroRepository;

    public RoteiroService(RoteiroRepository roteiroRepository) {
        this.roteiroRepository = roteiroRepository;
    }
    public List<Roteiro> listarTodos() {
        return roteiroRepository.findAll();
    }
    public Optional<Roteiro> buscarPorId(String id) {
        return roteiroRepository.findById(id);
    }
    public Roteiro salvar(Roteiro roteiro) {
        return roteiroRepository.save(roteiro);
    }
    public void remover(Roteiro roteiro) {
        roteiroRepository.delete(roteiro);
    }
}
