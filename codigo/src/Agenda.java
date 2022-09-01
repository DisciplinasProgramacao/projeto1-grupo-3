import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_MONTH;

public class Agenda {


    private static ArrayList<Compromisso> agenda = new ArrayList<>();
    private static GregorianCalendar gc;

    public void addCompromisso(Compromisso compromisso) {
        agenda.add(compromisso);
    }

    public void addCompromissoPeriodico(Compromisso compromisso, int repetirAcada, int numeroRepeticoes) {

        gc = iniciarCalendar(compromisso.getDataCompromisso());

        for (int i = 0; i <= numeroRepeticoes; i++) {
            addCompromisso(compromisso);
            gc.add(DAY_OF_MONTH, repetirAcada);
            compromisso.getDataCompromisso().setData(gc.getTime());
        }
    }

    public void vizualizarCompromissos(String diaInicial, String diaFinal) throws ParseException {
        DataC dataInicial;
        DataC dataFinal = new DataC(diaFinal);

        for (Compromisso compromisso : agenda) {
            dataInicial = new DataC(diaInicial);
            gc = iniciarCalendar(dataInicial);

            while (dataInicial.getData().equals(dataFinal.getData())) {
                if (compromisso.getDataCompromisso().getData() == dataInicial.getData()) {
                    compromisso.imprimirCompromisso();
                }
                gc.add(DAY_OF_MONTH, 1);
            }
        }
    }

    private GregorianCalendar iniciarCalendar(DataC data) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data.getData());
        return gc;
    }


    //#region Getter

    public static ArrayList<Compromisso> getAgenda() {
        return agenda;
    }


    //#endregion
}


