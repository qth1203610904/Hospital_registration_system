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
public class PersonalInfoView extends javax.swing.JFrame {
	

	staticAll staticall =new staticAll();

    /**
     * Creates new form PersonalInfoView
     */
    public PersonalInfoView() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        SexTextField = new javax.swing.JTextField();
        ConfirmButton1 = new javax.swing.JButton();
        EnterButton1 = new javax.swing.JButton();
        ReturnButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        DoctorComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("楷体", 1, 24)); // NOI18N
        jLabel1.setText("*填写个人信息*");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("姓 名 ：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("年 龄 ：");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("性 别 ：");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        AgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextFieldActionPerformed(evt);
            }
        });

        SexTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexTextFieldActionPerformed(evt);
            }
        });

        ConfirmButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        ConfirmButton1.setText("确  认");
        ConfirmButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ConfirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton1ActionPerformed(evt);
            }
        });

        EnterButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        EnterButton1.setText("退  出");
        EnterButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EnterButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButton1ActionPerformed(evt);
            }
        });

        ReturnButton1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        ReturnButton1.setText("返  回");
        ReturnButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReturnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel5.setText("选择医生：");

     // 获取所有医生的名字
        String[] DoctorNameArray = null;
        try {
			List<Doctor> patient = DoctorService.queryDoctor(null);
			DoctorNameArray = new String[patient.size()];
			for(int i = 0;i<patient.size();i++){
				DoctorNameArray[i] = patient.get(i).getName();
			}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInternalMessageDialog(this, e.getMessage());
			return;
		}
        DoctorComboBox1.setModel(new javax.swing.DefaultComboBoxModel(DoctorNameArray));

     

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ReturnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(EnterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(ConfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(SexTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(DoctorComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DoctorComboBox1)
                        .addGap(2, 2, 2)))
                .addGap(51, 51, 51)
                .addComponent(ConfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReturnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void AgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void SexTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void EnterButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	
    	 /**
         * 退出
         * @param evt
         */
    	
    	System.exit(-1);
    }                                            

    private void ConfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    	
    	// 获取商品名字
    	String goodsName = (String) DoctorComboBox1.getSelectedItem();
    	
    	staticall.setChooseDoctorName(goodsName);
    	
    	DoctorService mmp = new DoctorService();
    	
    	
    	
    	String name = NameTextField.getText().trim(); 

    	if(ToolsUtil.isEmpty(name)){
    		NameTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), "请输入患者名称!");
    		return;
    	}
    	
    	String sex = SexTextField.getText().trim();
    	
 
    	if(ToolsUtil.isEmpty(sex)){
    		SexTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), "请输入患者性别!");
    		return;
    	}
    	String age = AgeTextField.getText().trim();
    	

    	if(ToolsUtil.isEmpty(age)){
    		AgeTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), "请输入患者年龄!");
    		return;
    	}
    	
    	
    	try {
			mmp.addPatientsNum(goodsName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), e.getMessage());
    	    return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), e.getMessage());
    	    return;
		}
    	
    	
    	// 增加挂号
    	Patient patient = new  Patient(name, sex, age);
    	try {
			PatientService.addPatient(patient);
			PatientService.obtainPatient(name,goodsName);
			// 挂号新增成功
			this.dispose();
            //StoreGoogsView storeGoogsView = new StoreGoogsView();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), e.getMessage());
    		return;
		}
    	
    	
    	// 记录医生信息
    	//goodsName = doctor name
    	//mmp = doctorSurvice
    	//name = patient name
    	PatientService mmq = new PatientService();
    	try {
			mmq.addDoc(goodsName,name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), e.getMessage());
    	    return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(ConfirmButton1.getParent(), e.getMessage());
    	    return;
		}
    	
    	
    	
    	
    	/**
         * 确认
         * @param evt
         */
    	
    	this.dispose();
    	CheckView checkView = new CheckView();
    }                                              

    private void ReturnButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	
    	/**
         * 返回主页面
         * @param evt
         */
    	
    	this.dispose();
    	FunctionView functionView = new FunctionView();
    }                                             

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void DoctorComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
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
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JButton ConfirmButton1;
    private javax.swing.JComboBox DoctorComboBox1;
    private javax.swing.JButton EnterButton1;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton ReturnButton1;
    private javax.swing.JTextField SexTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
}




/**确认：ConfirmButton1;
*进入：EnterButton1;
*返回： ReturnButton1;
*所选医生：DoctorComboBox1
*姓名文本框：NameTextField;
*性别： SexTextField;
*年龄：AgeTextField;
*/