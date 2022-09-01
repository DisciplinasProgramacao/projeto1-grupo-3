import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompromisso {
    @Test
    public void criarCerto() throws ParseException {
        Compromisso compromisso = new Compromisso("Meu aniversario", "20/04/2003");
        assertEquals(compromisso.getNome(), "Meu aniversario");
        assertEquals(compromisso.getDataCompromisso().dataEmString(), "20/04/2003");
    }

    @Test
    public void criarCertoVazio() throws ParseException {
        Compromisso compromisso = new Compromisso();
        assertEquals(compromisso.getNome(), "Não Iniciado");
        assertEquals(compromisso.getDataCompromisso().dataEmString(), "01/01/2022");
    }

}
