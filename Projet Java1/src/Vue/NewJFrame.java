/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
/**
 *
 * @author Thomas
 */
public class NewJFrame extends javax.swing.JFrame {
    String envoie="";
    String envoieTable="";

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(176, 149, 167));
        jPanel5.setForeground(new java.awt.Color(56, 69, 67));

        jLabel1.setText("                          Mise à jour");

        jRadioButton1.setBackground(new java.awt.Color(176, 149, 167));
        jRadioButton1.setText("Modifier");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(176, 149, 167));
        jRadioButton2.setText("Ajouter");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(176, 149, 167));
        jRadioButton3.setText("Supprimer");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(176, 149, 167));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chambre", "Docteur", "Employé", "Hospitalisation", "Infirmier", "Malade", "Service", "Soigne" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("   Que voulez-vous faire ?");

        jPanel1.setBackground(new java.awt.Color(176, 149, 167));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(176, 149, 167));
        jButton1.setText("retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        envoie = "INSERT INTO";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        envoie = "DELETE";
        System.out.println("bonjour");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        envoie = "UPDATE";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        /*if(envoie == "UPDATE"){
                
        }
        else{
            envoie = envoie + evt.getSource();
        }*/
        System.out.println(evt.getSource());
        JComboBox teste = (JComboBox)evt.getSource();
        String testee = (String)teste.getSelectedItem();
        if(testee == "Chambre"){
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
        
        
        
        else if(testee == "Docteur"){
            System.out.println("bonjour2");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour 45");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
            
        }
        
        
        
        
        else if(testee == "Employe"){
            System.out.println("bonjour3");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        else if(testee == "Hospitalisation"){
            System.out.println("bonjour4");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
        
        else if(testee == "Infirmier"){
            System.out.println("bonjour5");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
        
        
        
        
        else if(testee == "Malade"){
            System.out.println("bonjour6");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
        
        
        
        else if(testee == "Service"){
            System.out.println("bonjour7");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
        
        
        else if(testee == "Soigne"){
            System.out.println("bonjour8");
            if(envoie == "INSERT INTO"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestAjouter ajout = null;
                try {
                    ajout = new TestAjouter(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                ajout.setVisible(true);
                
                //System.out.println("bonjour1");
            }
            else if(envoie == "UPDATE")
            {
                System.out.println("bonjour non");
                envoie = testee; 
                System.out.println(envoie);
                TestModifier modi = null;
                try {
                    modi = new TestModifier(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                modi.setVisible(true);
                
                
            }
            else if(envoie == "DELETE"){
                System.out.println("bonjour1");
                envoie = testee; 
                System.out.println(envoie);
                TestSupprimer supp = null;
                try {
                    supp = new TestSupprimer(envoie);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                supp.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
