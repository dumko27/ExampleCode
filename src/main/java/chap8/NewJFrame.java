package chap8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;



public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTextField1.setText("jTextField1");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112,
                                Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62))
        );
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton1.setText("Моя кнопка");
        new SwingWorker<String, Void>() {
            @Override
            public String doInBackground() {
                String innerImgs = null;
                try {
                    Thread.sleep(2000);
                    innerImgs = "Мой тест";
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null,
                            ex);
                }
                return innerImgs;
            }

            @Override
            public void done() {
                try {
                    String imgs = get();
                    System.out.println(imgs);
                    jTextField1.setText(imgs);
                } catch (InterruptedException ignore) {
                } catch (java.util.concurrent.ExecutionException e) {
                    String why = null;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        why = cause.getMessage();
                    } else {
                        why = e.getMessage();
                    }
                    System.err.println("Error retrieving file: " + why);
                }
            }
        }.execute();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()
            ).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()
            ).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
}
