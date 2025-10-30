package org.example;

public class RelatorioFinanceiroEstadoPublicado implements RelatorioFinanceiroEstado {
    public String getNomeEstado() {
        return "Publicado";
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
        return false;
    }
}
