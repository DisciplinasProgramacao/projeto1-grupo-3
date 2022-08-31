import java.text.ParseException;

public class Compromisso {


    private String nome;
    private DataC dataCompromisso;

    public Compromisso(String name, String dataCompromisso) throws ParseException {
        init(name, dataCompromisso);
    }

    public Compromisso() throws ParseException {
        init("Não Iniciado", "01/01/2022");
    }

    private void init(String nome, String dataCompromisso) throws ParseException {
        this.nome = nome;
        this.dataCompromisso = new DataC(dataCompromisso);
    }

    //#Region Getters

    public String getNome() {
        return nome;
    }

    public DataC getDataCompromisso() {
        return dataCompromisso;
    }
}
