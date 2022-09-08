import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Teste da classe agenda
 */
public class TestAgenda {

    private static Agenda agenda;

    @BeforeAll
    public static void criarAgenda() throws ParseException{
        agenda = new Agenda();
        
    }

    @Test
    public void verificaSeAAagendaEstaVazia() {
        assertEquals(0, agenda.size());
    }

    @Test
    public void testandoAdicaoDeUmCompromisso() throws ParseException{
       Compromisso compromisso = new Compromisso("Aniversário do Thiago", "10/12/2022");
       agenda.AddCompromisso(compromisso, 0, 0);
       assertTrue(new Compromisso("Aniversário do Thiago", "10/12/2022").equals(agenda.getCompromissos("10/12/2022", "10/12/2022").get(0)));
    }

    @Test
    public void testaAdicaoDeEventoPeriodoco() throws ParseException{
        Compromisso aulaNaAutoEscola1 = new Compromisso("Aula na auto-escola", "01/07/2022");
        Compromisso aulaNaAutoEscola2 = new Compromisso("Aula na auto-escola", "08/07/2022");
        Compromisso aulaNaAutoEscola3 = new Compromisso("Aula na auto-escola", "15/07/2022");
        Compromisso aulaNaAutoEscola4 = new Compromisso("Aula na auto-escola", "22/07/2022");
        Compromisso aulaNaAutoEscola5 = new Compromisso("Aula na auto-escola", "29/07/2022");

        List<Compromisso> diasNaAutoEscola = new ArrayList<>();
        diasNaAutoEscola.add(aulaNaAutoEscola1);
        diasNaAutoEscola.add(aulaNaAutoEscola2);
        diasNaAutoEscola.add(aulaNaAutoEscola3);
        diasNaAutoEscola.add(aulaNaAutoEscola4);
        diasNaAutoEscola.add(aulaNaAutoEscola5);

        agenda.AddCompromisso(aulaNaAutoEscola1, 7, 5);
        List<Compromisso> c =agenda.getCompromissos("01/07/2022", "29/07/2022");
        diasNaAutoEscola.removeAll(c);

        assertTrue(diasNaAutoEscola.size() == 0);
    } 
}
