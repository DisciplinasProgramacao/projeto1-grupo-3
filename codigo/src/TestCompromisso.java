import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.text.ParseException;


public class TestCompromisso {
    @Test
    public void criarCerto() throws ParseException {
        Compromisso compromisso = new Compromisso("Meu aniversario", "20/04/2003");
        Assert.assertEquals(compromisso.getNome(), "Meu aniversario");
        Assert.assertEquals(compromisso.getDataCompromisso().dataEmString(), "20/04/2003");
    }

    @Test
    public void criarCertoVazio() throws ParseException {
        Compromisso compromisso = new Compromisso();
        Assert.assertEquals(compromisso.getNome(), "Não Iniciado");
        Assert.assertEquals(compromisso.getDataCompromisso().dataEmString(), "01/01/2022");
    }

}
