/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static sun.jvm.hotspot.HelloWorld.e;

/**
 *
 * @author Admin
 */
public class FormReport extends javax.swing.JFrame {

    /**
     * Creates new form FormReport
     */
    
    private Menu parentFrame;
    
    private DefaultTableModel tm_report_book;
    private DefaultTableModel tm_report_reader;

    
    public FormReport(Menu parent) {
        initComponents();
        this.parentFrame = parent;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        String[] col = {"STT", "Mã độc giả", "Tên độc giả", "Ngày sinh", "Giới tính", "Địa chỉ", "Số lượt mượn"};
        String[] cols = {"STT", "Mã sách", "Tên sách", "Thể loại", "Nhà xuất bản", "Số lượt mượn"};
        tm_report_book = new DefaultTableModel(cols, 0);
        tm_report_reader = new DefaultTableModel(col, 0);
        jRadioButton1.setSelected(true);
        tableReport.setModel(tm_report_book);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
            
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
        jPanel1 = new javax.swing.JPanel();
        dateTuNgay = new com.toedter.calendar.JDateChooser();
        dateDenNgay = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Thống kê");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        dateTuNgay.setDateFormatString("yyyy-MM-dd");

        dateDenNgay.setDateFormatString("yyyy-MM-dd");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Từ ngày:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đến ngày:");

        jRadioButton1.setText("Thống kê sách theo lượt mượn");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Thống kê độc giả theo lượt mượn");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateDenNgay, dateTuNgay});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateTuNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateDenNgay, dateTuNgay});

        tableReport.setModel(new javax.swing.table.DefaultTableModel(
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
        tableReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableReport);

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 153, 153));
        rSMaterialButtonCircle1.setText("Thống kê");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(998, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    
   
    private void tableReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReportMouseClicked
            // TODO add your handling code here:
        int row = tableReport.getSelectedRow(); 
        //if(row >= 0 && row < tableReport.getSelectedRow()){ 
         if(jRadioButton1.isSelected()){
            Date startDate = dateTuNgay.getDate();
            Date endDate = dateDenNgay.getDate();
            String book_id = tm_report_book.getValueAt(row, 1).toString();
            FormReaderReport frr = new FormReaderReport(startDate, endDate, book_id);
            frr.setVisible(true);
         }
         else{
            Date startDate = dateTuNgay.getDate();
            Date endDate = dateDenNgay.getDate();
            String reader_id = tm_report_reader.getValueAt(row, 1).toString();
            FormBookReport fbr = new FormBookReport(startDate, endDate, reader_id);
            fbr.setVisible(true);
             
         }
        //}    
        
        
        
    }//GEN-LAST:event_tableReportMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        //tm_report.setRowCount(0);
        tableReport.setModel(tm_report_book);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        //tm_report.setRowCount(0);
        tableReport.setModel(tm_report_reader);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        tm_report_book.setRowCount(0);
        tm_report_reader.setRowCount(0);
        
        if(dateTuNgay.getDate()==null || dateDenNgay.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Ngày không để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{        
            if(jRadioButton1.isSelected()){            
                try{
                   Connection conn = Controller.DBConnection.getConnection();
                   String sql_select = "SELECT book.id, book.name, book.type, book.publisher, subquery.count_books FROM (SELECT issue_book_detail.book_id, COUNT(*) AS count_books FROM issue_book_detail LEFT JOIN issue_book ON issue_book.issue_id = issue_book_detail.issue_id WHERE issue_book.issue_date >= ? AND issue_book.issue_date <= ? GROUP BY issue_book_detail.book_id ORDER BY count_books DESC) AS subquery LEFT JOIN book ON book.id = subquery.book_id;";
                   PreparedStatement pst = conn.prepareStatement(sql_select);
                   pst.setDate(1, new java.sql.Date(dateTuNgay.getDate().getTime()));
                   pst.setDate(2, new java.sql.Date(dateDenNgay.getDate().getTime()));
                   ResultSet rs = pst.executeQuery();
                   int stt = 0;
                   while(rs.next()){
                       ++stt;
                       String book_id = rs.getString(1);
                       String book_name = rs.getString(2);
                       String type = rs.getString(3);
                       String publisher = rs.getString(4);
                       int issue_number = rs.getInt(5);
                       Object[] ob = {stt, book_id, book_name, type, publisher, issue_number};
                       tm_report_book.addRow(ob);
                    }      
                   }
                catch(SQLException e){
                    e.printStackTrace();
                }

            }
            else{

                try{
                Connection conn = Controller.DBConnection.getConnection();
                String sql_select = "SELECT * FROM (SELECT issue_book.reader_id, COUNT(issue_book_detail.status) AS SoLuongSach FROM issue_book_detail LEFT JOIN issue_book ON issue_book.issue_id = issue_book_detail.issue_id WHERE issue_book.issue_date >= ? AND issue_book.issue_date <= ? GROUP BY issue_book.reader_id ORDER BY SoLuongSach DESC) AS subquery LEFT JOIN reader ON reader.id = subquery.reader_id";
                PreparedStatement pst = conn.prepareStatement(sql_select);
                pst.setDate(1, new java.sql.Date(dateTuNgay.getDate().getTime()));
                pst.setDate(2, new java.sql.Date(dateDenNgay.getDate().getTime()));
                ResultSet rs = pst.executeQuery();
                int stt = 0;
                while(rs.next()){
                  ++stt;
                  String reader_id = rs.getString(1);
                  String reader_name = rs.getString(4);
                  Date birth_date = rs.getDate(5);
                  String gender = rs.getString(6);
                  String address = rs.getString(7);
                  int soLuongSach = rs.getInt(2);
                  Object[] ob = {stt, reader_id, reader_name, birth_date, gender, address, soLuongSach};
                  tm_report_reader.addRow(ob);
               }  
                
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
                
            }
            
         
            

            
        }
        
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        parentFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReport(new Menu()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateDenNgay;
    private com.toedter.calendar.JDateChooser dateTuNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JTable tableReport;
    // End of variables declaration//GEN-END:variables
}
