import java.text.ParseException;

public class Compromisso {


    private static String nome;
    private static DataC dataCompromisso;

    public Compromisso(String name, String dataCompromisso) throws ParseException {
        init(name, dataCompromisso);
    }

    public Compromisso() throws ParseException {
        init("Não Iniciado", "01/01/2022");
    }

    private void init(String nome, String dataCompromisso) throws ParseException {
        Compromisso.nome = nome;
        Compromisso.dataCompromisso = new DataC(dataCompromisso);
    }

    public void imprimirCompromisso() {
        System.out.println(nome);
        System.out.println(dataCompromisso.getData());

    }
    //#Region Getters

    public String getNome() {
        return nome;
    }

    public DataC getDataCompromisso() {
        return dataCompromisso;
    }
}
