import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compromisso {

    //#region Atributos
    private String nome;
    private LocalDate dataCompromisso;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //#endregion


    //#region Construtores

    /**
     * Inicializa o objeto compromisso a Partir de uma String nome e uma String com a data do compromisso.
     *
     * @param name Espera uma String para atribuir ao objeto compromisso
     * @param data Espera uma String no formato dd/MM/yyyy para atribuir ao objeto compromisso
     * @throws ParseException Lança uma excessão caso o formato não corresponda ao esperado.
     */
    public Compromisso(String name, String data) throws ParseException {
        this.nome = name;
        dataCompromisso = LocalDate.parse(data, formatter);
    }

    /**
     * Inicializa o objeto compromisso com o valor de nome "Não Iniciado" e a Data "01/01/2022"
     */
    public Compromisso() throws ParseException {
        this("Não Iniciado", "01/01/2022");
    }

    //#endregion


    //region Métodos
    
    /**
     * Retorna a representação do objeto em uma string
     * @return nomeDocompromisso - dd/MM/yyyy
     */
    @Override
    public String toString() {
        return this.nome + " - " + formatter.format(this.dataCompromisso);
    }
    //#endregion

    //#Region Getters
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCompromisso() {
        return this.dataCompromisso;
    }

    public void setDataCompromisso(LocalDate dataCompromisso) {
        this.dataCompromisso = dataCompromisso;
    }

    //#endregion
}
