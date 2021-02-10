/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.przelicznikjednostek;

/**
 *
 * @author Szymon
 */
public class PrzelicznikJednostek extends javax.swing.JFrame {

    /**
     * Creates new form PrzelicznikJednostek
     */
    public PrzelicznikJednostek() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        sr_jComboBox_firstType = new javax.swing.JComboBox<>();
        sr_jComboBox_finalType = new javax.swing.JComboBox<>();
        sr_jButton_convert = new javax.swing.JButton();
        sr_jTextField_firstValue = new javax.swing.JTextField();
        sr_jLabel_firstValue = new javax.swing.JLabel();
        sr_jLabel_finalValue = new javax.swing.JLabel();
        sr_jLabel_convertedValue = new javax.swing.JLabel();
        sr_jTextField_finalValue = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sr_jComboBox_firstType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "dm", "km" }));
        sr_jComboBox_firstType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jComboBox_firstTypeActionPerformed(evt);
            }
        });

        sr_jComboBox_finalType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "dm", "km" }));
        sr_jComboBox_finalType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jComboBox_finalTypeActionPerformed(evt);
            }
        });

        sr_jButton_convert.setText("Przelicz");
        sr_jButton_convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_jButton_convertActionPerformed(evt);
            }
        });

        sr_jLabel_firstValue.setText("Wybierz jednostkę podstawową i wpisz jej wartość");

        sr_jLabel_finalValue.setText("Wybierz jednostkę na którą chcesz przeliczyć");

        sr_jLabel_convertedValue.setText("Wynik");

        sr_jTextField_finalValue.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sr_jLabel_firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sr_jComboBox_firstType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sr_jTextField_firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sr_jComboBox_finalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sr_jTextField_finalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sr_jLabel_finalValue)
                    .addComponent(sr_jButton_convert)
                    .addComponent(sr_jLabel_convertedValue))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sr_jLabel_firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jComboBox_firstType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jTextField_firstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(sr_jLabel_finalValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sr_jComboBox_finalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sr_jTextField_finalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sr_jButton_convert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sr_jLabel_convertedValue)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Przelicznik jednostek odległości", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Przelicznik temperatury", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sr_jComboBox_firstTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jComboBox_firstTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sr_jComboBox_firstTypeActionPerformed

    private void sr_jComboBox_finalTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jComboBox_finalTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sr_jComboBox_finalTypeActionPerformed

    private void sr_jButton_convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_jButton_convertActionPerformed
        String firstType = (String) sr_jComboBox_firstType.getSelectedItem();
        int firstValue = Integer.parseInt(sr_jTextField_firstValue.getText());
        String finalType = (String) sr_jComboBox_finalType.getSelectedItem();
        
        float convertedValue = convert(firstValue, firstType, finalType);
        System.out.print(convertedValue);
        sr_jTextField_finalValue.setText(Float.toString(convertedValue));
    }//GEN-LAST:event_sr_jButton_convertActionPerformed

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
            java.util.logging.Logger.getLogger(PrzelicznikJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrzelicznikJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrzelicznikJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrzelicznikJednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrzelicznikJednostek().setVisible(true);
            }
        });
    }
    
    private float convert(int firstValue, String firstType, String finalType){
        int mmValue = convertToMm(firstValue, firstType);
        if(finalType.equals("cm")) return (float) mmValue / 10;
        else if(finalType.equals("dm")) return (float) mmValue / 100;
        else if(finalType.equals("m")) return (float) mmValue / 1000;
        else if(finalType.equals("km")) return (float) mmValue / 1000000;
        else return (float) mmValue;
    }
    
    private int convertToMm(int numb, String type){
        int converter = 1;
        if(type.equals("cm")) converter = 10;
        else if (type.equals("dm")) converter = 100;
        else if(type.equals("m")) converter = 1000;
        else if(type.equals("km")) converter = 1000000;

        return numb * converter;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton sr_jButton_convert;
    private javax.swing.JComboBox<String> sr_jComboBox_finalType;
    private javax.swing.JComboBox<String> sr_jComboBox_firstType;
    private javax.swing.JLabel sr_jLabel_convertedValue;
    private javax.swing.JLabel sr_jLabel_finalValue;
    private javax.swing.JLabel sr_jLabel_firstValue;
    private javax.swing.JTextField sr_jTextField_finalValue;
    private javax.swing.JTextField sr_jTextField_firstValue;
    // End of variables declaration//GEN-END:variables
}