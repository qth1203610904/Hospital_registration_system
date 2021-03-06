package com.etc.view;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import com.etc.pojo.staticAll;
import com.etc.util.ToolsUtil;
import com.etc.pojo.Doctor;
import com.etc.pojo.Patient;
import com.etc.service.DoctorService;
import com.etc.service.PatientService;
import com.etc.service.UserService;
import com.etc.util.ToolsUtil;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class InquirySystemView extends javax.swing.JFrame {
	
	staticAll staticall =new staticAll();
	
	private static String username = staticAll.getUserName(); // 查询条件

    /**
     * Creates new form InquirySystemView
     */
    public InquirySystemView() {
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

        ComboBox111 = new javax.swing.JComboBox();
        ReturnButton111 = new javax.swing.JButton();
        ConfirmButton111 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBox111.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        ComboBox111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox111ActionPerformed(evt);
            }
        });
        
     // 获取所有病人的名字
        String[] PatientNameArray = null;
        try {
			List<Patient> patient = PatientService.queryPatientByDoc(username);
			PatientNameArray = new String[patient.size()];
			for(int i = 0;i<patient.size();i++){
				PatientNameArray[i] = patient.get(i).getName();
			}
			
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInternalMessageDialog(this, e.getMessage());
			return;
		}
        
        ComboBox111.setModel(new javax.swing.DefaultComboBoxModel(PatientNameArray));

        ReturnButton111.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        ReturnButton111.setText("返   回");
        ReturnButton111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 204)));
        ReturnButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton111ActionPerformed(evt);
            }
        });

        ConfirmButton111.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        ConfirmButton111.setText("下一位");
        ConfirmButton111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 102, 204)));
        ConfirmButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton111ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("隶书", 1, 24)); // NOI18N
        jLabel1.setText("*问诊系统*");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox111, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReturnButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(ConfirmButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ComboBox111, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void ReturnButton111ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	
    	this.dispose();
    	DoctorSystemView doctorSystemView = new DoctorSystemView();
    }                                               

    private void ConfirmButton111ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    	String PatName = (String) ComboBox111.getSelectedItem();
    	String consulation = jTextArea1.getText().trim(); 
    	if(ToolsUtil.isEmpty(consulation)){
    		jTextArea1.requestFocus();
    		JOptionPane.showInternalMessageDialog(ConfirmButton111.getParent(), "请给出诊断信息!");
    		return;
    	}
    	
    	// 添加问诊信息

    	
    	try {
			PatientService.addConsulation(PatName,consulation);
			// 问诊信息新增成功

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton111.getParent(), e.getMessage());
    		return;
		}
    	
    	//结束此病人问诊
    	try {
			PatientService.updateGH(PatName);
			// 结束成功

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton111.getParent(), e.getMessage());
    		return;
		}
    	
    	try {
			DoctorService.abatePatientsNum(username);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	
    	this.dispose();
    	InquirySystemView inquirySystemView = new InquirySystemView();
    }                                                

    private void ComboBox111ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextArea1AncestorMoved(javax.swing.event.AncestorEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextArea1AncestorRemoved(javax.swing.event.AncestorEvent evt) {                                           
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
            java.util.logging.Logger.getLogger(InquirySystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InquirySystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InquirySystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InquirySystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InquirySystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox ComboBox111;
    private javax.swing.JButton ConfirmButton111;
    private javax.swing.JButton ReturnButton111;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
/**文本域：jTextArea1;
*下拉列表:ComboBox111;
*确认： ConfirmButton111;
*返回：ReturnButton111;
*/