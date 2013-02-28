package DAO.Disciplinas;


import Controle.Disciplinas.ControlClass;
import Controle.Disciplinas.ControlDay;
import Controle.Disciplinas.ControlHour;
import Controle.Disciplinas.ControlSubject;
import Modelo.Disciplinas.Dia;
import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Hora;
import Modelo.Disciplinas.Turma;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axs
 */
public class MainDisciplinas {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String args[]) {

        try {
        
        BufferedReader inputStream = new BufferedReader(new FileReader("src/DAO/Disciplinas/entradaTeste.txt"));
        
        ControlSubject controlSubject = new ControlSubject();
        ControlClass controlClass = new ControlClass();
        ControlDay controlDay = new ControlDay();
        ControlHour controlHour = new ControlHour();

        String nomeDisciplina = "";
        String codigoDisciplina = "";
        String pre_reqDisciplina = "";
        
        int creditos = 0;
        
        String nomeTurma = "";
        
        int nr_dia = 0;
        String idDia = "";
        String nomeDia = "";

        String idHora = "";
        String nomeHora = "";
        
        String opD = "S";
        String opT = "S";
        
        ArrayList<Dia> model_days = controlDay.callDeserialize();
        ArrayList<Hora> model_hours = controlHour.callDeserialize();
        ArrayList <Disciplina> disciplinas = controlSubject.createDisciplines();
        /*ArrayList <Disciplina> disciplinas = controlSubject.callDeserialize();
        
        Iterator i = disciplinas.iterator();
        
        while(i.hasNext()) {
            Disciplina subject = (Disciplina) i.next();
            System.out.println(subject.toString());
        }
        */
        do {

            System.out.println("Nome da Disciplina:");
            //nomeDisciplina = scan.nextLine();
            nomeDisciplina = inputStream.readLine();
            System.out.println(nomeDisciplina);
            
            System.out.println("Codigo da Disciplina:");
            //codigoDisciplina = scan.nextLine();
            codigoDisciplina = inputStream.readLine();
            System.out.println(codigoDisciplina);

            System.out.println("Codigo do Pre Requisito:");
            //pre_reqDisciplina = scan.nextLine();
            pre_reqDisciplina = inputStream.readLine();
            System.out.println(pre_reqDisciplina);
            
            System.out.println("Quantidade de Creditos:");
            //creditos = Integer.parseInt(scan.nextLine())/2;
            creditos = Integer.parseInt(inputStream.readLine())/2;
            System.out.println(String.valueOf(creditos*2));
            
            ArrayList <Turma> turmas = controlClass.createClasses();

            do {

                System.out.println("Nome da turma:");
                //nomeTurma = scan.nextLine();
                nomeTurma = inputStream.readLine();
                System.out.println(nomeTurma);
                
                ArrayList <Dia> dias = controlDay.createDays();
                ArrayList <Hora> horas = controlHour.createHours();

                nr_dia = 0;
                
                do {

                    System.out.println("ID do Dia (0 - 6):");
                    //idDia = scan.nextLine();
                    idDia = inputStream.readLine();
                    int intidDia = Integer.parseInt(idDia);
                    nomeDia = model_days.get(intidDia).getNome();
                    System.out.println(idDia);
                    
                    System.out.println("ID da Hora (0 - 7): ");
                    //idHora = scan.nextLine();
                    idHora = inputStream.readLine();
                    int intidHora = Integer.parseInt(idHora);
                    nomeHora = model_hours.get(intidHora).getNome();
                    System.out.println(idHora);
                    
                    Dia dia = controlDay.createDay(String.valueOf(nr_dia),nomeDia);
                    Hora hora = controlHour.createHour(String.valueOf(nr_dia),nomeHora);

                    controlDay.registerDay(dias, dia);
                    controlHour.registerHour(horas, hora);

                    nr_dia ++;
                    
                }while(nr_dia < creditos);

                Turma turma = controlClass.createClassLesson(nomeTurma, dias, horas);
                controlClass.registerClassLesson(turmas, turma);

                System.out.println("Mais uma turma?");
                //opT = scan.nextLine();
                opT = inputStream.readLine();
                System.out.println(opT);
                
            }while(!opT.equalsIgnoreCase("n"));
            Disciplina disciplina = controlSubject.createSubject(nomeDisciplina, codigoDisciplina, pre_reqDisciplina, turmas);
            controlSubject.registerSubject(disciplinas, disciplina);
            
            System.out.println("Mais uma disciplina?");
            opD = scan.nextLine();
            //opD = inputStream.readLine();
            System.out.println(opD);
            
        }while(!opD.equalsIgnoreCase("n"));
        inputStream.close();
        
        Iterator i = disciplinas.iterator();
        
        while(i.hasNext()) {
            Disciplina subject = (Disciplina) i.next();
            System.out.println(subject.toString());
        }
        
        controlSubject.callSerialize(disciplinas);
        } catch (FileNotFoundException e) {
            System.out.println("Não achei ou não consegui abrir o arquivo!");
        } catch (IOException e) {
            System.out.println("Erro genérico ao ler o arquivo!");
        }
        System.exit(0);
    }
    
}