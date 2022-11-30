/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.kl;

import com.mycompany.helper.DatabaseHelper;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author oOOo
 */
public class SachDao {
    
    
     private DefaultTableModel tblModel;
    
    public boolean insert(Sach s) throws Exception{
        String sql = "insert into sach(MASACH, TENSACH, TENTACGIA, TENNXB,  THELOAI, SOLUONG, SOLUONGCONLAI, SOTRANG, MAVITRI) values(?,?,?,?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, s.getMASACH());
             pstmt.setString(2, s.getTENSACH());
              pstmt.setString(3, s.getTENTACGIA());
              pstmt.setString(4, s.getTENNXB());
               pstmt.setString(5, s.getTHELOAI());
                pstmt.setString(6, s.getSOLUONG());
                 pstmt.setString(7, s.getSOLUONGCONLAI());
                  pstmt.setString(8, s.getSOTRANG());
                   pstmt.setString(9, s.getMAVITRI());
                   
                   return pstmt.executeUpdate() > 0;
        }
    }
    
}
