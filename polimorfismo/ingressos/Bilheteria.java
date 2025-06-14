//package bilheteria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Bilheteria extends javax.swing.JFrame {
    
    Ingresso ingresso;
    Normal normal;
    Vip vip;
    CamaroteInferior camaroteInferior;
    CamaroteSuperior camaroteSuperior;

    String texto = "";  
    public void limpa(){
        jLValor.setVisible(false);
        jTFValor.setVisible(false);
        jLPista.setVisible(false);
        jCBPista.setVisible(false);
        jLAdicional.setVisible(false);
        jTFAdicional.setVisible(false);
        jCBCamarote.removeAllItems();
        jLCamarote.setVisible(false);
        jCBCamarote.setVisible(false);
        jBCadastrar.setEnabled(false);
    }
    public Bilheteria() {
        initComponents();
        limpa();
        

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox1.getSelectedIndex()==0){
                    limpa();
                }
                if(comboBox1.getSelectedIndex()==1){
                    jLValor.setVisible(true);
                    jTFValor.setVisible(true);
                    jLPista.setVisible(false);
                    jCBPista.setVisible(false);
                    jLAdicional.setVisible(false);
                    jTFAdicional.setVisible(false);
                    jCBCamarote.removeAllItems();
                    jLCamarote.setVisible(false);
                    jCBCamarote.setVisible(false);
                    jBCadastrar.setEnabled(true);
                }
                if(comboBox1.getSelectedIndex()==2){
                    jLValor.setVisible(true);
                    jTFValor.setVisible(true);
                    jLPista.setVisible(true);
                    jCBPista.setVisible(true);

                    jLAdicional.setVisible(false);
                    jTFAdicional.setVisible(false);
                    jCBCamarote.removeAllItems();
                    jLCamarote.setVisible(false);
                    jCBCamarote.setVisible(false);
                    jBCadastrar.setEnabled(true);
                }
                if(comboBox1.getSelectedIndex()==3){
                    jLValor.setVisible(true);
                    jTFValor.setVisible(true);
                    jLAdicional.setVisible(true);
                    jTFAdicional.setVisible(true);

                    jLPista.setVisible(false);
                    jCBPista.setVisible(false);
                    jCBCamarote.removeAllItems();
                    jLCamarote.setVisible(false);
                    jCBCamarote.setVisible(false);
                    jBCadastrar.setEnabled(true);
                }
                if(comboBox1.getSelectedIndex()==4){
                    jLValor.setVisible(true);
                    jTFValor.setVisible(true);
                    jCBCamarote.removeAllItems();
                    jCBCamarote.addItem("A");
                    jCBCamarote.addItem("B");
                    jLCamarote.setVisible(true);
                    jCBCamarote.setVisible(true);

                    jLPista.setVisible(false);
                    jCBPista.setVisible(false);
                    jLAdicional.setVisible(true);
                    jTFAdicional.setVisible(true);
                    jBCadastrar.setEnabled(true);
                }
                if(comboBox1.getSelectedIndex()==5){
                    jLValor.setVisible(true);
                    jTFValor.setVisible(true);
                    jCBCamarote.removeAllItems();
                    jCBCamarote.addItem("FRONTAL");
                    jCBCamarote.addItem("LATERAL");
                    jLCamarote.setVisible(true);
                    jCBCamarote.setVisible(true);

                    jLPista.setVisible(false);
                    jCBPista.setVisible(false);
                    jLAdicional.setVisible(true);
                    jTFAdicional.setVisible(true);
                    jBCadastrar.setEnabled(true);
                }
                jCBVenda.setSelectedIndex(0);
            }

        });
        jBCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jCBVenda.setSelectedIndex(0);
                boolean sucesso = false;

                if(comboBox1.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(null, "Selecione uma opção.");
                }
                if(comboBox1.getSelectedIndex()==1){
                    if(jTFValor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso.");
                    }else {
                        try {
                            Double valor = Double.valueOf(jTFValor.getText());
                            ingresso = new Ingresso(valor);
                            comboBox1.setSelectedIndex(0);
                            sucesso = true;
                            JOptionPane.showMessageDialog(null, "Ingresso cadastrado com sucesso.");
						}catch (Exception e1){
							JOptionPane.showMessageDialog(null, "Valor inválido.");
                        }catch (Throwable t){
							sucesso = true;
                            JOptionPane.showMessageDialog(null, "Classe Ingresso não encontrada.");
                        }
                    }
                }

                if(comboBox1.getSelectedIndex()==2){
                    if(jTFValor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso.");
                    }else {
                        try {
                            Double valor = Double.valueOf(jTFValor.getText());
                            boolean pista = jCBPista.isSelected();
                            normal = new Normal(valor, pista);
                            comboBox1.setSelectedIndex(0);
                            sucesso = true;
                            JOptionPane.showMessageDialog(null, "Ingresso Normal cadastrado com sucesso.");
                        }catch (Exception e1){
							JOptionPane.showMessageDialog(null, "Valor inválido.");
                        }catch (Throwable t){
							sucesso = true;
                            JOptionPane.showMessageDialog(null, "Classe Normal não encontrada.");
                        }
                    }
                }

                if(comboBox1.getSelectedIndex()==3){
                    if(jTFValor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso.");
                    }else{
                        if(jTFAdicional.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Informe o valor adicional.");
                        }else {
                            try {
                                Double valor = Double.valueOf(jTFValor.getText());
                                Double adicional = Double.valueOf(jTFAdicional.getText());
                                vip = new Vip(valor, adicional);
                                comboBox1.setSelectedIndex(0);
                                sucesso = true;
                                JOptionPane.showMessageDialog(null, "Ingresso VIP cadastrado com sucesso.");
                            }catch (Exception e1){
								JOptionPane.showMessageDialog(null, "Valor inválido.");
							}catch (Throwable t){
								sucesso = true;
								JOptionPane.showMessageDialog(null, "Classe VIP não encontrada.");
							}
                        }
                    }
                }

                if(comboBox1.getSelectedIndex()==4){
                    if(jTFValor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso.");
                    }else{
                        if(jTFAdicional.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Informe o valor adicional.");
                        }else {
                            try {
                                Double valor = Double.valueOf(jTFValor.getText());
                                Double adicional = Double.valueOf(jTFAdicional.getText());
                                char classe = (jCBCamarote.getSelectedItem().toString()).charAt(0);
                                camaroteSuperior = new CamaroteSuperior(valor, adicional, classe);
                                comboBox1.setSelectedIndex(0);
                                sucesso = true;
                                JOptionPane.showMessageDialog(null, "Ingresso Camarote Superior cadastrado com sucesso.");
                            }catch (Exception e1){
								JOptionPane.showMessageDialog(null, "Valor inválido.");
							}catch (Throwable t){
								sucesso = true;
								JOptionPane.showMessageDialog(null, "Classe CamaroteSuperior não encontrada.");
							}
                        }
                    }
                }

                if(comboBox1.getSelectedIndex()==5){
                    if(jTFValor.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso.");
                    }else{
                        if(jTFAdicional.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Informe o valor adicional.");
                        }else {
                            try {
                                Double valor = Double.valueOf(jTFValor.getText());
                                Double adicional = Double.valueOf(jTFAdicional.getText());
                                String camarote = jCBCamarote.getSelectedItem().toString();
                                camaroteInferior = new CamaroteInferior(valor, adicional, camarote);
                                comboBox1.setSelectedIndex(0);
                                sucesso = true;
                                JOptionPane.showMessageDialog(null, "Ingresso Camarote Inferior cadastrado com sucesso.");
                            }catch (Exception e1){
								JOptionPane.showMessageDialog(null, "Valor inválido.");
							}catch (Throwable t){
								sucesso = true;
								JOptionPane.showMessageDialog(null, "Classe CamaroteInferior não encontrada.");
							}
                        }
                    }
                }
                if(sucesso) {
                    jTFValor.setText("");
                    jCBPista.setSelected(false);
                    jTFAdicional.setText("");
                    jCBCamarote.removeAllItems();
                    comboBox1.setSelectedIndex(0);
                }

            }
        });
        jCBVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jCBVenda.getSelectedIndex()==0){
                    jTAVenda.setText("");
                }
                if(jCBVenda.getSelectedIndex()==1){
                    try {
                        jTAVenda.setText("");
                        texto = "INGRESSO\nValor R$ "+ String.format("%.2f", ingresso.mostraValor());
                        jTAVenda.setText(texto);
                    }catch(Exception e1){
                        JOptionPane.showMessageDialog(null, "Ingresso não cadastrado.");
                        jCBVenda.setSelectedIndex(0);
                    }catch (Throwable t){
						JOptionPane.showMessageDialog(null, "Classe Ingresso não encontrada.");
						jCBVenda.setSelectedIndex(0);
					}
                }
                if(jCBVenda.getSelectedIndex()==2){
                    try {
                        jTAVenda.setText("");
                        texto = "INGRESSO NORMAL\nValor R$ "+ String.format("%.2f", normal.getValor());
                        if(normal.getPista()) {
                            texto += "\nCOM acesso à pista";
                        }else {
                            texto += "\nSEM acesso à pista";
                        }
                        texto += "\nTotal R$ " + String.format("%.2f", normal.mostraValor());
                        jTAVenda.setText(texto);
                    }catch(Exception e1){
                        JOptionPane.showMessageDialog(null, "Ingresso não cadastrado.");
                        jCBVenda.setSelectedIndex(0);
                    }catch (Throwable t){
						jCBVenda.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, "Classe Normal não encontrada.");
					}
                }
                if(jCBVenda.getSelectedIndex()==3){
                    try {
                        jTAVenda.setText("");
                        texto = "INGRESSO VIP\nValor R$ "+ String.format("%.2f", vip.getValor());
                        texto += "\nAdicional R$ "+ String.format("%.2f", vip.getAdicional());
                        texto += "\nTotal R$ "+  String.format("%.2f", vip.mostraValor());
                        jTAVenda.setText(texto);
                    }catch(Exception e1){
                        JOptionPane.showMessageDialog(null, "Ingresso não cadastrado.");
                        jCBVenda.setSelectedIndex(0);
                    }catch (Throwable t){
						jCBVenda.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, "Classe Vip não encontrada.");
					}
                }
                if(jCBVenda.getSelectedIndex()==4){
                    try {
                        jTAVenda.setText("");
                        texto = "INGRESSO VIP CAMAROTE SUPERIOR\nValor R$ "+ String.format("%.2f", camaroteSuperior.getValor());
                        texto += "\nAdicional R$ "+ String.format("%.2f", camaroteSuperior.getAdicional());
                        texto += "\nClasse "+ camaroteSuperior.getClasse();
                        texto += "\nTotal R$ "+  String.format("%.2f", camaroteSuperior.mostraValor());
                        jTAVenda.setText(texto);
                    }catch(Exception e1){
                        JOptionPane.showMessageDialog(null, "Ingresso não cadastrado.");
                        jCBVenda.setSelectedIndex(0);
                    }catch (Throwable t){
						jCBVenda.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, "Classe CamaroteSuperior não encontrada.");
					}
                }
                if(jCBVenda.getSelectedIndex()==5){
                    try {
                        jTAVenda.setText("");
                        texto = "INGRESSO VIP CAMAROTE INFERIOR\nValor R$ "+ String.format("%.2f", camaroteInferior.getValor());
                        texto += "\nAdicional R$ "+ String.format("%.2f", camaroteInferior.getAdicional());
                        texto += "\nLocalização "+ camaroteInferior.getLocalizacao();
                        texto += "\nTotal R$ "+  String.format("%.2f", camaroteInferior.mostraValor());
                        jTAVenda.setText(texto);
                    }catch(Exception e1){
                        JOptionPane.showMessageDialog(null, "Ingresso não cadastrado.");
                        jCBVenda.setSelectedIndex(0);
                    }catch (Throwable t){
						jCBVenda.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, "Classe CamaroteInferior não encontrada.");
					}
                }
                //comboBox1.setSelectedIndex(0);
                if(jCBVenda.getSelectedIndex()>0){
                    jBVenda.setEnabled(true);
                }else{
                    jBVenda.setEnabled(false);
                }
            }
        });
        jBVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Obrigado pela compra.");
                jCBVenda.setSelectedIndex(0);
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        jBCadastrar = new javax.swing.JButton();
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jLPista = new javax.swing.JLabel();
        jCBPista = new javax.swing.JCheckBox();
        jLAdicional = new javax.swing.JLabel();
        jTFAdicional = new javax.swing.JTextField();
        jLCamarote = new javax.swing.JLabel();
        jCBCamarote = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jCBVenda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAVenda = new javax.swing.JTextArea();
        jBVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILHETERIA");

        jButton1.setText("FECHAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE INGRESSO");

        jLabel3.setText("TIPO");

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "INGRESSO", "NORMAL", "VIP", "C. SUPERIOR", "C. INFERIOR" }));

        jBCadastrar.setText("CADASTRAR");
        jBCadastrar.setEnabled(false);

        jLValor.setText("VALOR R$");

        jLPista.setText("PISTA");

        jCBPista.setText("SIM");

        jLAdicional.setText("ADICIONAL");

        jLCamarote.setText("CAMAROTE");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VENDA DE INGRESSO");

        jLTipo.setText("TIPO");

        jCBVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "INGRESSO", "INGRESSO NORMAL", "INGRESSO VIP", "INGRESSO VIP C. SUPERIOR", "INGRESSO VIP C. INFERIOR" }));

        jTAVenda.setEditable(false);
        jTAVenda.setColumns(20);
        jTAVenda.setRows(5);
        jScrollPane1.setViewportView(jTAVenda);

        jBVenda.setText("COMPRAR");
        jBVenda.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLPista)
                                .addGap(18, 18, 18)
                                .addComponent(jCBPista))
                            .addComponent(jBCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLValor)
                                .addGap(18, 18, 18)
                                .addComponent(jTFValor))
                            .addComponent(comboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCamarote)
                                    .addComponent(jLAdicional))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCamarote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFAdicional))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(198, 198, 198))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1)
                                            .addComponent(jCBVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBVenda))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValor)
                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPista)
                            .addComponent(jCBPista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAdicional)
                            .addComponent(jTFAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCamarote))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBVenda)
                            .addComponent(jBCadastrar))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bilheteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBCamarote;
    private javax.swing.JCheckBox jCBPista;
    private javax.swing.JComboBox<String> jCBVenda;
    private javax.swing.JLabel jLAdicional;
    private javax.swing.JLabel jLCamarote;
    private javax.swing.JLabel jLPista;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAVenda;
    private javax.swing.JTextField jTFAdicional;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
