package Controle;

import DAO.DeserializaAluno;
import DAO.GerarPdf;
import Modelo.Aluno;
import Modelo.DisciplinaCursada;
import Modelo.Disciplinas.Disciplina;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class ControlePdf {
    
    private Aluno aluno = new Aluno();
    private ArrayList<DisciplinaCursada> disciplinaCursada = new ArrayList<DisciplinaCursada>();
    private static ArrayList<Disciplina> listaDisciplina;

    public ControlePdf() {

    }

    //neste metodo que serão obtidos o s dados do documento XML
    //aqui serão realizadas as verificações e validações
    // falta colocar DISCIPLINAS CURSADAS E GRADE HORARIA;
    public void chamaDeserializar(){
        DAO.DeserializaAluno.DeserializaAlunoR(aluno);
       // disciplinaCursada = DAO.XmlDisciplinasCursadas.DeserializaDisciplinas();
        listaDisciplina = DAO.Disciplinas.DeserializeSubject.deserializingDisciplines();
        
       System.out.println(listaDisciplina);
    }

    public void build(){
        GerarPdf gerar = new GerarPdf(aluno, listaDisciplina, 0);
        gerar.gerarPdf();
    
    
    }
    
    
}   
