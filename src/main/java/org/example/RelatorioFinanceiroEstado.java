package org.example;

public interface RelatorioFinanceiroEstado {
    String getNomeEstado();
    boolean enviarParaAnalise(RelatorioFinanceiro relatorio);
    boolean aprovar(RelatorioFinanceiro relatorio);
    boolean rejeitar(RelatorioFinanceiro relatorio);
    boolean publicar(RelatorioFinanceiro relatorio);
}

