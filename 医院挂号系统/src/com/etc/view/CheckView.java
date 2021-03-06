package com.etc.view;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import com.etc.dao.DoctorDao;
import com.etc.pojo.Doctor;

import com.etc.pojo.Patient;
import com.etc.service.DoctorService;

import com.etc.service.PatientService;
import com.etc.util.ToolsUtil;
import com.etc.pojo.staticAll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class CheckView extends javax.swing.JFrame {
	
	private static DoctorService doctorService = new DoctorService();
	
	private static String doctorName = staticAll.getChooseDoctorName(); // 查询条件

    /**
     * Creates new form CheckView
     */
    public CheckView() {
        initComponents();
        
     // 设置标题
      	this.setTitle("超级医院挂号系统");
      // 设置可见
      this.setVisible(true);
      // 设置伸缩
      this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable10 = new javax.swing.JTable();
        ReturnButton10 = new javax.swing.JButton();
        ExitButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("隶书", 3, 24)); // NOI18N
        jLabel1.setText("*显示医生信息*");

        DoctorTable10.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        DoctorTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        DoctorTable10.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                DoctorTable10AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DoctorTable10AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                DoctorTable10AncestorRemoved(evt);
            }
        });
        
        Object [][] doctorArray = null;
        
     // 查询商品信息
        try {
 		List<Doctor> goodses = doctorService.queryDoctor(doctorName);
 		// 将 list 转为 二维数据
 		doctorArray = ToolsUtil.loadCartsArray(goodses);
 	} catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 		JOptionPane.showInternalMessageDialog(this, e.getMessage());
 		return;
 	}
         
        DoctorTable10.setModel(new javax.swing.table.DefaultTableModel(
     		   doctorArray,
             new String [] {
                 "ID", "姓名", "专业", "科室", "当前挂号人数"
             }
         ));
        jScrollPane1.setViewportView(DoctorTable10);

        ReturnButton10.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        ReturnButton10.setText("返   回");
        ReturnButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReturnButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton10ActionPerformed(evt);
            }
        });

        ExitButton10.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        ExitButton10.setText("退   出");
        ExitButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ReturnButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ReturnButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ReturnButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    	
    	this.dispose();
    	FunctionView functionView = new FunctionView();
    }                                              

    private void ExitButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	
    	System.exit(-1);
    }                                            

    private void DoctorTable10AncestorAdded(javax.swing.event.AncestorEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void DoctorTable10AncestorMoved(javax.swing.event.AncestorEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void DoctorTable10AncestorRemoved(javax.swing.event.AncestorEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

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
            java.util.logging.Logger.getLogger(CheckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable DoctorTable10;
    private javax.swing.JButton ExitButton10;
    private javax.swing.JButton ReturnButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

    /**医生信息表：DoctorTable10;
    *退出：ExitButton10;
*返回： ReturnButton10;
*/