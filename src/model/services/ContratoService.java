package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

import java.time.LocalDate;


public class ContratoService {
    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processoContrato(Contrato contrato, int meses) {
        double quantMinima = contrato.getValorTotal() / meses;
    }

}
