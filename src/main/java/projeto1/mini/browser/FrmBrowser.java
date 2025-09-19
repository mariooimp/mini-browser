package projeto1.mini.browser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class FrmBrowser extends javax.swing.JFrame {

    public FrmBrowser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTpesquisa = new javax.swing.JTextField();
        JBfechar = new javax.swing.JButton();
        JBabrir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JEpagina = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTpesquisa.setText("Inserir URL");
        JTpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTpesquisaActionPerformed(evt);
            }
        });

        JBfechar.setText("Fechar");
        JBfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBfecharActionPerformed(evt);
            }
        });

        JBabrir.setText("Abrir");
        JBabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBabrirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(JEpagina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTpesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBabrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBfechar)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBfechar)
                    .addComponent(JBabrir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarPagina() {
    try {
        String url = JTpesquisa.getText().trim();

        // Se o usuário não digitar http:// ou https://, adiciona http:// por padrão
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        // Aqui o JEditorPane carrega a página diretamente da URL
        JEpagina.setPage(new java.net.URL(url));
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, 
            "Erro ao carregar a página: " + e.getMessage(), 
            "Erro", JOptionPane.ERROR_MESSAGE);
    }
}



    private void JBabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBabrirActionPerformed
        // TODO add your handling code here:
        carregarPagina();
    }//GEN-LAST:event_JBabrirActionPerformed

    private void JBfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBfecharActionPerformed
        System.exit(0);

    }//GEN-LAST:event_JBfecharActionPerformed

    private void JTpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTpesquisaActionPerformed
        // TODO add your handling code here:
        carregarPagina();
    }//GEN-LAST:event_JTpesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBrowser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBabrir;
    private javax.swing.JButton JBfechar;
    private javax.swing.JEditorPane JEpagina;
    private javax.swing.JTextField JTpesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
