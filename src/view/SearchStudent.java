/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SchoolController;
import controller.StudentController;
import dao.DBConnection;
import entity.School;
import entity.Student;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;

/**
 *
 * @author HP
 */
public class SearchStudent extends javax.swing.JDialog {

    private final DefaultTableModel dtm;
    private List<School> allSchools;
    private boolean b;
    private List<Student> students;
    
    private String title;
    /**
     * Creates new form SearchStudent
     */
    public SearchStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        jasperFile = new File("./src/reports/SaveReport.jasper");
        initComponents();
        setLocationRelativeTo(null);
        dtm = (DefaultTableModel) tbl.getModel();
        loadSchools();
        rbParent.setActionCommand("Parents");
        rbRank.setActionCommand("Rank");
        rbSchool.setActionCommand("School");
        rbShy.setActionCommand("Shy");

        rb1st.setActionCommand("1");
        rb2nd.setActionCommand("2");
        rb3rd.setActionCommand("3");
        rb4th.setActionCommand("4");

    }

    private void loadSchools() {
        b = false;
        if (allSchools == null) {
            allSchools = SchoolController.getAllSchools();
        }
        cmbScl.removeAllItems();
        for (School s : allSchools) {
            cmbScl.addItem(s);
        }
        cmbScl.addItem("New");
        b = true;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbSchool = new javax.swing.JRadioButton();
        rbShy = new javax.swing.JRadioButton();
        rbRank = new javax.swing.JRadioButton();
        rbParent = new javax.swing.JRadioButton();
        cmbScl = new javax.swing.JComboBox();
        rb1st = new javax.swing.JRadioButton();
        rb2nd = new javax.swing.JRadioButton();
        rb3rd = new javax.swing.JRadioButton();
        rb4th = new javax.swing.JRadioButton();
        tfRank = new javax.swing.JFormattedTextField();
        cbParentNotLive = new javax.swing.JCheckBox();
        cbParentNoJob = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Find Student");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By"));

        buttonGroup1.add(rbSchool);
        rbSchool.setText("School");
        rbSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSchoolActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbShy);
        rbShy.setText("Shy");
        rbShy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbShyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbRank);
        rbRank.setText("Rank");
        rbRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRankActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbParent);
        rbParent.setText("Parents");
        rbParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParentActionPerformed(evt);
            }
        });

        cmbScl.setEnabled(false);
        cmbScl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSclActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb1st);
        rb1st.setText("1 st");
        rb1st.setEnabled(false);
        rb1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1stActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb2nd);
        rb2nd.setText("2 nd");
        rb2nd.setEnabled(false);
        rb2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ndActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb3rd);
        rb3rd.setText("3 rd");
        rb3rd.setEnabled(false);
        rb3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3rdActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb4th);
        rb4th.setText("4 th");
        rb4th.setEnabled(false);
        rb4th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4thActionPerformed(evt);
            }
        });

        try {
            tfRank.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRank.setEnabled(false);

        cbParentNotLive.setText(" Not Live");
        cbParentNotLive.setEnabled(false);
        cbParentNotLive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParentNotLiveActionPerformed(evt);
            }
        });

        cbParentNoJob.setText("Has No Job");
        cbParentNoJob.setEnabled(false);
        cbParentNoJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParentNoJobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbSchool)
                        .addGap(86, 86, 86)
                        .addComponent(rbShy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbScl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb2nd)
                            .addComponent(rb1st))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb3rd)
                    .addComponent(rb4th))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbRank))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(rbParent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cbParentNotLive)
                        .addGap(18, 18, 18)
                        .addComponent(cbParentNoJob)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSchool)
                    .addComponent(rbShy)
                    .addComponent(rbRank)
                    .addComponent(rbParent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbScl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb1st))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb2nd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb3rd)
                            .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbParentNotLive)
                            .addComponent(cbParentNoJob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb4th)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Rank", "Name", "School", "Address", "Shy", "Tele"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setRowHeight(20);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setPreferredWidth(12);
            tbl.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbl.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 737, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnViewAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSchoolActionPerformed
        cmbScl.setEnabled(rbSchool.isSelected());
        title = "Students in "+cmbScl.getSelectedItem().toString();
    }//GEN-LAST:event_rbSchoolActionPerformed

    private void rbShyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbShyActionPerformed
        boolean selected = rbShy.isSelected();
//        ActionListener[] actionListeners = rbParent.getActionListeners();
//        for (ActionListener actionListener : actionListeners) {
//            actionListener.actionPerformed(evt);
//        }
        rb1st.setEnabled(selected);
        rb2nd.setEnabled(selected);
        rb3rd.setEnabled(selected);
        rb4th.setEnabled(selected);
        
        if (selected) {
            rb1st.setSelected(true);
            title = "1st Shy Students";
        }
        
    }//GEN-LAST:event_rbShyActionPerformed

    private void rbRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRankActionPerformed
        tfRank.setEnabled(rbRank.isSelected());
    }//GEN-LAST:event_rbRankActionPerformed

    private void rbParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParentActionPerformed
        boolean selected = rbParent.isSelected();

        cbParentNoJob.setEnabled(selected);
        cbParentNotLive.setEnabled(selected);

    }//GEN-LAST:event_rbParentActionPerformed

    private void cbParentNotLiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParentNotLiveActionPerformed
        cbParentNoJob.setEnabled(!cbParentNotLive.isSelected());
        title = "Parent Not Live";
    }//GEN-LAST:event_cbParentNotLiveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String actionCommand = buttonGroup1.getSelection().getActionCommand();
        System.out.println(actionCommand);
        switch (actionCommand) {
            case "School":
                students = StudentController.searchStudentBySchool((School) cmbScl.getSelectedItem());
                int count = 1;
                int rowCount = dtm.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    dtm.removeRow(0);
                }
                for (Student student : students) {
                    dtm.addRow(new Object[]{count, student.getRank(), student.getName(), student.getSchoolid().getName(), student.getAddress(), student.getShy(), student.getTelephone()});
                    count++;
                }
                break;
            case "Shy":
                actionCommand = buttonGroup2.getSelection().getActionCommand();
                students = StudentController.searchStudentByShy(Integer.parseInt(actionCommand));
                count = 1;
                rowCount = dtm.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    dtm.removeRow(0);
                }
                for (Student student : students) {
                    dtm.addRow(new Object[]{count, student.getRank(), student.getName(), student.getSchoolid().getName(), student.getAddress(), student.getShy(), student.getTelephone()});
                    count++;
                }
                break;
            case "Rank":
                students = StudentController.searchStudentByRank(Integer.parseInt(tfRank.getText()));
                title = "District Rank - " + tfRank.getText();
                count = 1;
                rowCount = dtm.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    dtm.removeRow(0);
                }
                for (Student student : students) {
                    dtm.addRow(new Object[]{count, student.getRank(), student.getName(), student.getSchoolid().getName(), student.getAddress(), student.getShy(), student.getTelephone()});
                    count++;
                }
                break;
            case "Parents":
                students = StudentController.searchStudentByParent(!cbParentNotLive.isSelected(), cbParentNoJob.isSelected());
                count = 1;
                rowCount = dtm.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    dtm.removeRow(0);
                }
                for (Student student : students) {
                    dtm.addRow(new Object[]{count, student.getRank(), student.getName(), student.getSchoolid().getName(), student.getAddress(), student.getShy(), student.getTelephone()});
                    count++;
                }
                break;

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        if (evt.getClickCount() == 2) {
            Student s = students.get(tbl.getSelectedRow());
            new ViewMoreDetails(this, true, s).setVisible(true);
        }
    }//GEN-LAST:event_tblMouseClicked

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        students = StudentController.getAllStudent();
      title = "All Students";
        int count = 1;
        int rowCount = dtm.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            dtm.removeRow(0);
        }
        for (Student student : students) {
            dtm.addRow(new Object[]{count, student.getRank(), student.getName(), student.getSchoolid().getName(), student.getAddress(), student.getShy(), student.getTelephone()});
            count++;
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
         
            
            
            Map<String,Object> param = new HashMap<>();
            FileInputStream fileInputStream = new FileInputStream(jasperFile);
            param.put("CONNECTION", DBConnection.getConnection());
            param.put("TITLE", title);
            JRTableModelDataSource ds = new JRTableModelDataSource(dtm);
            JasperPrint jp = JasperFillManager.fillReport(fileInputStream, param, ds);
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("PDF", "pdf"));
            fc.setFileFilter(new FileNameExtensionFilter("XML", "xml"));
            int res = fc.showSaveDialog(this);
            
            if (res == JFileChooser.APPROVE_OPTION) {
                FileOutputStream fos = new FileOutputStream(fc.getSelectedFile());
                JasperExportManager.exportReportToPdfStream(jp, fos);
                fos.close();
                JOptionPane.showMessageDialog(this, "Saved...");
//                JasperExportManager.exportReportToXmlFile(jp,fc.getSelectedFile().getAbsolutePath(),false);
                //   JasperExportManager.exportReportToPdfFile(jp,fc.getSelectedFile().getAbsolutePath());
//                JRPdfExporter jrPdfExporter = new  JRPdfExporter();
//                jrPdfExporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
//                jrPdfExporter.setParameter(JRExporterParameter.OUTPUT_FILE, fc.getSelectedFile());
//                jrPdfExporter.exportReport();
            }
            fileInputStream.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbSclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSclActionPerformed
        title = "Students in "+cmbScl.getSelectedItem().toString();
    }//GEN-LAST:event_cmbSclActionPerformed

    private void rb1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1stActionPerformed
        title = "1st Shy Students";
    }//GEN-LAST:event_rb1stActionPerformed

    private void rb2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ndActionPerformed
       title = "2nd Shy Students";
    }//GEN-LAST:event_rb2ndActionPerformed

    private void rb3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3rdActionPerformed
        title = "3rd Shy Students";
    }//GEN-LAST:event_rb3rdActionPerformed

    private void rb4thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4thActionPerformed
        title = "4th Shy Students";
    }//GEN-LAST:event_rb4thActionPerformed

    private void cbParentNoJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParentNoJobActionPerformed
        title = "Parent Has No Job";
    }//GEN-LAST:event_cbParentNoJobActionPerformed
    private File jasperFile;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            /* Set the Nimbus look and feel */
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchStudent dialog = new SearchStudent(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbParentNoJob;
    private javax.swing.JCheckBox cbParentNotLive;
    private javax.swing.JComboBox cmbScl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb1st;
    private javax.swing.JRadioButton rb2nd;
    private javax.swing.JRadioButton rb3rd;
    private javax.swing.JRadioButton rb4th;
    private javax.swing.JRadioButton rbParent;
    private javax.swing.JRadioButton rbRank;
    private javax.swing.JRadioButton rbSchool;
    private javax.swing.JRadioButton rbShy;
    private javax.swing.JTable tbl;
    private javax.swing.JFormattedTextField tfRank;
    // End of variables declaration//GEN-END:variables
}
