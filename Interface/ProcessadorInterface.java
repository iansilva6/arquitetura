package Interface;
import Processador.Memoria;
import Processador.Decodificador;
import Processador.ULA;
import Processador.RegistradorEstado;
import Processador.Registradores;
import Processador.OutrasInstrucoes;
import java.awt.Color;


public class ProcessadorInterface extends javax.swing.JFrame {
    private String [] memoria;
    private String instrucao;
    private String reg;
    private int contadorPrograma=0;
    private int operando1;
    private int operando2;
    private int estado=0;


    public ProcessadorInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Processador");
        setFocusableWindowState(false);
        setResizable(false);

        jLabel2.setText("0");

        jTextField1.setEditable(false);
        jTextField1.setForeground(Color.red);
        jTextField2.setForeground(Color.red);
        jTextField3.setForeground(Color.red);
        jTextField4.setForeground(Color.red);
        jTextField5.setForeground(Color.red);
        jTextField6.setForeground(Color.red);
        jTextField7.setForeground(Color.red);
        jTextField8.setForeground(Color.red);
        jTextField9.setForeground(Color.red);
        jTextField10.setForeground(Color.red);
        jTextField11.setForeground(Color.red);
        jTextField12.setForeground(Color.red);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("1");

        jTextField2.setEditable(false);

        jLabel4.setText("2");

        jTextField3.setEditable(false);

        jLabel5.setText("3");

        jTextField4.setEditable(false);

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jToggleButton1.setText("Busca");
        jToggleButton1.setEnabled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Decodificador");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Exec ");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("ULA");
        jButton3.setEnabled(false);

        jTextField9.setEditable(false);

        jTextField10.setEditable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Memória");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("DataSheet");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Instrução 1: ADD\nInstrução de soma de inteiros de até 14 bits.\nOs quatro primeiros dígitos são representados pela instrução(instrução 0000)\nos 14 seguintes por  o primeiro operando e os últimos 14 o segundo operando.\n[INS   | OPERANDO 1|OPERANDO 2]\nInstrução 2: SUB\nIdêntica a instrução ADD faz a subtração de inteiros de 14 bits.\nOs quatro primeiros dígitos são representados pela instrução(instrução 0001)\nos 14 seguintes por  o primeiro operando e os últimos 14 o segundo operando.\n[INS   | OPERANDO 1|OPERANDO 2]\nInstrução 3: MUL\nFaz a multiplicação de dois inteiros de 14 bits.\nOs quatro primeiros dígitos são representados pela instrução(instrução 0010)\nos 14 seguintes por  o primeiro operando e os últimos 14 o segundo operan-\ndo.\n[INS   | OPERANDO 1|OPERANDO 2]\nInstrução 4:DIV\nFaz a divisão inteira de dois operandos de 14 bits, ou seja, em caso de divisão\nnão exata ela retorna um inteiro aproximado com resultado.\nOs quatro primeiros dígitos são representados pela instrução(instrução 0011)\nos 14 seguintes por  o primeiro operando e os últimos 14 o segundo operando.\n[INS   | OPERANDO 1|OPERANDO 2]\nInstrução 5: FDIV\nUma variação da instrução DIV que retorna o resultado da divisão de dois \noperandos de 14 bits em formato float.\nOs quatro primeiros dígitos são representados pela instrução(instrução 0100)\nos 14 seguintes por  o primeiro operando e os últimos 14 o segundo operando.\n[INS   | OPERANDO 1|OPERANDO 2]\nInstrução 6: INZ\nRecebe um endereço de memória e um registrador e faz o “jump” para o endere-\nço recebido enquanto o registrador selecionado não chegar a 0, a própria ins-\ntrução subtrai o 1 do registrador a cada jump.\nOs quatro primeiro bits são a instrução(0101), os 14 bits seguintes são reserva-\ndos para o endereço de memória, os 10 bits seguintes são sempre 0 e os 4 últi-\nmos o registrador.\n[INS | ENDEREÇO | ZEROS    |REGIS]\nInstrução 7:MOV\nMove um valor de 14 bits para o registrador selecionado.\nOs quatro primeiros bits são a instrução(0111), 10 bits com 0, 4 bits para o regis-\ntrador e 14 bits com o valor de 14 bits.\n[INS| ZEROS |REGIS|  VALOR      ]\nInstrução 8: ADR\nAdiciona um valor de 14 bits ao registrador informado.\nOs quatro primeiros bits são a instrução(1000), 10 bits com 0, 4 bits para o regis-\ntrador e 14 bits com o valor de 14 bits.\n[INS| ZEROS |REGIS|  VALOR      ]\nINSTRUÇÃO 9: ARR\nSoma os valores em EAX e EBX \nOs quatro primeiro bits são a instrução,10 zeros ,EAX ,10 zeros, EBX\n[INS| ZEROS |EAX |ZEROS |EBX]");
        jTextArea1.setCaretPosition(0);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setText("Contador de programa");

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jToggleButton3.setText("Outras Instruções");
        jToggleButton3.setEnabled(false);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);

        jButton5.setText("Proximo Estado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Instrução:");

        jLabel9.setText("Operando 1:");

        jLabel11.setText("Operando 2:");

        jLabel12.setText("Resultado");

        jLabel13.setText("N|Z|D|OI");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programa 1", "Programa 2", "Programa 3", "Programa 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Legenda:");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("As caixinhhas representam as par-\ntes do processador.\nOs Rotulos são os nomes.\nEm Vermelho os dados.\nRegistrador de Estado:\nN - Negativo\nZ - Zero\nD - Divisão por zero\nOI- Outras Instruções(mov,inz,etc)\n");
        jTextArea2.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel8.setText("Escolha o Programa para carregar:");

        jButton6.setText("Carregar Programa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Palavra");

        jLabel15.setText("Endereço de memória");

        jTextField13.setEditable(false);

        jTextField14.setEditable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setEditable(false);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel16.setText("Registradores:");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("EAX - 32 bits -  0000\nEBX - 32 bits -  0001\nECX - 32 bits -  0010\nEDX - 32 bits -  0011");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addComponent(jLabel15)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(190, 190, 190)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13))
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(27, 27, 27)
                                .addComponent(jButton5)
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            jTextField5.setText(memoria[contadorPrograma]);
            contadorPrograma++;
            
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    private void setColor(int i){
        switch(i){
            case 0:
                jTextField1.setBackground(Color.YELLOW);
                jTextField2.setBackground(Color.WHITE);
                jTextField3.setBackground(Color.WHITE);
                jTextField4.setBackground(Color.WHITE);
                break;
            case 1:
                jTextField1.setBackground(Color.WHITE);
                jTextField2.setBackground(Color.YELLOW);
                jTextField3.setBackground(Color.WHITE);
                jTextField4.setBackground(Color.WHITE);
                break;  
            case 2:
               jTextField1.setBackground(Color.WHITE);
                jTextField2.setBackground(Color.WHITE);
                jTextField3.setBackground(Color.YELLOW);
                jTextField4.setBackground(Color.WHITE);
                break;
            case 3: 
                jTextField1.setBackground(Color.WHITE);
                jTextField2.setBackground(Color.WHITE);
                jTextField3.setBackground(Color.WHITE);
                jTextField4.setBackground(Color.YELLOW);
                break;
            default:
                jTextField1.setBackground(Color.WHITE);
                jTextField2.setBackground(Color.WHITE);
                jTextField3.setBackground(Color.WHITE);
                jTextField4.setBackground(Color.WHITE);
                
        }
    }
          
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(memoria[0].substring(0,4));
        instrucao=Decodificador.getInstrucao(memoria[contadorPrograma].substring(0, 4));
        jTextField7.setText(instrucao);
        if (instrucao.equals("add")||instrucao.equals("sub")||instrucao.equals("mul")||instrucao.equals("div")||instrucao.equals("fdiv")){
            operando1 = Decodificador.getOperador(memoria[contadorPrograma].substring(4, 18));
            jTextField6.setText(Integer.toString(operando1));
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));}
        if (instrucao.equals("mov")){
            reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
            System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText(reg);
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));
        }
           if (instrucao.equals("adr")){
            reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
            System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText(reg);
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));
        }
          if (instrucao.equals("arr")){
           // reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
           // System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText("eax");
            //operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText("ebx");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (instrucao.equals("add")||instrucao.equals("sub")||instrucao.equals("mul")||instrucao.equals("div")||instrucao.equals("fdiv")){
           String resultado=ULA.executaOperacaoMatematica(instrucao,operando1,operando2);
           jTextField9.setText(resultado);
           //Integer.toString(RegistradorEstado.geraEstado(resultado));
           if(instrucao.equals("fdiv")){
            if(resultado.equals("erro div 0")){
               jTextField10.setText("0010");
           }else{
           jTextField10.setText(RegistradorEstado.geraEstado(Integer.parseInt(resultado.substring(0,2))));
            }
           }else{
           if(resultado.equals("erro div 0")){
               jTextField10.setText("0010");
           }else{
           jTextField10.setText(RegistradorEstado.geraEstado(Integer.parseInt(resultado)));}
       }}
       if(instrucao.equals("mov")){
           jTextField12.setText("mov "+reg+ " "+operando2);
           OutrasInstrucoes.setRegistrador(reg, operando2);
           jTextField10.setText("0001");
       }
       if(instrucao.equals("adr")){
           jTextField12.setText("adr "+reg+ " "+operando2);
           OutrasInstrucoes.setRegistrador(reg, operando2);
           jTextField10.setText("0001");
       }
              if(instrucao.equals("arr")){
           jTextField12.setText("adr eax ebx");
           jTextField10.setText("0001");
           jTextField9.setText(Integer.toString(Registradores.eax+Registradores.ebx));
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
            jTextField1.setText(memoria[0]);
            jTextField2.setText(memoria[1]);
            jTextField3.setText(memoria[2]);
            jTextField4.setText(memoria[3]);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(estado==0){
            jTextField5.setText(memoria[contadorPrograma]);
            
        }
        if(estado==1){
              /* jTextField5.setText(" ");
              jTextField6.setText(" ");
              jTextField7.setText(" ");
              jTextField8.setText(" ");
              jTextField9.setText(" ");
              jTextField10.setText(" ");
              jTextField12.setText(" ");
              jTextField13.setText(" ");
              jTextField14.setText(" ");
              jTextField15.setText(" ");
              jTextField16.setText(" ");*/
                    System.out.println(memoria[0].substring(0,4));
        instrucao=Decodificador.getInstrucao(memoria[contadorPrograma].substring(0, 4));
        jTextField7.setText(instrucao);
        jTextField13.setText(memoria[contadorPrograma].substring(0, 4));
        if (instrucao.equals("add")||instrucao.equals("sub")||instrucao.equals("mul")||instrucao.equals("div")||instrucao.equals("fdiv")){
            operando1 = Decodificador.getOperador(memoria[contadorPrograma].substring(4, 18));
            jTextField6.setText(Integer.toString(operando1));
            
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));}
        jTextField14.setText(memoria[contadorPrograma].substring(4, 18));
        jTextField15.setText(memoria[contadorPrograma].substring(19, 32));
        if (instrucao.equals("mov")){
            reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
            System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText(reg);
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));
            jTextField14.setText(memoria[contadorPrograma].substring(12, 16));
            jTextField15.setText(memoria[contadorPrograma].substring(19, 32));
        }
           if (instrucao.equals("adr")){
            reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
            System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText(reg);
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));
            jTextField14.setText(memoria[contadorPrograma].substring(12, 16));
            jTextField15.setText(memoria[contadorPrograma].substring(19, 32));
        }
          if (instrucao.equals("arr")){
           // reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
           // System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText("eax");
            jTextField14.setText("0000");
            jTextField15.setText("0001");
            //operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText("ebx");
        }
          if(instrucao.equals("inz")){
            reg=Decodificador.getRegistrador(memoria[contadorPrograma].substring(12,16));
            System.out.println(memoria[contadorPrograma].substring(12,16));
            jTextField6.setText(reg);
            operando2 = Decodificador.getOperador(memoria[contadorPrograma].substring(19, 32));
            jTextField8.setText(Integer.toString(operando2));
            jTextField14.setText(memoria[contadorPrograma].substring(12, 16));
            jTextField15.setText(memoria[contadorPrograma].substring(19, 32));
          }
        }
        if(estado==2){
                  if (instrucao.equals("add")||instrucao.equals("sub")||instrucao.equals("mul")||instrucao.equals("div")||instrucao.equals("fdiv")){
           String resultado=ULA.executaOperacaoMatematica(instrucao,operando1,operando2);
           jTextField9.setText(resultado);
           if(instrucao.equals("fdiv")){
               //Float.parseFloat(resultado);
               
           }else{
          
           jTextField16.setText(Integer.toBinaryString(Integer.parseInt(resultado)));
           }
           //Integer.toString(RegistradorEstado.geraEstado(resultado));
           if(instrucao.equals("fdiv")){
            if(resultado.equals("erro div 0")){
               jTextField10.setText("0010");
           }else{
           jTextField10.setText(RegistradorEstado.geraEstado(Integer.parseInt(resultado.substring(0,2))));
            }
           }else{
           if(resultado.equals("erro div 0")){
               jTextField10.setText("0010");
           }else{
           jTextField10.setText(RegistradorEstado.geraEstado(Integer.parseInt(resultado)));}
       }
           contadorPrograma++;
           setColor(contadorPrograma);
                  }
       if(instrucao.equals("mov")){
           jTextField12.setText("mov "+reg+ " "+operando2);
           OutrasInstrucoes.setRegistrador(reg, operando2);
           contadorPrograma++;
           setColor(contadorPrograma);
           jTextField10.setText("0001");
       }
       if(instrucao.equals("adr")){
           jTextField12.setText("adr "+reg+ " "+operando2);
           OutrasInstrucoes.addRegistrador(reg, operando2);
           contadorPrograma++;
           setColor(contadorPrograma);
           jTextField10.setText("0001");
       }
              if(instrucao.equals("arr")){
           jTextField12.setText("adr eax ebx");
           jTextField9.setText(Integer.toString(Registradores.eax+Registradores.ebx));
           contadorPrograma++;
           setColor(contadorPrograma);
           jTextField10.setText("0001");
       }
              
              jTextField11.setText(Integer.toString(contadorPrograma));
              if(instrucao.equals("inz")){
                  if(Registradores.eax!=0){
                  OutrasInstrucoes.decRegistrador(reg);
                  contadorPrograma=operando2;
                  setColor(operando2);
                   jTextField12.setText("dec eax and jmp");      
                  }else{
                     jTextField9.setText(Integer.toString(Registradores.ebx));
                     jTextField12.setText("end of inz");  
                     jTextField10.setText(RegistradorEstado.geraEstado(Registradores.ebx));
                  }
                  
              }
              //apaga os campos

        }
        
        
        if(contadorPrograma==4){
            contadorPrograma=0;
            setColor(0);
            jTextField11.setText("0");
        }
        if(estado==2){estado=0;
        }else{
        estado++;}
        System.out.println(estado);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                     System.out.println(jComboBox1.getSelectedIndex()+1);
            memoria = Memoria.carregaPrograma(jComboBox1.getSelectedIndex()+1);
            jTextField1.setText(memoria[0]);
            jTextField2.setText(memoria[1]);
            jTextField3.setText(memoria[2]);
            jTextField4.setText(memoria[3]);
            contadorPrograma=0;
            jTextField11.setText(Integer.toString(contadorPrograma));
            setColor(contadorPrograma);
            
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcessadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new ProcessadorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
