/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsservice;

/**
 *
 * @author Jamie
 */
public class ContactGUI extends javax.swing.JFrame {

    /**
     * Creates new form ContactGUI
     */
    public ContactGUI() {
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

        ContactPanel = new javax.swing.JPanel();
        Titlelb = new javax.swing.JLabel();
        Homebtn = new javax.swing.JButton();
        MContact = new javax.swing.JLabel();
        Contact = new javax.swing.JScrollPane();
        Contactfeild = new javax.swing.JTextArea();
        Contact1 = new javax.swing.JScrollPane();
        Contactfeild1 = new javax.swing.JTextArea();
        Contact2 = new javax.swing.JScrollPane();
        Contactfeild2 = new javax.swing.JTextArea();
        Contact3 = new javax.swing.JScrollPane();
        Contactfeild3 = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(475, 725));
        getContentPane().setLayout(null);

        ContactPanel.setOpaque(false);

        Titlelb.setFont(new java.awt.Font("Batang", 3, 24)); // NOI18N
        Titlelb.setText("Contact Page");

        Homebtn.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Homebtn.setText("Home");
        Homebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });

        MContact.setBackground(new java.awt.Color(0, 0, 0));
        MContact.setFont(new java.awt.Font("Batang", 3, 18)); // NOI18N
        MContact.setText("Contact Info");

        Contact.setHorizontalScrollBar(null);

        Contactfeild.setEditable(false);
        Contactfeild.setColumns(10);
        Contactfeild.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Contactfeild.setRows(5);
        Contactfeild.setText("\nMaths Support:\n\nJohnathan Lambert\n\nEmail:\njohnathan.lambert\n@ncril.ie\n\nPhone:\n(01)4498650");
        Contactfeild.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Contactfeild.setMinimumSize(new java.awt.Dimension(30, 30));
        Contact.setViewportView(Contactfeild);

        Contact1.setHorizontalScrollBar(null);

        Contactfeild1.setEditable(false);
        Contactfeild1.setColumns(10);
        Contactfeild1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Contactfeild1.setRows(5);
        Contactfeild1.setText("\nLearning Support:\n\nMicheal Goldrick\n\nEmail:\nmicheal.goldrick\n@ncril.ie\n\nPhone:\n(01)6599245");
        Contactfeild1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Contactfeild1.setMinimumSize(new java.awt.Dimension(30, 30));
        Contact1.setViewportView(Contactfeild1);

        Contact2.setHorizontalScrollBar(null);

        Contactfeild2.setEditable(false);
        Contactfeild2.setColumns(10);
        Contactfeild2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Contactfeild2.setRows(5);
        Contactfeild2.setText("\nComputer Support:\n\n\n\nEmail:\n\n@ncril.ie\n\nPhone:\n(01");
        Contactfeild2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Contactfeild2.setMinimumSize(new java.awt.Dimension(30, 30));
        Contact2.setViewportView(Contactfeild2);

        Contact3.setHorizontalScrollBar(null);

        Contactfeild3.setEditable(false);
        Contactfeild3.setColumns(10);
        Contactfeild3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        Contactfeild3.setRows(5);
        Contactfeild3.setText("\nDisability Support:\n\nKaren Mooney\n\nEmail:\nkaren.mooney\n@ncril.ie\n\nPhone:\n(01)6599269");
        Contactfeild3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Contactfeild3.setMinimumSize(new java.awt.Dimension(30, 30));
        Contact3.setViewportView(Contactfeild3);

        javax.swing.GroupLayout ContactPanelLayout = new javax.swing.GroupLayout(ContactPanel);
        ContactPanel.setLayout(ContactPanelLayout);
        ContactPanelLayout.setHorizontalGroup(
            ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contact2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contact3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactPanelLayout.createSequentialGroup()
                        .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titlelb, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MContact, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        ContactPanelLayout.setVerticalGroup(
            ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titlelb)
                    .addComponent(Homebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MContact)
                .addGap(46, 46, 46)
                .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Contact2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(ContactPanel);
        ContactPanel.setBounds(0, 0, 460, 680);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsservice/Images/Nci Night.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 460, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        dispose();
        Homepage HGUI = new Homepage();
        HGUI.setVisible(true);
    }//GEN-LAST:event_HomebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JScrollPane Contact;
    private javax.swing.JScrollPane Contact1;
    private javax.swing.JScrollPane Contact2;
    private javax.swing.JScrollPane Contact3;
    private javax.swing.JPanel ContactPanel;
    private javax.swing.JTextArea Contactfeild;
    private javax.swing.JTextArea Contactfeild1;
    private javax.swing.JTextArea Contactfeild2;
    private javax.swing.JTextArea Contactfeild3;
    private javax.swing.JButton Homebtn;
    private javax.swing.JLabel MContact;
    private javax.swing.JLabel Titlelb;
    // End of variables declaration//GEN-END:variables
}
