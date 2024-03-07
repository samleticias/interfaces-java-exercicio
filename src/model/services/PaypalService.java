package model.services;

public class PaypalService implements PagamentoOnlineService {
    private static final double PORCENTAGEM_TAXA = 0.02;
    private static final double JUROS_MENSAL = 0.01;

    @Override
    public double taxaPagamento(double quantia) {
        return quantia * PORCENTAGEM_TAXA;
    }

    @Override
    public double juros(double quantia, int meses) {
        return quantia * JUROS_MENSAL * meses;
    }
}
