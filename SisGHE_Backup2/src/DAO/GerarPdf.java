/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Aluno;

import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Turma;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class GerarPdf {
    
    private static Font titleFont = new Font (Font.FontFamily.HELVETICA, 20, Font.BOLD);
    private static Font disciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.BLUE);
    private static Font listaDisciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.RED);
    
    private static Aluno aluno;
    private static ArrayList<Disciplina> disciplinaCursada;
    private static ArrayList<Disciplina> listaDisciplina;

    
    public GerarPdf(Aluno aluno, ArrayList<Disciplina> disciplinaCursada) {
        this.aluno = aluno;
        this.disciplinaCursada = disciplinaCursada;
    }
    
       public GerarPdf(Aluno aluno, ArrayList<Disciplina> listaDisciplina, int i) {
        this.aluno = aluno;
        this.listaDisciplina = listaDisciplina;
    }
       
    
    public static void addLinhaVazia(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
          paragraph.add(new Paragraph(" "));
        }//fim do for    
    }//fim func
    
    public static void addMetaDados(Document document){

        document.addTitle("Grade Horaria - "+ aluno.getMatricula() + aluno.getNome());
        document.addSubject("geredo por SISGHE");
        document.addKeywords("Grade , Horaria, UnB");
        document.addAuthor(System.getProperty("user.name"));
        document.addCreator("Gandalf, the white");
    }
    
    public static void addConteudo(Document document) throws DocumentException{
        Paragraph para = new Paragraph();      
        Paragraph aux;
        
        
        // adicionando titulo
        aux = new Paragraph("Grade Horaria - sisGHE", titleFont);
        para.add(aux);
        aux.setAlignment(Element.ALIGN_CENTER);
        
        //pula uma linhas
        addLinhaVazia(para,1);
        
        //preenchendo informações do aluno
        aux = new Paragraph("Nome: "+ aluno.getNome()+"\n"
                          + "Matricula: "+ aluno.getMatricula()+"\n"
                          + "Curso: "+ aluno.getCurso()+"\n"
                          + "Semestre: "+aluno.getSemestre());    
        para.add(aux);

        addLinhaVazia(para,2);
        
        //adiciona disciplinas cursadas ao documento

         
         //adiciona Lista de disciplinas disponiveis
        
         aux = new Paragraph("Disciplinas Disponiveis",listaDisciplinaFont);
         for(int i=0;i<listaDisciplina.size();i++){
             Disciplina d = listaDisciplina.get(i);
             aux.add(d.toString());
         }
         para.add(aux);
         
   
        document.add(para);
    
    
    };
    
    public  void gerarPdf(){
      
        Document document = new Document();
         
           String FILE;
           FILE = "./PDF/GradeHoraria.pdf";
           try{
                PdfWriter.getInstance(document, new FileOutputStream(FILE));
                document.open();
                addMetaDados(document);
                addConteudo(document);
                document.close();
                JOptionPane.showMessageDialog(null, "PDF salvo em:\n <diretorio do projeto>"+FILE);
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao criar PDF, certifique-se de que o "
                        + "arquivo nao esta sendo utilizado.");
               e.printStackTrace();
           }   
    }
  
    
    
}
