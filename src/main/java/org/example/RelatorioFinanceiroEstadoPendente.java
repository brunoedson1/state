package org.example;

public class RelatorioFinanceiroEstadoPendente implements RelatorioFinanceiroEstado {
    public String getNomeEstado() {
        return "Pendente";
    }

    public boolean enviarParaAnalise(RelatorioFinanceiro relatorio) {
        relatorio.setEstado(new RelatorioFinanceiroEstadoEmAnalise());
        return true;
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

