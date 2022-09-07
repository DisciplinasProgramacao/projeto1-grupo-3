import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAgenda {

    //private static Agenda agenda = new Agenda();
    private static Compromisso compromisso;

    static {
        try {
            compromisso = new Compromisso("Aniversario", "20/04/2003");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void insereNaLista() {

        //agenda.addCompromisso(compromisso);
        //assertEquals(Agenda.getAgenda().get(0).getNome(), "Aniversario");
    }


}
