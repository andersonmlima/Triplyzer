package com.anderson.triplyzer.service;

import com.anderson.triplyzer.dto.response.ValorPassagemDTO;
import org.springframework.stereotype.Service;

@Service
public class PrecoService {

    public ValorPassagemDTO calcularValorPorCidade (String cidade) {
        double valorMedioPassagem = 2500.0;
        double valorMedioMilhas = valorMedioPassagem * 0.60;
        return new ValorPassagemDTO(valorMedioPassagem, valorMedioMilhas);
    }
}
