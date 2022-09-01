import java.util.*;
import java.text.*;

public class DataC {



    //#region Atributos
    private Date data;

    //#endregion

    //#region Construtores


    /**
     *  Inicializa o objeto Data, a partir da String com a data correspondente
     * @param inputUsuario Espera uma String no formato dd/MM/yyyy
     * @throws ParseException Lança excessão caso o formato do input esteja fora do padrão dd/MM/yyyy
     */
    DataC(String inputUsuario) throws ParseException {
        init(inputUsuario);
    }


    /**
     * Inicializa o objeto data com o valor "01/01/2022 caso não seja passado nenhum parâmetro"
     */
    DataC() throws ParseException {
        init("01/01/2022");
    }

    //#endregion


    //#region Métodos

    /**
     *  Método privado utilizado para iniciar os construtores
     * @param inputUsuario Espera uma String no formato "dd/MM/yyyy"
     * @throws ParseException Lança excessão caso o formato do input esteja fora do padrão dd/MM/yyyy
     */
    private void init(String inputUsuario) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        this.data = sdf1.parse(inputUsuario);
    }

    /**
     * Método que converte a variavel date para String
     * @return Retorna uma String no formato "dd/MM/yyyy"
     */
    public String dataEmString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this.data);
    }

    //#endregion


    //#region Getters & Setters

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    //#endregion

}


