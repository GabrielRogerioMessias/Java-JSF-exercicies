package com.atividades.atividadesjsf.controllers;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class ConverterTempoController {
    private Integer horas = 0;
    private Integer minutos = 0;
    private Integer segundos = 0 ;
    private Integer totSegundos = 0;

    public void converterTempo() {
        totSegundos = (horas * 3600) + (minutos * 60) + segundos;
    }
}
