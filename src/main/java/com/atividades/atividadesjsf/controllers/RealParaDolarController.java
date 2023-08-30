package com.atividades.atividadesjsf.controllers;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class RealParaDolarController {
    private Double real;
    private Double vlrDolar = 4.87;
    private Double conver;

    public void converter() {
        conver = real / vlrDolar;
    }
}
