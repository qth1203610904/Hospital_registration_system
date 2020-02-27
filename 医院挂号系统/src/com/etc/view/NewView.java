package com.etc.view;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.etc.pojo.Doctor;

import com.etc.service.DoctorService;
import com.etc.pojo.staticAll;
import com.etc.util.ToolsUtil;
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class NewView extends javax.swing.JFrame {

	private static DoctorService doctorService = new DoctorService();

    /**
     * Creates new form NewView
     */
    public NewView() {
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
        NameTextField = new javax.swing.JTextField();
        DepartmentTextField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ReturnButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ProfessionTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("隶书", 0, 24)); // NOI18N
        jLabel1.setText("*新增医生信息表*");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("姓  名：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("所属科室：");

        NameTextField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        DepartmentTextField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        DepartmentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentTextFieldActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 51, 153));
        AddButton.setText("确认添加");
        AddButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 51, 204), new java.awt.Color(0, 102, 153)));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ReturnButton6.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        ReturnButton6.setForeground(new java.awt.Color(204, 0, 0));
        ReturnButton6.setText("返   回");
        ReturnButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 0, 0), new java.awt.Color(255, 51, 51)));
        ReturnButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("专   业：");

        ProfessionTextField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        ProfessionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessionTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReturnButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(ProfessionTextField)
                            .addComponent(NameTextField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfessionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>                        

    private void DepartmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void ReturnButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
        /**
         * 返回登录页面事件
         * @param evt
         */                                             
        // TODO add your handling code here:
        this.dispose();
        ChooseView chooseView = new ChooseView();
    }                                             

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        /**
         * 点击商品增加的按钮
         * @param evt
         */
    	// 获取输入的商品信息
    	String name = NameTextField.getText().trim(); 
    	// 商品为空
    	if(ToolsUtil.isEmpty(name)){
    		NameTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(AddButton.getParent(), "请输入医生名称!");
    		return;
    	}
    	
    	String department = DepartmentTextField.getText().trim();
    	
    	// 商品类型为空
    	if(ToolsUtil.isEmpty(department)){
    		DepartmentTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(AddButton.getParent(), "请输入所属科室!");
    		return;
    	}
    	
    	// 获取输入的商品信息
    	String profession = ProfessionTextField.getText().trim(); 
    	// 商品为空
    	if(ToolsUtil.isEmpty(profession)){
    		ProfessionTextField.requestFocus();
    		JOptionPane.showInternalMessageDialog(AddButton.getParent(), "请输入医生职业!");
    		return;
    	}
    	
    	
    	// 增加商品
    	Doctor doctor = new  Doctor( name, department, profession);
    	try {
			doctorService.addDoctorImfor(doctor);
			// 商品新增成功
			this.dispose();
			DoctorSelectView storeGoogsView = new DoctorSelectView();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showInternalMessageDialog(AddButton.getParent(), e.getMessage());
    		return;
		}
    	
    	this.dispose();
        DoctorSelectView loginView = new DoctorSelectView();
    }                                         

    private void ProfessionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
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
            java.util.logging.Logger.getLogger(NewView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField DepartmentTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField ProfessionTextField;
    private javax.swing.JButton ReturnButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}

/**专业：ProfessionTextField;
*确认添加： AddButton;
*所属科室：DepartmentTextField;
*姓名： NameTextField;
*返回：ReturnButton6;
*/