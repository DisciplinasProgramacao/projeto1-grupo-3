import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import static java.util.Calendar.DAY_OF_MONTH;

public class Agenda {
    private static final ArrayList<Compromisso> agenda = new ArrayList<>();
    private static GregorianCalendar gc;

    public void addCompromisso(Compromisso compromisso) {
        agenda.add(compromisso);
    }

    public void addCompromissoPeriodico(Compromisso compromisso, String diaFinal) throws ParseException {

        DataC dataFinal = new DataC(diaFinal);
        iniciarCalendar(compromisso.getDataCompromisso());

        while (compromisso.getDataCompromisso().getData() != dataFinal.getData()) {
            addCompromisso(compromisso);
            gc.add(DAY_OF_MONTH, 1);
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dataFormatada = dateFormat.format(gc.getTime());
            compromisso = new Compromisso(compromisso.getNome(), dataFormatada);
        }
    }

    public void addCompromissoPeriodico(Compromisso compromisso, int repetirAcada, int numeroRepeticoes) {

        iniciarCalendar(compromisso.getDataCompromisso());

        for (int i = 0; i < numeroRepeticoes; i++) {
            addCompromisso(compromisso);
            gc.add(DAY_OF_MONTH, repetirAcada);
        }
    }

    public void vizualizarCompromissos(String diaInicial, String diaFinal) throws ParseException {
        DataC dataInicial;
        DataC dataFinal = new DataC(diaFinal);

        for (Compromisso compromisso : agenda) {
            dataInicial = new DataC(diaInicial);
            iniciarCalendar(dataInicial);
            while (dataInicial.getData().equals(dataFinal.getData())) {
                if (compromisso.getDataCompromisso().getData() == dataInicial.getData()) {
                    compromisso.imprimirCompromisso();
                }
                gc.add(DAY_OF_MONTH, 1);
            }
        }
    }

    private void iniciarCalendar(DataC data) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data.getData());
    }


}


