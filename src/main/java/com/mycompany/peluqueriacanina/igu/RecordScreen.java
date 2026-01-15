
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logic.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class RecordScreen extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RecordScreen.class.getName());

    
    public RecordScreen() {
        initComponents();
    }
    
    Controller control = new Controller();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        backMenuButton = new javax.swing.JButton();
        formPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        breedLabel = new javax.swing.JLabel();
        breedTextField = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        colorTextField = new javax.swing.JTextField();
        allergicLabel = new javax.swing.JLabel();
        allergicComboBox = new javax.swing.JComboBox<>();
        speAtenLabel = new javax.swing.JLabel();
        speAtenComboBox = new javax.swing.JComboBox<>();
        nameOwLabel = new javax.swing.JLabel();
        nameOwTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        observationLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observationTextPane = new javax.swing.JTextPane();
        imageLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1144, 546));

        title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("RECORD PET");

        backMenuButton.setText("BACK");
        backMenuButton.addActionListener(this::backMenuButtonActionPerformed);

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name:");

        breedLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        breedLabel.setText("Breed:");

        breedTextField.addActionListener(this::breedTextFieldActionPerformed);

        colorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        colorLabel.setText("Color:");

        allergicLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allergicLabel.setText("Allergic:");

        allergicComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Yes", "No" }));
        allergicComboBox.addActionListener(this::allergicComboBoxActionPerformed);

        speAtenLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        speAtenLabel.setText("Special Atenttion:");

        speAtenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Yes", "No" }));

        nameOwLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameOwLabel.setText("Name Owner: ");

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneLabel.setText("Phone Owner:");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLabel.setText("Address:");

        observationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        observationLabel.setText("Observation: ");

        jScrollPane1.setViewportView(observationTextPane);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(formPanelLayout.createSequentialGroup()
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colorLabel)
                                .addComponent(allergicLabel))
                            .addGap(26, 26, 26)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(colorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(breedTextField)
                                    .addComponent(nameTextField))
                                .addComponent(allergicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(formPanelLayout.createSequentialGroup()
                            .addComponent(speAtenLabel)
                            .addGap(18, 18, 18)
                            .addComponent(speAtenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formPanelLayout.createSequentialGroup()
                            .addComponent(nameOwLabel)
                            .addGap(18, 18, 18)
                            .addComponent(nameOwTextField))
                        .addGroup(formPanelLayout.createSequentialGroup()
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(observationLabel)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressLabel)))
                            .addGap(18, 18, 18)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addComponent(addressTextField)
                                .addGroup(formPanelLayout.createSequentialGroup()
                                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(breedLabel))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breedLabel)
                    .addComponent(breedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allergicLabel)
                    .addComponent(allergicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speAtenLabel)
                    .addComponent(speAtenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOwLabel)
                    .addComponent(nameOwTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observationLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peluqueriaCanina.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310)
                        .addComponent(title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))))
        );

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(this::clearButtonActionPerformed);

        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.addActionListener(this::saveButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuButtonActionPerformed
        // TODO add your handling code here:
        MenuScreen menu = new MenuScreen();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backMenuButtonActionPerformed

    private void breedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breedTextFieldActionPerformed

    private void allergicComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergicComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergicComboBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        nameTextField.setText("");
        breedTextField.setText("");
        colorTextField.setText("");
        allergicComboBox.setSelectedIndex(0);
        speAtenComboBox.setSelectedIndex(0);
        nameOwTextField.setText("");
        phoneTextField.setText("");
        addressTextField.setText("");
        observationTextPane.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String allergic = (String) allergicComboBox.getSelectedItem();
        String speAten = (String) speAtenComboBox.getSelectedItem();
        
        if (verifyTextsCompleted()){
            
            control.save(nameTextField.getText(),breedTextField.getText(),colorTextField.getText(),
            allergic,speAten,nameOwTextField.getText(),phoneTextField.getText(),addressTextField.getText(),observationTextPane.getText());
            
            showMessage("Save Completed","Saved Correctly.","information");
        }else{
            
            showMessage("Save Error", "Complete all text fields.", "error");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JComboBox<String> allergicComboBox;
    private javax.swing.JLabel allergicLabel;
    private javax.swing.JButton backMenuButton;
    private javax.swing.JLabel breedLabel;
    private javax.swing.JTextField breedTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameOwLabel;
    private javax.swing.JTextField nameOwTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel observationLabel;
    private javax.swing.JTextPane observationTextPane;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> speAtenComboBox;
    private javax.swing.JLabel speAtenLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private boolean verifyTextsCompleted() {
        List<String> textFields = getAllTextField();
        for (String text: textFields){
            if (text.isEmpty()){
                return false;
            }
        }
        return true;
    }

    private List<String> getAllTextField() {
        List<String> textFields = new ArrayList();
        
        textFields.add(nameTextField.getText());
        textFields.add(breedTextField.getText());
        textFields.add(colorTextField.getText());
        String allergic = (String) allergicComboBox.getSelectedItem();
        textFields.add(allergic);
        String speAten = (String) speAtenComboBox.getSelectedItem();
        textFields.add(speAten);
        textFields.add(nameOwTextField.getText());
        textFields.add(phoneTextField.getText());
        textFields.add(addressTextField.getText());
        textFields.add(observationTextPane.getText());
        
        return textFields;
    }

    public void showMessage(String title, String message, String type){
        JOptionPane optionPane = new JOptionPane(message);
        if (type.equalsIgnoreCase("information")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (type.equalsIgnoreCase("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true); 
    }
    
}
