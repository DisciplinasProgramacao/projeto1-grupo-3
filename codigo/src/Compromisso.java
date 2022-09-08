/** 
 * MIT License
 *
 * Copyright(c) 2022 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** 
 * Classe pra representar um compromisso
 */
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
