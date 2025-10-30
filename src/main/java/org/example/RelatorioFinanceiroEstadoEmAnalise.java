package org.example;

public class RelatorioFinanceiroEstadoEmAnalise implements RelatorioFinanceiroEstado {
    public String getNomeEstado() {
        return "Em Análise";
    }

    public boolean enviarParaAnalise(RelatorioFinanceiro relatorio) {
        return false;
    }
    public boolean aprovar(RelatorioFinanceiro relatorio) {
        relatorio.setEstado(new RelatorioFinanceiroEstadoAprovado());
        return true;
    }
    public boolean rejeitar(RelatorioFinanceiro relatorio) {
        relatorio.setEstado(new RelatorioFinanceiroEstadoRejeitado());
        return true;
    }
    public boolean publicar(RelatorioFinanceiro relatorio) {
        return false;
    }
}
