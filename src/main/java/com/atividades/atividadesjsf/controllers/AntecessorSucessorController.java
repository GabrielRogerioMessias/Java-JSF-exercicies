package com.atividades.atividadesjsf.controllers;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class AntecessorSucessorController {

    private Double number;
    private Double sucessor;
    private Double antecessor;

    public void calcularSucessorAnt(){
        sucessor = (number + 1);
        antecessor = (number - 1);
    }
}
