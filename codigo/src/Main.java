import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Agenda agenda = new Agenda();
        Compromisso compromisso = new Compromisso("Matheus", "31/08/2022");
        agenda.addCompromissoPeriodico(compromisso, 7,3);
        for (int i = 0; i < agenda.getAgenda().size(); i++) {
            System.out.print(agenda.getAgenda().get(i).getNome());
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print(agenda.getAgenda().get(i).getDataCompromisso().getData());
        }

    }
}
