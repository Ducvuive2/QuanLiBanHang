/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame_XuatHoaDon;

/**
 *
 * @author khanh
 */
public class Sua extends javax.swing.JFrame {

    /**
     * Creates new form Sua
     */
    public Sua() {
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

        lableTitleSua = new javax.swing.JLabel();
        lableSOHD = new javax.swing.JLabel();
        lableNGHD = new javax.swing.JLabel();
        lableTRIGIA = new javax.swing.JLabel();
        txtSOHD = new javax.swing.JTextField();
        txtNGHD = new javax.swing.JTextField();
        txtTRIGIA = new javax.swing.JTextField();
        btnTrangQuanLy = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        lableKetqua1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lableTitleSua.setText("SỬA HOÁ ĐƠN");

        lableSOHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lableSOHD.setText("SOHD: ");

        lableNGHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lableNGHD.setText("NGHD: ");

        lableTRIGIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lableTRIGIA.setText("TRIGIA:");

        txtSOHD.setToolTipText("Nhập số hoá đơn");

        txtNGHD.setToolTipText("Nhập ngày hoá đơn");
        txtNGHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNGHDActionPerformed(evt);
            }
        });

        txtTRIGIA.setToolTipText("Trị giá hoá đơn");

        btnTrangQuanLy.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangQuanLy.setText("Trang quản lý");
        btnTrangQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangQuanLyActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lableTitleSua)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTrangQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lableSOHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lableNGHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lableTRIGIA, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lableKetqua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNGHD, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTRIGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lableTitleSua)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lableSOHD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSOHD)
                        .addGap(1, 1, 1)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableNGHD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNGHD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTRIGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTRIGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lableKetqua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrangQuanLy)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNGHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNGHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNGHDActionPerformed

    private void btnTrangQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangQuanLyActionPerformed
        // TODO add your handling code here:
        new XuatHoaDon().setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_btnTrangQuanLyActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTrangQuanLy;
    private javax.swing.JLabel lableKetqua1;
    private javax.swing.JLabel lableNGHD;
    private javax.swing.JLabel lableSOHD;
    private javax.swing.JLabel lableTRIGIA;
    private javax.swing.JLabel lableTitleSua;
    private javax.swing.JTextField txtNGHD;
    private javax.swing.JTextField txtSOHD;
    private javax.swing.JTextField txtTRIGIA;
    // End of variables declaration//GEN-END:variables
}