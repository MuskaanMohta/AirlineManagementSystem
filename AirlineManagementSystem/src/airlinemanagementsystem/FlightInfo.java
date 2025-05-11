package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightInfo extends JFrame {
    
    public FlightInfo(){
        getContentPane().setBackground(new Color(51,153,255));
        setLayout(null);
        JLabel heading = new JLabel("FLIGHT INFORMATIONS");
        heading.setBounds(220,20,500,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("BELL MT",Font.ITALIC,32));
        add(heading);
        JTable table = new JTable();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
        
        table.setRowHeight(40);
        
        table.setFont(new Font("Bell MT", Font.BOLD, 18));
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(0,0,150)); 
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(4,60,770,500);
        add(jsp);
        
        
        setSize(800,520);
        setLocation(400,200);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new FlightInfo();
    }
}
