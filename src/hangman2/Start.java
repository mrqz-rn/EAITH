
package hangman2;


import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 240, 240));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jButton1.setText("Click to Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String DBdir = "c:/Hangman DATABASE/";
            File f1 = new File(DBdir);
            if(!f1.exists()){
                f1.mkdir();
            }
            String DB_name = "GameDatabase.accdb";
            String DB_path = DBdir + "/" + DB_name;
            File f2 = new File(DB_path);
            if(!f2.exists()){
                InputStream iStream = main1.class.getResourceAsStream("database/"+DB_name);
                Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            Connection con1=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st1 = con1.createStatement();
            System.out.println("DATABASE CONNECTED!");
        }catch(Exception e){
            System.out.println(e);
        }
        loginFrame lF = new loginFrame();
        lF.show();
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
