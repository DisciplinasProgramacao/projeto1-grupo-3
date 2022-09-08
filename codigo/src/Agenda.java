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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/** 
 * Classe guardar e gerenciar a criação de compromissos 
 */
public class Agenda {

    //#region atributos

    private List<Compromisso> Agenda;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //#endregion

    /**
     * Construtor: Cria uma agenta (que é uma lista de compromissos), vazio.
     */
    public Agenda() {
        Agenda = new ArrayList<>();
    }

    /**
     * Retorna o tamanho atual da List Agenda
     * @return O tamanho atual da Agenda (int)
     */
    public int size() {
        return Agenda.size();
    }

    /**
     * Adiciona compromisso a agenda, podendo ser adicionado periodicamente.
     * @param compromisso Objeto compromisso a ser adcionado
     * @param aCadaXdias Numero de dias em que o compromisso se repetira
     * @param xRepetições Número de repetições do compromisso
     */
    public void AddCompromisso(Compromisso compromisso, int aCadaXdias, int xRepetições){
        
        Agenda.add(compromisso);

        if(aCadaXdias != 0 && xRepetições != 0){
            
            LocalDate dataInicial = compromisso.getDataCompromisso();
            String nomeDoEvento = compromisso.getNome();

            for(int i = 0; i < xRepetições-1; i++){
                dataInicial = dataInicial.plusDays(aCadaXdias);
                Compromisso c = new Compromisso(nomeDoEvento, dataInicial);
                Agenda.add(c);
            }
        }
        else if( (aCadaXdias == 0 && xRepetições != 0) || (aCadaXdias !=0 && xRepetições == 0) ){
            throw new IllegalArgumentException("Não pode haver um parametro de repetição igual a zero e outro diferente de zero");
        }
    }

    /**
     * Adiciona compromisso a agenda, podendo ser adicionado periodicamente.
     * @param dataInicial String com data incial no formato dd/MM/yyy
     * @param dataFinal String com data final no formato dd/MM/yyy
     * @return Uma List<Compromisso>
     */
    public List<Compromisso> getCompromissos(String dataInicial, String dataFinal){
       return getCompromissos(LocalDate.parse(dataInicial, formatter), LocalDate.parse(dataFinal, formatter));
    }

    /**
     * Adiciona compromisso a agenda, podendo ser adicionado periodicamente.
     * @param dataInicial LocalDate com a data incial
     * @param dataFinal LocalDate a com data final
     * @return Uma List<Compromisso>
     */
    public List<Compromisso> getCompromissos(LocalDate dataInicial, LocalDate dataFinal){

        List<Compromisso> subLista = new ArrayList<>();

        for (Compromisso compromisso : Agenda) {
            
            LocalDate dataDoCompromisso = compromisso.getDataCompromisso();

            if( (dataDoCompromisso.isEqual(dataInicial) || dataDoCompromisso.isEqual(dataFinal)) || (dataDoCompromisso.isAfter(dataInicial) && dataDoCompromisso.isBefore(dataFinal))){
                subLista.add(compromisso);
            }
        }
        return subLista;
    }
    
}


