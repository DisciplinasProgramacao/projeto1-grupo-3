import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Teste da classe agenda
 */
public class TestAgenda {

    private static Agenda agenda;

    @BeforeAll
    public static void criarAgenda(){
        agenda = new Agenda();
    }

    @Test
    public void verificaSeAAagendaEstaVazia() {
        assertEquals(0, agenda.Size());
    }


}
