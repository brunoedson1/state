package org.example;

public class RelatorioFinanceiro {
    private RelatorioFinanceiroEstado estado;
    private String conteudo;

    public RelatorioFinanceiro() {
        this.estado = new RelatorioFinanceiroEstadoPendente();
        this.conteudo = "";
    }

    public boolean enviarParaAnalise() {
        return estado.enviarParaAnalise(this);
    }
    public boolean aprovar() {
        return estado.aprovar(this);
    }
    public boolean rejeitar() {
        return estado.rejeitar(this);
    }
    public boolean publicar() {
        return estado.publicar(this);
    }

    public String getEstado() {
        return estado.getNomeEstado();
    }
    public void setEstado(RelatorioFinanceiroEstado novoEstado) {
        this.estado = novoEstado;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

