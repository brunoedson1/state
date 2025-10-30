package org.example;

public class RelatorioFinanceiroEstadoAprovado implements RelatorioFinanceiroEstado {
    public String getNomeEstado() {
        return "Aprovado";
    }

    public boolean enviarParaAnalise(RelatorioFinanceiro relatorio) {
        return false;
    }
    public boolean aprovar(RelatorioFinanceiro relatorio) {
        return false;
    }
    public boolean rejeitar(RelatorioFinanceiro relatorio) {
        return false;
    }
    public boolean publicar(RelatorioFinanceiro relatorio) {
        relatorio.setEstado(new RelatorioFinanceiroEstadoPublicado());
        return true;
    }
}
