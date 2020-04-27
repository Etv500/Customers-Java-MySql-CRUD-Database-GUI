package packgui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import packdbconnect.DBConnect;
/**
 * @author Elvis Thomas Vlcek
 * Msc Computer Science with Data Analytics
 * Computer and Mobile Networks
 */
public class GUI extends javax.swing.JFrame {
    private Connection conn;
    private int customerID;
    public GUI() {
        initComponents();
        DBConnect dbc = DBConnect.getDBConnection();
        conn = dbc.getConnection();
        setCustomerTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobInput = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderInput = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customers DB");
        setBackground(new java.awt.Color(0, 38, 10));

        inputPanel.setBackground(new java.awt.Color(77, 255, 122));
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Chalkboard", 0, 13), new java.awt.Color(0, 38, 10))); // NOI18N
        inputPanel.setLayout(new java.awt.GridLayout(6, 2, 10, 15));

       

        

        firstNameLabel.setForeground(new java.awt.Color(0, 38, 10));
        firstNameLabel.setText("First Name");
        inputPanel.add(firstNameLabel);

        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputActionPerformed(evt);
            }
        });
        inputPanel.add(firstNameInput);

        lastNameLabel.setForeground(new java.awt.Color(0, 38, 10));
        lastNameLabel.setText("Last Name");
        inputPanel.add(lastNameLabel);
        inputPanel.add(lastNameInput);

        addressLabel.setForeground(new java.awt.Color(0, 38, 10));
        addressLabel.setText("Address");
        inputPanel.add(addressLabel);
        inputPanel.add(addressInput);
        
        emailLabel.setBackground(new java.awt.Color(0, 38, 10));
        emailLabel.setForeground(new java.awt.Color(0, 38, 10));
        emailLabel.setText("Email");
        inputPanel.add(emailLabel);

        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });
        inputPanel.add(emailInput);
        
        dobLabel.setForeground(new java.awt.Color(0, 38, 10));
        dobLabel.setText("Date of Birth (yyyymmdd)");
        inputPanel.add(dobLabel);
        inputPanel.add(dobInput);

        genderLabel.setForeground(new java.awt.Color(0, 38, 10));
        genderLabel.setText("Gender");
        inputPanel.add(genderLabel);
        inputPanel.add(genderInput);

        btnPanel.setBackground(new java.awt.Color(77, 255, 122));
        btnPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPanel.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        addBtn.setBackground(new java.awt.Color(77, 255, 122));
        addBtn.setText("Add");
        addBtn.setToolTipText("");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        btnPanel.add(addBtn);

        updateBtn.setBackground(new java.awt.Color(77, 255, 122));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        btnPanel.add(updateBtn);

        deleteBtn.setBackground(new java.awt.Color(77, 255, 122));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        btnPanel.add(deleteBtn);

        clearBtn.setBackground(new java.awt.Color(77, 255, 122));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        btnPanel.add(clearBtn);

        tablePanel.setBackground(new java.awt.Color(77, 255, 122));
        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Chalkboard SE", 0, 13), new java.awt.Color(0, 38, 10))); // NOI18N
        tablePanel.setForeground(new java.awt.Color(0, 38, 10));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.setGridColor(new java.awt.Color(153, 153, 153));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(478, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // Data fields. 
    	String email=emailInput.getText();
        String dob=dobInput.getText();
        String firstName=firstNameInput.getText();
        String lastName=lastNameInput.getText();
        String address=addressInput.getText();
        String gender=genderInput.getText();
        
        try {
            // SQL Statement to be sent to db connection.
            Statement smt = conn.createStatement();
            smt.execute("INSERT INTO tablecustomers(email, dob, firstName, lastName, address, gender) "
                    + "VALUES('"+email+"', '"+dob+"', '"+firstName+"', '"+lastName+"', '"+address+"', '"+gender+"')");
            JOptionPane.showMessageDialog(this, "Record Submitted");
            smt.close();
            emailInput.setText("");
            dobInput.setText("");
            firstNameInput.setText("");
            lastNameInput.setText("");
            addressInput.setText("");
            genderInput.setText("");
            
            // Update the table if a new customer is added.
            setCustomerTableData();
            
        } catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex);
        }  
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // Customer ID must exist & not be equal to zero when selecitng customer record.  
        if(customerID!=0){
            // Form Data fields. 
        	String email=emailInput.getText();
            String dob=dobInput.getText();
            String firstName=firstNameInput.getText();
            String lastName=lastNameInput.getText();
            String address=addressInput.getText();
            String gender=genderInput.getText();
            try {
                // SQL Update statement sent across db connection.
                Statement stm = conn.createStatement();
                stm.execute("UPDATE tablecustomers SET email='"+email+"', dob='"+dob+"', firstName='"+firstName+"', "
                        + "lastName='"+lastName+"', address='"+address+"', gender='"+gender+"' WHERE id="+customerID);
                JOptionPane.showMessageDialog(this, "Details Updated");
                setCustomerTableData();
                // Method to reset fields to empty.
                clearData();
                // Resetting selected ID
                customerID=0;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Unable to Update Record");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearData();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        try {
            // Fetch the first value index[0] of the selected row, i.e. 'id'
            customerID=Integer.parseInt(customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString());
            // SQL statement to fetch data from db for selected customer id.
            Statement smt = conn.createStatement(); 
            ResultSet rs = smt.executeQuery("SELECT * FROM tablecustomers WHERE id="+customerID);
            if(rs.next()){
            	firstNameInput.setText(rs.getString(2));
                lastNameInput.setText(rs.getString(3));
                addressInput.setText(rs.getString(4));
                emailInput.setText(rs.getString(5));
                dobInput.setText(rs.getString(6));
                genderInput.setText(rs.getString(7));
            }
            rs.close();
            smt.close();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

                
    }//GEN-LAST:event_customerTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // Valid id must exist i.e. an customer record has been selected.
        if(customerID!=0){
            try {
                Statement smt = conn.createStatement();
                smt.execute("DELETE from tablecustomers WHERE id="+customerID);
                JOptionPane.showMessageDialog(this, "Record Deleted");
                setCustomerTableData();
                clearData();
                customerID=0;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Unable to Delete Record");
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dobInput;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    // Method for clearing form fields - setting empty values.
    private void clearData() {
        emailInput.setText("");
        dobInput.setText("");
        firstNameInput.setText("");
        lastNameInput.setText("");
        addressInput.setText("");
        genderInput.setText("");
    }
    
    // Method for updating GUI table rows/columns.
    private void setCustomerTableData(){
        try {
            int rows=0;
            int rowIndex=0;
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM tableCustomers ORDER by id desc");
            if(rs.next()) {
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            // Signify array of many strings, 7 in this case. 
            String[][] data=new String[rows][7];
            // Loop through rows indexes in the MySQL database table - tablecustomers
            // Matching up respective columns.
            while(rs.next()) {
                // Defining Columns
                data[rowIndex][0]=rs.getInt(1)+"";
                //data[rowIndex][1]=rs.getInt(2)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getString(4);
                data[rowIndex][4]=rs.getString(5);
                data[rowIndex][5]=rs.getString(6);
                data[rowIndex][6]=rs.getString(7);
                rowIndex++;
            }
            // Defining table columns headers. 
            String[] cols={"ID","First Name","Last Name","Address","Email","DOB","Gender"};
            //String[] cols={"ID","Email","DOB","First Name","Last Name","Address","Gender"};
            DefaultTableModel model = new DefaultTableModel(data, cols);
            customerTable.setModel(model);
                       
            rs.close();
            smt.close();
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Unable to Retrieve Data");
        }
    }
}


