package Controle;

import Apresentacao.InAlteraAluno;
import DAO.XmlDisciplinasCursadas;
import Modelo.DisciplinaCursada;
import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author beatriz
 */
public class ControlaDisciplina {

    public void setaDisciplina() {

        ArrayList<DisciplinaCursada> disciplinasCursadas = XmlDisciplinasCursadas.DeserializaDisciplinas();

        for (DisciplinaCursada dc : disciplinasCursadas) {
/*             verifica(Acustica_e_vibracoes_veiculares);
        verifica(Analise_de_sinais_e_design_de_circuitos);
        verifica(Calculo1);
        verifica(Calculo2);
        verifica(Calculo3);
        verifica(Circuitos_eletronicos1);
        verifica(Circuito_Eletronico2);
        verifica(circuitos_eletronicos3);
        verifica(Comunicacoes_digitais_para_engenharia);
        verifica(Dinamica_de_veiculos);*/

            if (dc.getNome().equals(InAlteraAluno.Acustica_e_vibracoes_veiculares.getText())) {
                InAlteraAluno.Acustica_e_vibracoes_veiculares.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Analise_de_sinais_e_design_de_circuitos.getText())) {
                InAlteraAluno.Analise_de_sinais_e_design_de_circuitos.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo1.getText())) {
                InAlteraAluno.Calculo1.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo2.getText())) {
                InAlteraAluno.Calculo2.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo3.getText())) {
                InAlteraAluno.Calculo3.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Circuitos_eletronicos1.getText())) {
                InAlteraAluno.Circuitos_eletronicos1.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Circuito_Eletronico2.getText())) {
                InAlteraAluno.Circuito_Eletronico2.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.circuitos_eletronicos3.getText())) {
                InAlteraAluno.circuitos_eletronicos3.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Dinamica_de_veiculos.getText())) {
                InAlteraAluno.Dinamica_de_veiculos.setSelected(true);
            }
        }
    }
}