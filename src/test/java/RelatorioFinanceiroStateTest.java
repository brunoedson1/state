import org.example.RelatorioFinanceiro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelatorioFinanceiroStateTest {

    @Test
    public void testEstadoInicialPendente() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        assertEquals("Pendente", relatorio.getEstado());
    }

    @Test
    public void testEnviarParaAnalise() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        boolean enviado = relatorio.enviarParaAnalise();
        assertTrue(enviado);
        assertEquals("Em Análise", relatorio.getEstado());
    }

    @Test
    public void testAprovarDepoisDeAnalise() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.enviarParaAnalise();
        boolean aprovado = relatorio.aprovar();
        assertTrue(aprovado);
        assertEquals("Aprovado", relatorio.getEstado());
    }

    @Test
    public void testRejeitarDepoisDeAnalise() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.enviarParaAnalise();
        boolean rejeitado = relatorio.rejeitar();
        assertTrue(rejeitado);
        assertEquals("Rejeitado", relatorio.getEstado());
    }

    @Test
    public void testPublicarDepoisAprovado() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.enviarParaAnalise();
        relatorio.aprovar();
        boolean publicado = relatorio.publicar();
        assertTrue(publicado);
        assertEquals("Publicado", relatorio.getEstado());
    }

    @Test
    public void testRejeitadoVoltaParaAnalise() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.enviarParaAnalise();
        relatorio.rejeitar();
        assertEquals("Rejeitado", relatorio.getEstado());

        boolean enviadoNovamente = relatorio.enviarParaAnalise();
        assertTrue(enviadoNovamente);
        assertEquals("Em Análise", relatorio.getEstado());
    }

    @Test
    public void testOperacoesInvalidasRetornamFalse() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();

        // Ainda pendente, não pode aprovar nem publicar
        assertFalse(relatorio.aprovar());
        assertFalse(relatorio.publicar());
        assertFalse(relatorio.rejeitar());

        // Envie para análise para testar outras inválidas
        relatorio.enviarParaAnalise();

        // Já em análise, não pode reenviar para análise ou publicar ainda
        assertFalse(relatorio.enviarParaAnalise());
        assertFalse(relatorio.publicar());
    }

}

