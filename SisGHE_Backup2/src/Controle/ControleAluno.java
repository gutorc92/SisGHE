package Controle;

import Modelo.Aluno;
import DAO.SerializaAluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Apresentacao.*;
import DAO.DeserializaAluno;
import DAO.DeserializaDisciplinas;
import DAO.XmlDisciplinasCursadas;
import Modelo.DisciplinaCursada;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class ControleAluno {

    public static List<Aluno> alunos = new ArrayList<Aluno>();
    public static List<Aluno> alteraAluno = new ArrayList<Aluno>();
    private SerializaAluno serializaAluno;
    private Aluno aluno;
    private ControleAluno cadastro;
    private InAlteraAluno inAltera;
    private InAluno inAluno;

    public ControleAluno() {
        this.aluno = new Aluno();

    }

    public void CadastraAluno(String nome, String matricula, String curso, String semestre) {

        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.setSemestre(semestre);
        alunos.add(this.aluno);

    }

    public void CadastraAluno(String nome, String matricula, String curso, String semestre, ArrayList<DisciplinaCursada> listDisciplinas) {

        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.setSemestre(semestre);
        alunos.add(this.aluno);
        this.chamaSerializar();
        XmlDisciplinasCursadas.gerarXml(listDisciplinas);

    }

    public void AlterarAluno(String nome, String matricula, String curso, String semestre) throws IllegalArgumentException {
        this.aluno.setNome(nome);
        this.aluno.setMatricula(matricula);
        this.aluno.setCurso(curso);
        this.aluno.setSemestre(semestre);
        alteraAluno.add(aluno);
    }

    public void chamaSerializar() {
        SerializaAluno.SerializarCadastro(alunos);
    }

    public void chamaSerializarAlterar() {
        SerializaAluno.SerializarAlterar();

    }

    public void setaAluno(InDadosAluno obInDadosAluno) {

        Aluno novoAluno = (Aluno) DeserializaAluno.listaAluno.get(0);
        ArrayList<DisciplinaCursada> listDisciplinasCursadas = XmlDisciplinasCursadas.DeserializaDisciplinas();
        System.out.println("A quantidade de materias: "+listDisciplinasCursadas.size());
        String nome = novoAluno.getNome();
        String matricula = novoAluno.getMatricula();
        String curso1 = novoAluno.getCurso();
        String semestre = novoAluno.getSemestre();
        obInDadosAluno.setDados(nome, matricula, curso1, semestre, listDisciplinasCursadas);
        DeserializaAluno.listaAluno.remove(novoAluno);
        //Zerando a array para manter a posição 0 sempre.
    }

    public void chamaDeserializar() {
        DeserializaAluno.DeserializaAluno();

    }

    public void verificaCadastro() {
        DeserializaAluno.VerificaCadastro();
    }

    /**
     * fjslfkj
     */
    public void habilitaButtonAluno() {
        InAluno interfaceAluno = new InAluno();
        interfaceAluno.setVisible(true);
        if (DeserializaAluno.VerificaCadastro()) {
            interfaceAluno.jBCadastrar.setEnabled(true);
            interfaceAluno.jBAlterar.setEnabled(false);
            interfaceAluno.jBExcluir.setEnabled(false);
        } else {
            interfaceAluno.jBCadastrar.setEnabled(false);
            interfaceAluno.jBAlterar.setEnabled(true);
            interfaceAluno.jBExcluir.setEnabled(true);
        }
    }

//FELIPE>>>
    public static void chamaExcluir() {
        int aux;

        aux = DeserializaAluno.excluiXmlAluno();

        aux += XmlDisciplinasCursadas.excluiXmlCadastro();

        if (aux <= 0) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel excluir o arquivo");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno e seus dados excluidos com sucesso");
        }
    }

    public static ArrayList<JCheckBox> gerarJCheckBox() {
        ArrayList<DisciplinaCursada> listTodasDisciplinas = DeserializaDisciplinas.deserializarDisciplinas();
        ArrayList<JCheckBox> listComboBox = new ArrayList<JCheckBox>();
        int i = 10;
        for (Iterator<DisciplinaCursada> iterator = listTodasDisciplinas.iterator(); iterator.hasNext();) {
            JCheckBox jb = new JCheckBox();
            DisciplinaCursada obDisciplinaCursada = iterator.next();
            jb.setBackground(new java.awt.Color(94, 36, 211));
            jb.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
            jb.setForeground(new java.awt.Color(251, 249, 249));
            jb.setBounds(10, i, 360, 23);
            jb.setText(obDisciplinaCursada.getNome());
            i += 20;

            listComboBox.add(jb);
            //this.jScrollPane1.add(this.jPanel1);
        }
        return listComboBox;

    }
}