package Controle;

import Apresentacao.*;
import DAO.DeserializaAluno;
import DAO.SerializaAluno;
import Modelo.Aluno;
import Modelo.Disciplinas.Disciplina;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

    public void CadastraAluno(String nome, String matricula, String curso, String semestre, ArrayList<Disciplina> arrayDisciplinasCursadas) {
        Aluno alunoCadastrar = new Aluno(nome, matricula, curso, semestre);
        alunos.add(alunoCadastrar);
        this.chamaSerializar();
        DAO.Disciplinas.DaoSerializaDisciplinas.serializaDisciplinas(arrayDisciplinasCursadas);

    }

    public void AlterarAluno(String nome, String matricula, String curso, String semestre, ArrayList<Disciplina> novo_arrayDisciplinasCursadas) throws IllegalArgumentException {
        Aluno alunoAlterar = new Aluno(nome, matricula, curso, semestre);
        alteraAluno.add(alunoAlterar);
        DAO.Disciplinas.DaoSerializaDisciplinas.serializaDisciplinas(novo_arrayDisciplinasCursadas);
    }

    public void chamaSerializar() {
        SerializaAluno.SerializarCadastro(alunos);
    }

    public void chamaSerializarAlterar() {
        SerializaAluno.SerializarAlterar();

    }

    public void setaAluno(InDadosAluno obInDadosAluno) {

        Aluno novoAluno = (Aluno) DeserializaAluno.listaAluno.get(0);
        ArrayList<Disciplina> listDisciplinasCursadas = DAO.Disciplinas.DeserializaDisciplinasCursadas.deserializaDisciplinasCursadasXml();
        System.out.println("A quantidade de materias: " + listDisciplinasCursadas.size());
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

        aux += DAO.Disciplinas.DaoSerializaDisciplinas.excluiXmlCadastro();

        if (aux <= 0) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel excluir o arquivo");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno e seus dados excluidos com sucesso");
        }
    }

    public static ArrayList<JCheckBox> gerarJCheckBox() {
        ArrayList<Disciplina> listTodasDisciplinas = DAO.Disciplinas.DaoDeserializaDisciplinas.deserializaDisciplinasXml();
        ArrayList<JCheckBox> listComboBox = new ArrayList<JCheckBox>();
        int i = 10;//variavel para controlar a posicao vertical dos JCheckBox
        for (Iterator<Disciplina> iterator = listTodasDisciplinas.iterator(); iterator.hasNext();) {
            JCheckBox obJCheckBox = new JCheckBox();
            Disciplina obDisciplina = iterator.next();
            ControleAluno.formatJCkeckBox(obJCheckBox,i);
            obJCheckBox.setText(obDisciplina.getNome());
            i += 20;
            listComboBox.add(obJCheckBox);
        }
        return listComboBox;

    }
    
    public static void formatJCkeckBox(JCheckBox obJCheckBox, int posicao){
        obJCheckBox.setBackground(new java.awt.Color(94, 36, 211));
        obJCheckBox.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        obJCheckBox.setForeground(new java.awt.Color(251, 249, 249));
        obJCheckBox.setBounds(10, posicao, 360, 23);
    }
}