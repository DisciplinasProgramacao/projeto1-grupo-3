import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCompromisso {
    @Test
    public void criarCompromisso() throws ParseException {
        Compromisso compromisso = new Compromisso("Meu aniversario", "20/04/2003");
        assertEquals(compromisso.getNome(), "Meu aniversario");
        assertTrue(compromisso.getDataCompromisso().isEqual(LocalDate.of(2003, 04, 20)));
    }

    @Test
    public void criarCompromissoVazio() throws ParseException {
        Compromisso compromisso = new Compromisso();
        assertEquals(compromisso.getNome(), "Não Iniciado");
        assertTrue(compromisso.getDataCompromisso().isEqual(LocalDate.of(2022, 01, 01)));
    }

}
