package com.atividades.atividadesjsf.controllers;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class CalcularBTUController {
    private Double areaComodo;
    private Double fontesCalor;
    private Double totBTU;
    public void calcularBTU(){
        totBTU = (600 * areaComodo) + (300 * fontesCalor);
    }
}
