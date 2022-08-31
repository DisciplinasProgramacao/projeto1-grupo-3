import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Agenda {
    ArrayList<Compromisso> agenda = new ArrayList<>();

    public void addCompromisso(Compromisso compromisso) {
        agenda.add(compromisso);
    }

    public void addCompromissoPeriodico(Compromisso compromisso, String diaFinal) throws ParseException {

        DataC dataFinal = new DataC(diaFinal);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(compromisso.getDataCompromisso().getData());
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (compromisso.getDataCompromisso().getData() != dataFinal.getData()) {
            addCompromisso(compromisso);
            gc.add(Calendar.DAY_OF_MONTH, 1);
            String dataFormatada = dateFormat.format(gc.getTime());
            compromisso = new Compromisso(compromisso.getNome(), dataFormatada);
        }
    }

    public void addCompromissoPeriodico(Compromisso compromisso, int repetirAcada, int numeroRepeticoes) {

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(compromisso.getDataCompromisso().getData());

        for (int i = 0; i < numeroRepeticoes; i++) {
            addCompromisso(compromisso);
            gc.add(Calendar.DAY_OF_MONTH, repetirAcada);
        }
    }
}

