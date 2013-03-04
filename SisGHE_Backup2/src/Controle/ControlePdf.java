package Controle;

import DAO.DeserializaAluno;
import DAO.GerarPdf;
import Modelo.Aluno;

import Modelo.Disciplinas.Disciplina;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class ControlePdf {
    
    private Aluno aluno = new Aluno();
    private ArrayList<Disciplina> disciplinaCursada = new ArrayList<Disciplina>();
    private static ArrayList<Disciplina> listaDisciplina;

    public ControlePdf() {

    }

    //neste metodo que serão obtidos o s dados do documento XML
    //aqui serão realizadas as verificações e validações
  
    public void chamaDeserializar(){
        DAO.DeserializaAluno.DeserializaAlunoR(aluno);
      
        listaDisciplina = DAO.Disciplinas.DaoDeserializaDisciplinas.deserializaDisciplinasXml();
        
     
    }

    public void build(){
        GerarPdf gerar = new GerarPdf(aluno, listaDisciplina, 0);
        gerar.gerarPdf();
    
    
    }
    
    
}   
