import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Teste da classe agenda
 */
public class TestAgenda {

    private static Agenda agenda;
    private static Compromisso compromisso;  

    @BeforeAll
    public static void criarAgenda() throws ParseException{
        agenda = new Agenda();
        compromisso = new Compromisso("Aniversário do Thiago", "10/12/2022");
    }

    @Test
    public void verificaSeAAagendaEstaVazia() {
        assertEquals(0, agenda.size());
    }

    @Test
    public void testandoAdicaoDeUmCompromisso() throws ParseException{
       agenda.AddCompromisso(compromisso, 0, 0);
       assertTrue(new Compromisso("Aniversário do Thiago", "10/12/2022").equals(agenda.getCompromissos("10/12/2022", "10/12/2022").get(0)));
    }

}
