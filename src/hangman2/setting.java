package hangman2;


import java.awt.GraphicsEnvironment;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;

public class setting extends javax.swing.JFrame {

    float previousV=0,currentV=0;
    boolean mute = false;
    FloatControl fc;
    public setting() {
        initComponents();
        music_c.setSelected(true);
        screen_c.setSelected(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        music_c = new javax.swing.JCheckBox();
        screen_c = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 72)); // NOI18N
        jLabel1.setText("Game Settings");

        music_c.setFont(new java.awt.Font("Tekton Pro Ext", 2, 36)); // NOI18N
        music_c.setText("Music");
        music_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                music_cMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                music_cMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                music_cMouseReleased(evt);
            }
        });
        music_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                music_cActionPerformed(evt);
            }
        });

        screen_c.setFont(new java.awt.Font("Tekton Pro Ext", 2, 36)); // NOI18N
        screen_c.setText("Fullscreen");
        screen_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screen_cMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jButton1.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(music_c)
                        .addGap(113, 113, 113)
                        .addComponent(screen_c))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(music_c)
                    .addComponent(screen_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void screen_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screen_cMouseClicked
        // TODO add your handling code here:
       
       if(screen_c.isSelected() == true){
           
       }
       for ( Window w : Window.getWindows() ) {
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow( w );
        }
    }//GEN-LAST:event_screen_cMouseClicked

    private void music_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_music_cMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_music_cMouseClicked

    private void music_cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_music_cMouseExited
        // TODO add your handling code here:

        
    }//GEN-LAST:event_music_cMouseExited

    private void music_cMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_music_cMouseReleased
        // TODO add your handling code here:
        
        File f;
        Clip clip = null;
        AudioInputStream ais;
        String des = "";
        
        
   if(music_c.isSelected()==true){
       mute = false;
   }else{
       mute = true;
   }
        try{
            fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            File musicPath = new File("Forever.wav");
             if(musicPath.exists()){
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        }catch(Exception e){
            System.out.println(e);
        }
            
       if(mute == false){
           previousV = currentV;
           currentV = -80.0f;
           fc.setValue(currentV);
           mute = false;
           
       }else if(mute == true){
           currentV = previousV;
           currentV = -80.0f;
           fc.setValue(currentV);
           mute = true;
           
       }
    }//GEN-LAST:event_music_cMouseReleased

    private void music_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_music_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_music_cActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox music_c;
    private javax.swing.JCheckBox screen_c;
    // End of variables declaration//GEN-END:variables
}
