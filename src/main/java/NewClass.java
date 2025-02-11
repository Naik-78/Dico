/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kian
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author kian
 */
public class NewClass extends javax.swing.JFrame {

    /**
     * Creates new form ProjetDicoImage
     */
    
    private File file;
    private File fImage;
    
    public NewClass() {
        initComponents();                       
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonRetirerMot = new javax.swing.JButton();
        jButtonModifierDef = new javax.swing.JButton();
        jButtonModifierImage = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jButtonAjouterMot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionnaire Imagé");
        setLocation(new java.awt.Point(800, 400));
        setMinimumSize(new java.awt.Dimension(600, 300));
        setPreferredSize(new java.awt.Dimension(900, 700));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Athletico Madrid", "Bayern Munich", "FC Barcelone", "Manchester City", "PSG", "Real Madrid" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jButtonRetirerMot.setText("Retirer le club");
        jButtonRetirerMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirerMotActionPerformed(evt);
            }
        });

        jButtonModifierDef.setText("Enregistrer  descriptif");
        jButtonModifierDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierDefActionPerformed(evt);
            }
        });

        jButtonModifierImage.setText("Modifier le logo");
        jButtonModifierImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierImageActionPerformed(evt);
            }
        });

        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonAjouterMot.setText("Ajouter un club");
        jButtonAjouterMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterMotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAjouterMot)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRetirerMot)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModifierDef)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModifierImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonQuitter))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonQuitter)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAjouterMot)
                        .addComponent(jButtonRetirerMot)
                        .addComponent(jButtonModifierDef)
                        .addComponent(jButtonModifierImage)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        jTextArea1.setText(null);
        jLabel.setIcon(null);
        
        fImage = new File("Images/"+jComboBox1.getSelectedItem()+".png");                                  
        file = new File("Définition/"+jComboBox1.getSelectedItem()+".txt");
             
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String ligne;
            while (br.ready())
                {
                    ligne = br.readLine();
                    jTextArea1.setText(jTextArea1.getText()+ligne+"\n");                     
                }
            br.close();                  
        }
               
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(ProjetDicoImage.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(ProjetDicoImage.class.getName()).log(Level.SEVERE, null, ex);
        }     
                
        try
        {
            Image image = ImageIO.read(fImage);
            jLabel.setIcon(new javax.swing.ImageIcon(image));
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(TestComboBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonModifierDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierDefActionPerformed
        // TODO add your handling code here:

        try
            {
                FileWriter f = new FileWriter(file);
                BufferedWriter out = new BufferedWriter(f);

                out.write(jTextArea1.getText());
                                
                out.flush(); //permet de vider les buffers d'écriture
                out.close();//ferme ce flux
            }
            catch(IOException e)
            {
                
            }         
    }//GEN-LAST:event_jButtonModifierDefActionPerformed

    private void jButtonModifierImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierImageActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileImage = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpeg","jpg","png");
        fileImage.setFileFilter(filter);
        int returnValue = fileImage.showOpenDialog(this); // Sélection d'un élement du système de fichier
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {          
            File fic = fileImage.getSelectedFile();                                                                 // la méthode getSelectedFile retourne encapsulée dans un objet File le chemin du fichier sélectionné avec le dialogue ShowOpenDialog
             
            try 
            {
                String tmp= fImage.getName();                                                                       //On crée une variable temporaire qui stock le nom du fichier .png que l'on souhaite modifier
                fImage.delete();                                                                                    //On supprime le fichier .png déjà présent
                Image img = ImageIO.read(fic);
                Image newImg = img.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon icon = new ImageIcon(img);
                jLabel.setIcon(icon);          
                
                File newFileImg = new File("Images/"+fImage.getName());                                             //On crée un nouveau fichier .png qui aura le même nom que celui supprimé précédemment
                ImageIO.write((RenderedImage) img, "png", newFileImg);                                              //Ecrit l'image dans le fichier newFileImg
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(ProjetDicoImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }//GEN-LAST:event_jButtonModifierImageActionPerformed

    private void jButtonRetirerMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirerMotActionPerformed
        // TODO add your handling code here:
        Object i;
        int choix = 0;

        choix = JOptionPane.showConfirmDialog(this,"Supprimer le club ?", "Confirmer Supression", JOptionPane.YES_NO_OPTION);

        switch(choix)
        {
        case JOptionPane.YES_OPTION : 
        i = jComboBox1.getSelectedItem();
        jComboBox1.removeItem(i);
        JOptionPane.showMessageDialog(this, "Le club a été supprimé !");
        break;
        }
    }//GEN-LAST:event_jButtonRetirerMotActionPerformed

    private void jButtonAjouterMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterMotActionPerformed
        // TODO add your handling code here:       
        JOptionPane jop = new JOptionPane();
        String nomclub = JOptionPane.showInputDialog(null, "Le nom du club :", "Nouveau Club");
        int i = 0,j=0;
        
        for(i = 0 ; i<jComboBox1.getItemCount() ; i++)
        {
            System.out.println(jComboBox1.getItemAt(i));

            if(nomclub.equals(jComboBox1.getItemAt(i)))
            {
                j=1;
                JOptionPane.showMessageDialog(this, "Le club saisie existe déjà");               
            }
            
        }
        
        if(j!=1)
        {
            try 
            {
                jComboBox1.addItem(nomclub);
                FileWriter newDef = new FileWriter("Définition/"+nomclub+".txt");
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(TestComboBox.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }//GEN-LAST:event_jButtonAjouterMotActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProjetDicoImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetDicoImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetDicoImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetDicoImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetDicoImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouterMot;
    private javax.swing.JButton jButtonModifierDef;
    private javax.swing.JButton jButtonModifierImage;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonRetirerMot;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
