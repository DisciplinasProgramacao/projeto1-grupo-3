import java.text.ParseException;

public class Compromisso {

    //#region Atributos
    private static String nome;
    private static DataC dataCompromisso;

    //#endregion


    //#region Construtores

    /**
     * Inicializa o objeto compromisso a Partir de uma String nome e uma String com a data do compromisso.
     *
     * @param name            Espera uma String para atribuir ao objeto compromisso
     * @param dataCompromisso Espera uma String no formato dd/MM/yyyy para atribuir ao objeto compromisso
     */
    public Compromisso(String name, String dataCompromisso) throws ParseException {
        init(name, dataCompromisso);
    }

    /**
     * Inicializa o objeto compromisso com o valor de nome "Não Iniciado" e a Data "01/01/2022"
     */
    public Compromisso() throws ParseException {
        init("Não Iniciado", "01/01/2022");
    }

    //#endregion


    //region Métodos


    /**
     * Método privado utilizado para auxiliar na atribuição dos construtores
     *
     * @param nome            Espera uma String para atribuir o nome.
     * @param dataCompromisso Espera uma String no formato dd/MM/yyyy.
     * @throws ParseException Lança uma excessão caso o formato não corresponda ao esperado.
     */
    private void init(String nome, String dataCompromisso) throws ParseException {
        Compromisso.nome = nome;
        Compromisso.dataCompromisso = new DataC(dataCompromisso);
    }

    /**
     * Método utilizado para imprimir na tela, os dados do compromisso no formato String
     */
    public void imprimirCompromisso() {
        System.out.println(nome);
        System.out.println(dataCompromisso.dataEmString());
    }
    //#endregion

    //#Region Getters

    public String getNome() {
        return nome;
    }

    public DataC getDataCompromisso() {
        return dataCompromisso;
    }

    //#endregion
}
