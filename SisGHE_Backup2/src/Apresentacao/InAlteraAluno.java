package Apresentacao;

import java.util.ArrayList;
import java.util.Vector;
import Controle.*;
import Modelo.DisciplinaCursada;
import java.awt.event.ActionEvent;
import DAO.*;
import java.util.Iterator;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author david, beatriz
 */
public class InAlteraAluno extends javax.swing.JFrame {

    static ArrayList<DisciplinaCursada> novas_disciplinasCursadas = new ArrayList<DisciplinaCursada>();
    static ArrayList<DisciplinaCursada> disciplinas = DeserializaDisciplinas.deserializarDisciplinas();
    

    public InAlteraAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLcurso = new javax.swing.JLabel();
        jTcurso1 = new javax.swing.JTextField();
        jLmatricula = new javax.swing.JLabel();
        jTmatricula = new javax.swing.JTextField();
        jLsemestre = new javax.swing.JLabel();
        cbSemestre = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Dinamica_multicorpos_veicular = new javax.swing.JCheckBox();
        Eletricidade_aplicada = new javax.swing.JCheckBox();
        Dinamica_de_veiculos = new javax.swing.JCheckBox();
        Sistemas_Embarcados = new javax.swing.JCheckBox();
        Estrutura_de_dados_e_algoritimos = new javax.swing.JCheckBox();
        Fisica1 = new javax.swing.JCheckBox();
        Eletronica_veicular = new javax.swing.JCheckBox();
        Equacoes_Diferenciais1 = new javax.swing.JCheckBox();
        Fundamento_de_computiladores = new javax.swing.JCheckBox();
        Fundamentos_da_teoria_eletromagnetica = new javax.swing.JCheckBox();
        Fundamento_de_arquitetura_de_computadores = new javax.swing.JCheckBox();
        Analise_de_sinais_e_design_de_circuitos = new javax.swing.JCheckBox();
        Fundamento_de_rede_de_computadores = new javax.swing.JCheckBox();
        Calculo1 = new javax.swing.JCheckBox();
        Fundamentos_de_sistemas_distribuidos = new javax.swing.JCheckBox();
        Calculo2 = new javax.swing.JCheckBox();
        Fundamentos_de_sistemas_operacionais = new javax.swing.JCheckBox();
        Calculo3 = new javax.swing.JCheckBox();
        Intrumentacao_eletronica = new javax.swing.JCheckBox();
        Introduca_a_Algebra_linear = new javax.swing.JCheckBox();
        Introducao_a_ciencia_da_computacao = new javax.swing.JCheckBox();
        Introducao_a_jogos_eletronicos = new javax.swing.JCheckBox();
        Orientacao_a_objetos = new javax.swing.JCheckBox();
        metodos_matematicos_para_engenharia = new javax.swing.JCheckBox();
        Acustica_e_vibracoes_veiculares = new javax.swing.JCheckBox();
        Metodos_numericos_para_engenharia = new javax.swing.JCheckBox();
        Microprocessadores_e_Microcompiladores = new javax.swing.JCheckBox();
        Circuitos_eletronicos1 = new javax.swing.JCheckBox();
        Circuito_Eletronico2 = new javax.swing.JCheckBox();
        circuitos_eletronicos3 = new javax.swing.JCheckBox();
        Comunicacoes_digitais_para_engenharia = new javax.swing.JCheckBox();
        Sistemas_Digitais2 = new javax.swing.JCheckBox();
        Processamento_de_sinais = new javax.swing.JCheckBox();
        Principio_de_comunicacao = new javax.swing.JCheckBox();
        Projeto_de_circuitos_Reconfiguraveis2 = new javax.swing.JCheckBox();
        Projeto_com_circuitos_reconfiguraveis1 = new javax.swing.JCheckBox();
        Sensores_e_transdutores = new javax.swing.JCheckBox();
        Projeto_de_microprocessadores = new javax.swing.JCheckBox();
        Sistemas_Digitais1 = new javax.swing.JCheckBox();
        Sitemas_de_controladores = new javax.swing.JCheckBox();
        jBalterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(169, 243, 132));

        jLnome.setText("Nome");

        jLcurso.setText("Curso");

        jLmatricula.setText("Matricula");

        jLsemestre.setText("Semestre");

        cbSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  "1º", "2º", "3º", "4º", "5º", "6º", "7º", "8º", "9º", "10º"}));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Matérias Cursadas"));

        jPanel1.setBackground(new java.awt.Color(94, 36, 211));
        jPanel1.setForeground(new java.awt.Color(255, 250, 250));

        Dinamica_multicorpos_veicular.setBackground(new java.awt.Color(94, 36, 211));
        Dinamica_multicorpos_veicular.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Dinamica_multicorpos_veicular.setForeground(new java.awt.Color(255, 250, 250));
        Dinamica_multicorpos_veicular.setText("Dinâmica Multicorpos Veicular");

        Eletricidade_aplicada.setBackground(new java.awt.Color(94, 36, 211));
        Eletricidade_aplicada.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Eletricidade_aplicada.setForeground(new java.awt.Color(255, 250, 250));
        Eletricidade_aplicada.setText("Eletricidade Aplicada");

        Dinamica_de_veiculos.setBackground(new java.awt.Color(94, 36, 211));
        Dinamica_de_veiculos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Dinamica_de_veiculos.setForeground(new java.awt.Color(255, 250, 250));
        Dinamica_de_veiculos.setText("Dinamica De Veiculos");

        Sistemas_Embarcados.setBackground(new java.awt.Color(94, 36, 211));
        Sistemas_Embarcados.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Sistemas_Embarcados.setForeground(new java.awt.Color(255, 250, 250));
        Sistemas_Embarcados.setText("Sistemas Embarcados");

        Estrutura_de_dados_e_algoritimos.setBackground(new java.awt.Color(94, 36, 211));
        Estrutura_de_dados_e_algoritimos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Estrutura_de_dados_e_algoritimos.setForeground(new java.awt.Color(255, 250, 250));
        Estrutura_de_dados_e_algoritimos.setText("Estrutura de Dados e Algoritimos");

        Fisica1.setBackground(new java.awt.Color(94, 36, 211));
        Fisica1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fisica1.setForeground(new java.awt.Color(255, 250, 250));
        Fisica1.setText("Física 1");

        Eletronica_veicular.setBackground(new java.awt.Color(94, 36, 211));
        Eletronica_veicular.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Eletronica_veicular.setForeground(new java.awt.Color(255, 250, 250));
        Eletronica_veicular.setText("Eletrônica Veicular");

        Equacoes_Diferenciais1.setBackground(new java.awt.Color(94, 36, 211));
        Equacoes_Diferenciais1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Equacoes_Diferenciais1.setForeground(new java.awt.Color(255, 250, 250));
        Equacoes_Diferenciais1.setText("Equações Diferenciais 1");

        Fundamento_de_computiladores.setBackground(new java.awt.Color(94, 36, 211));
        Fundamento_de_computiladores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamento_de_computiladores.setForeground(new java.awt.Color(255, 250, 250));
        Fundamento_de_computiladores.setText("Fundamento de Compiladores");

        Fundamentos_da_teoria_eletromagnetica.setBackground(new java.awt.Color(94, 36, 211));
        Fundamentos_da_teoria_eletromagnetica.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamentos_da_teoria_eletromagnetica.setForeground(new java.awt.Color(255, 250, 250));
        Fundamentos_da_teoria_eletromagnetica.setText("Fundamentos da teoria Eletromagnética");

        Fundamento_de_arquitetura_de_computadores.setBackground(new java.awt.Color(94, 36, 211));
        Fundamento_de_arquitetura_de_computadores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamento_de_arquitetura_de_computadores.setForeground(new java.awt.Color(255, 250, 250));
        Fundamento_de_arquitetura_de_computadores.setText("Fundamento de Arquitetura de Computadores");

        Analise_de_sinais_e_design_de_circuitos.setBackground(new java.awt.Color(94, 36, 211));
        Analise_de_sinais_e_design_de_circuitos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Analise_de_sinais_e_design_de_circuitos.setForeground(new java.awt.Color(255, 250, 250));
        Analise_de_sinais_e_design_de_circuitos.setText("Analise de Sinais e Design de circuitos ");
        Analise_de_sinais_e_design_de_circuitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Analise_de_sinais_e_design_de_circuitosActionPerformed(evt);
            }
        });

        Fundamento_de_rede_de_computadores.setBackground(new java.awt.Color(94, 36, 211));
        Fundamento_de_rede_de_computadores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamento_de_rede_de_computadores.setForeground(new java.awt.Color(255, 250, 250));
        Fundamento_de_rede_de_computadores.setText("Fundamento de Redes de Computadores");

        Calculo1.setBackground(new java.awt.Color(94, 36, 211));
        Calculo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Calculo1.setForeground(new java.awt.Color(255, 250, 250));
        Calculo1.setText("Calculo 1");

        Fundamentos_de_sistemas_distribuidos.setBackground(new java.awt.Color(94, 36, 211));
        Fundamentos_de_sistemas_distribuidos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamentos_de_sistemas_distribuidos.setForeground(new java.awt.Color(255, 250, 250));
        Fundamentos_de_sistemas_distribuidos.setText("Fundamentos de Sistemas Distribuídos");

        Calculo2.setBackground(new java.awt.Color(94, 36, 211));
        Calculo2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Calculo2.setForeground(new java.awt.Color(255, 250, 250));
        Calculo2.setText("Calculo 2");

        Fundamentos_de_sistemas_operacionais.setBackground(new java.awt.Color(94, 36, 211));
        Fundamentos_de_sistemas_operacionais.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Fundamentos_de_sistemas_operacionais.setForeground(new java.awt.Color(255, 250, 250));
        Fundamentos_de_sistemas_operacionais.setText("Fundamentos de Sistemas Operacionais");

        Calculo3.setBackground(new java.awt.Color(94, 36, 211));
        Calculo3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Calculo3.setForeground(new java.awt.Color(255, 250, 250));
        Calculo3.setText("Calculo 3");

        Intrumentacao_eletronica.setBackground(new java.awt.Color(94, 36, 211));
        Intrumentacao_eletronica.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Intrumentacao_eletronica.setForeground(new java.awt.Color(255, 250, 250));
        Intrumentacao_eletronica.setText("Instrumentação Eletrônica");

        Introduca_a_Algebra_linear.setBackground(new java.awt.Color(94, 36, 211));
        Introduca_a_Algebra_linear.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Introduca_a_Algebra_linear.setForeground(new java.awt.Color(255, 250, 250));
        Introduca_a_Algebra_linear.setText("Introdução a Algebra Linear");

        Introducao_a_ciencia_da_computacao.setBackground(new java.awt.Color(94, 36, 211));
        Introducao_a_ciencia_da_computacao.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Introducao_a_ciencia_da_computacao.setForeground(new java.awt.Color(255, 250, 250));
        Introducao_a_ciencia_da_computacao.setText("Introdução a Ciência da Computação");

        Introducao_a_jogos_eletronicos.setBackground(new java.awt.Color(94, 36, 211));
        Introducao_a_jogos_eletronicos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Introducao_a_jogos_eletronicos.setForeground(new java.awt.Color(255, 250, 250));
        Introducao_a_jogos_eletronicos.setText("Introdução a Jogos Eletrônicos");

        Orientacao_a_objetos.setBackground(new java.awt.Color(94, 36, 211));
        Orientacao_a_objetos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Orientacao_a_objetos.setForeground(new java.awt.Color(255, 250, 250));
        Orientacao_a_objetos.setText("Orientação a Objetos");

        metodos_matematicos_para_engenharia.setBackground(new java.awt.Color(94, 36, 211));
        metodos_matematicos_para_engenharia.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        metodos_matematicos_para_engenharia.setForeground(new java.awt.Color(255, 250, 250));
        metodos_matematicos_para_engenharia.setText("Métodos Matemáticos para Engenharia ");

        Acustica_e_vibracoes_veiculares.setBackground(new java.awt.Color(94, 36, 211));
        Acustica_e_vibracoes_veiculares.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Acustica_e_vibracoes_veiculares.setForeground(new java.awt.Color(255, 250, 250));
        Acustica_e_vibracoes_veiculares.setText("Acustica e Vibracoes Veiculares");

        Metodos_numericos_para_engenharia.setBackground(new java.awt.Color(94, 36, 211));
        Metodos_numericos_para_engenharia.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Metodos_numericos_para_engenharia.setForeground(new java.awt.Color(255, 250, 250));
        Metodos_numericos_para_engenharia.setText("Métodos Numericos para Engenharia");

        Microprocessadores_e_Microcompiladores.setBackground(new java.awt.Color(94, 36, 211));
        Microprocessadores_e_Microcompiladores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Microprocessadores_e_Microcompiladores.setForeground(new java.awt.Color(255, 250, 250));
        Microprocessadores_e_Microcompiladores.setText("Microprocessadores e Microcompiladores");

        Circuitos_eletronicos1.setBackground(new java.awt.Color(94, 36, 211));
        Circuitos_eletronicos1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Circuitos_eletronicos1.setForeground(new java.awt.Color(255, 250, 250));
        Circuitos_eletronicos1.setText("Circuitos Eletronicos 1");

        Circuito_Eletronico2.setBackground(new java.awt.Color(94, 36, 211));
        Circuito_Eletronico2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Circuito_Eletronico2.setForeground(new java.awt.Color(255, 250, 250));
        Circuito_Eletronico2.setText("Circuitos Eletronicos 2");

        circuitos_eletronicos3.setBackground(new java.awt.Color(94, 36, 211));
        circuitos_eletronicos3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        circuitos_eletronicos3.setForeground(new java.awt.Color(255, 250, 250));
        circuitos_eletronicos3.setText("Circuitos Eletronicos 3");

        Comunicacoes_digitais_para_engenharia.setBackground(new java.awt.Color(94, 36, 211));
        Comunicacoes_digitais_para_engenharia.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Comunicacoes_digitais_para_engenharia.setForeground(new java.awt.Color(255, 250, 250));
        Comunicacoes_digitais_para_engenharia.setText("Comunicacoes Digitais Para Engenharia");

        Sistemas_Digitais2.setBackground(new java.awt.Color(94, 36, 211));
        Sistemas_Digitais2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Sistemas_Digitais2.setForeground(new java.awt.Color(255, 250, 250));
        Sistemas_Digitais2.setText("Sistemas Digitais 2");

        Processamento_de_sinais.setBackground(new java.awt.Color(94, 36, 211));
        Processamento_de_sinais.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Processamento_de_sinais.setForeground(new java.awt.Color(255, 250, 250));
        Processamento_de_sinais.setText("Processamento de Sinais");

        Principio_de_comunicacao.setBackground(new java.awt.Color(94, 36, 211));
        Principio_de_comunicacao.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Principio_de_comunicacao.setForeground(new java.awt.Color(255, 250, 250));
        Principio_de_comunicacao.setText("Princípios de Comunicação");

        Projeto_de_circuitos_Reconfiguraveis2.setBackground(new java.awt.Color(94, 36, 211));
        Projeto_de_circuitos_Reconfiguraveis2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Projeto_de_circuitos_Reconfiguraveis2.setForeground(new java.awt.Color(255, 250, 250));
        Projeto_de_circuitos_Reconfiguraveis2.setText("Projeto com Circuitos Reconfiguráveis 2");

        Projeto_com_circuitos_reconfiguraveis1.setBackground(new java.awt.Color(94, 36, 211));
        Projeto_com_circuitos_reconfiguraveis1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Projeto_com_circuitos_reconfiguraveis1.setForeground(new java.awt.Color(255, 250, 250));
        Projeto_com_circuitos_reconfiguraveis1.setText("Projeto com Circuitos Reconfiguráveis 1");

        Sensores_e_transdutores.setBackground(new java.awt.Color(94, 36, 211));
        Sensores_e_transdutores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Sensores_e_transdutores.setForeground(new java.awt.Color(255, 250, 250));
        Sensores_e_transdutores.setText("Sensores e Transdutores ");

        Projeto_de_microprocessadores.setBackground(new java.awt.Color(94, 36, 211));
        Projeto_de_microprocessadores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Projeto_de_microprocessadores.setForeground(new java.awt.Color(255, 250, 250));
        Projeto_de_microprocessadores.setText("Projeto de Microprocessadores");

        Sistemas_Digitais1.setBackground(new java.awt.Color(94, 36, 211));
        Sistemas_Digitais1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Sistemas_Digitais1.setForeground(new java.awt.Color(255, 250, 250));
        Sistemas_Digitais1.setText("Sistemas Digitais 1");

        Sitemas_de_controladores.setBackground(new java.awt.Color(94, 36, 211));
        Sitemas_de_controladores.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Sitemas_de_controladores.setForeground(new java.awt.Color(255, 250, 250));
        Sitemas_de_controladores.setText("Sistemas de Controles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Acustica_e_vibracoes_veiculares)
                    .addComponent(Analise_de_sinais_e_design_de_circuitos)
                    .addComponent(Calculo1)
                    .addComponent(Calculo2)
                    .addComponent(Calculo3)
                    .addComponent(Circuitos_eletronicos1)
                    .addComponent(Circuito_Eletronico2)
                    .addComponent(circuitos_eletronicos3)
                    .addComponent(Comunicacoes_digitais_para_engenharia)
                    .addComponent(Dinamica_de_veiculos)
                    .addComponent(Dinamica_multicorpos_veicular)
                    .addComponent(Eletricidade_aplicada)
                    .addComponent(Eletronica_veicular)
                    .addComponent(Equacoes_Diferenciais1)
                    .addComponent(Estrutura_de_dados_e_algoritimos)
                    .addComponent(Fisica1)
                    .addComponent(Fundamentos_da_teoria_eletromagnetica)
                    .addComponent(Fundamento_de_arquitetura_de_computadores)
                    .addComponent(Fundamento_de_computiladores)
                    .addComponent(Fundamento_de_rede_de_computadores)
                    .addComponent(Fundamentos_de_sistemas_distribuidos)
                    .addComponent(Fundamentos_de_sistemas_operacionais)
                    .addComponent(Intrumentacao_eletronica)
                    .addComponent(Introduca_a_Algebra_linear)
                    .addComponent(Introducao_a_jogos_eletronicos)
                    .addComponent(metodos_matematicos_para_engenharia)
                    .addComponent(Metodos_numericos_para_engenharia)
                    .addComponent(Microprocessadores_e_Microcompiladores)
                    .addComponent(Orientacao_a_objetos)
                    .addComponent(Principio_de_comunicacao)
                    .addComponent(Processamento_de_sinais)
                    .addComponent(Projeto_com_circuitos_reconfiguraveis1)
                    .addComponent(Projeto_de_circuitos_Reconfiguraveis2)
                    .addComponent(Projeto_de_microprocessadores)
                    .addComponent(Sensores_e_transdutores)
                    .addComponent(Introducao_a_ciencia_da_computacao)
                    .addComponent(Sitemas_de_controladores)
                    .addComponent(Sistemas_Digitais1)
                    .addComponent(Sistemas_Digitais2)
                    .addComponent(Sistemas_Embarcados))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Acustica_e_vibracoes_veiculares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Analise_de_sinais_e_design_de_circuitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Circuitos_eletronicos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Circuito_Eletronico2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(circuitos_eletronicos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comunicacoes_digitais_para_engenharia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dinamica_de_veiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dinamica_multicorpos_veicular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eletricidade_aplicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eletronica_veicular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Equacoes_Diferenciais1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Estrutura_de_dados_e_algoritimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fisica1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fundamentos_da_teoria_eletromagnetica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundamento_de_arquitetura_de_computadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundamento_de_computiladores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundamento_de_rede_de_computadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fundamentos_de_sistemas_distribuidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundamentos_de_sistemas_operacionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Intrumentacao_eletronica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Introduca_a_Algebra_linear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Introducao_a_ciencia_da_computacao)
                .addGap(3, 3, 3)
                .addComponent(Introducao_a_jogos_eletronicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(metodos_matematicos_para_engenharia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Metodos_numericos_para_engenharia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Microprocessadores_e_Microcompiladores, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Orientacao_a_objetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Principio_de_comunicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Processamento_de_sinais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Projeto_com_circuitos_reconfiguraveis1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Projeto_de_circuitos_Reconfiguraveis2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Projeto_de_microprocessadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sensores_e_transdutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sitemas_de_controladores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sistemas_Digitais1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sistemas_Digitais2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sistemas_Embarcados)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jBalterar.setBackground(new java.awt.Color(60, 2, 159));
        jBalterar.setForeground(new java.awt.Color(253, 251, 251));
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 19, 132));
        jLabel1.setText("Alterar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLnome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLsemestre)
                                .addGap(18, 18, 18)
                                .addComponent(cbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLmatricula)
                                        .addComponent(jLcurso))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTnome, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(jTcurso1)
                                        .addComponent(jTmatricula))))
                            .addComponent(jLabel1))
                        .addGap(0, 12, Short.MAX_VALUE))))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBalterar)
                .addContainerGap())
            .addComponent(jSeparator4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcurso)
                    .addComponent(jTcurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLmatricula)
                    .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsemestre)
                    .addComponent(cbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jBalterar)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        String nome = jTnome.getText();
        String matricula = jTmatricula.getText();
        String curso = jTcurso1.getText();
        String semestre = cbSemestre.getSelectedItem().toString();
        ControleAluno controle = new ControleAluno();
        controle.AlterarAluno(nome, matricula, curso, semestre);
        controle.chamaSerializarAlterar();

        verifica(Acustica_e_vibracoes_veiculares);
        verifica(Analise_de_sinais_e_design_de_circuitos);
        verifica(Calculo1);
        verifica(Calculo2);
        verifica(Calculo3);
        verifica(Circuitos_eletronicos1);
        verifica(Circuito_Eletronico2);
        verifica(circuitos_eletronicos3);
        verifica(Comunicacoes_digitais_para_engenharia);
        verifica(Dinamica_de_veiculos);

        //Chamar método que gera XML
        XmlDisciplinasCursadas.gerarXml(novas_disciplinasCursadas);

        //Visualizar dados da array, apenas para teste
        JOptionPane.showMessageDialog(null, "\nNovas Informações:\nNome: " + nome + "\nMatrícula: " + matricula + "\nCurso: " + curso + "\nSemestre: " + semestre + "\n" + novas_disciplinasCursadas);
        this.dispose();
    }//GEN-LAST:event_jBalterarActionPerformed

    private void Analise_de_sinais_e_design_de_circuitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Analise_de_sinais_e_design_de_circuitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Analise_de_sinais_e_design_de_circuitosActionPerformed

    public static void verifica(JCheckBox cb) {

        DisciplinaCursada dp = new DisciplinaCursada();
        int achei = 0;
        if (cb.isSelected()) {
            for (DisciplinaCursada dc : disciplinas) {
                if (dc.getNome().equalsIgnoreCase(cb.getText())) {
                    dp = new DisciplinaCursada(cb.getText(), dc.getCodigo(), dc.getCod_preReq());
                }
            }
            for (DisciplinaCursada ndc : novas_disciplinasCursadas) {
                if (ndc.getNome().equals(dp.getNome())) {
                    achei++;
                }
            }
            if (achei == 0) {
                novas_disciplinasCursadas.add(dp);
            }
        }
        if (!cb.isSelected()) {

            for (Iterator<DisciplinaCursada> it = novas_disciplinasCursadas.iterator(); it.hasNext();) {
                DisciplinaCursada n = it.next();
                if (cb.getText().contains(n.getNome())) {
                    it.remove();
                }
            }
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox Acustica_e_vibracoes_veiculares;
    public static javax.swing.JCheckBox Analise_de_sinais_e_design_de_circuitos;
    public static javax.swing.JCheckBox Calculo1;
    public static javax.swing.JCheckBox Calculo2;
    public static javax.swing.JCheckBox Calculo3;
    public static javax.swing.JCheckBox Circuito_Eletronico2;
    public static javax.swing.JCheckBox Circuitos_eletronicos1;
    public static javax.swing.JCheckBox Comunicacoes_digitais_para_engenharia;
    public static javax.swing.JCheckBox Dinamica_de_veiculos;
    private javax.swing.JCheckBox Dinamica_multicorpos_veicular;
    private javax.swing.JCheckBox Eletricidade_aplicada;
    private javax.swing.JCheckBox Eletronica_veicular;
    private javax.swing.JCheckBox Equacoes_Diferenciais1;
    private javax.swing.JCheckBox Estrutura_de_dados_e_algoritimos;
    private javax.swing.JCheckBox Fisica1;
    private javax.swing.JCheckBox Fundamento_de_arquitetura_de_computadores;
    private javax.swing.JCheckBox Fundamento_de_computiladores;
    private javax.swing.JCheckBox Fundamento_de_rede_de_computadores;
    private javax.swing.JCheckBox Fundamentos_da_teoria_eletromagnetica;
    private javax.swing.JCheckBox Fundamentos_de_sistemas_distribuidos;
    private javax.swing.JCheckBox Fundamentos_de_sistemas_operacionais;
    private javax.swing.JCheckBox Introduca_a_Algebra_linear;
    private javax.swing.JCheckBox Introducao_a_ciencia_da_computacao;
    private javax.swing.JCheckBox Introducao_a_jogos_eletronicos;
    private javax.swing.JCheckBox Intrumentacao_eletronica;
    private javax.swing.JCheckBox Metodos_numericos_para_engenharia;
    private javax.swing.JCheckBox Microprocessadores_e_Microcompiladores;
    private javax.swing.JCheckBox Orientacao_a_objetos;
    private javax.swing.JCheckBox Principio_de_comunicacao;
    private javax.swing.JCheckBox Processamento_de_sinais;
    private javax.swing.JCheckBox Projeto_com_circuitos_reconfiguraveis1;
    private javax.swing.JCheckBox Projeto_de_circuitos_Reconfiguraveis2;
    private javax.swing.JCheckBox Projeto_de_microprocessadores;
    private javax.swing.JCheckBox Sensores_e_transdutores;
    private javax.swing.JCheckBox Sistemas_Digitais1;
    private javax.swing.JCheckBox Sistemas_Digitais2;
    private javax.swing.JCheckBox Sistemas_Embarcados;
    private javax.swing.JCheckBox Sitemas_de_controladores;
    public javax.swing.JComboBox cbSemestre;
    public static javax.swing.JCheckBox circuitos_eletronicos3;
    private javax.swing.JButton jBalterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcurso;
    private javax.swing.JLabel jLmatricula;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLsemestre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField jTcurso1;
    public javax.swing.JTextField jTmatricula;
    public javax.swing.JTextField jTnome;
    private javax.swing.JCheckBox metodos_matematicos_para_engenharia;
    // End of variables declaration//GEN-END:variables
}
