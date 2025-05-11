package airlinemanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class JourneyDetails extends JFrame implements ActionListener{
    
    JTextField tfpnr;
    JButton show;
    JTable table;
    
    public JourneyDetails(){
        
        getContentPane().setBackground(new Color(0,0,150));
        setLayout(null);
        
        JLabel lblpnr = new JLabel("Enter PNR Number :");
        lblpnr.setBounds(440,100,500,35);
        lblpnr.setForeground(Color.WHITE);
        lblpnr.setFont(new Font("BELL MT",Font.ITALIC,32));
        add(lblpnr);
        
        tfpnr = new JTextField();
        tfpnr.setBounds(400,150,400,35);
        add(tfpnr);
        
        show = new JButton("Show Details");
        show.setBackground(new Color(190,0,150));
        show.setForeground(Color.WHITE);
        show.setFont(new Font("BELL MT",Font.ITALIC,20));
        show.setBounds(480,200,150,25);
        show.addActionListener(this);
        add(show);
        
        
        
         
        setSize(1200,600);
        setLocation(200,150);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String pnr=tfpnr.getText();
        if(ae.getSource()==show){
            try{
                Conn c = new Conn();
                String query = "select PNR,TICKET,name as Name,aadhar as AADHAR,gender as Gender,ddate as Journey_Date,flight_name as Flight_Code,flight_code as Flight_Name,source as Source,destination as Destination from reservation where PNR='"+pnr+"'";
                ResultSet rs = c.s.executeQuery(query);              
                
                
                if(!rs.isBeforeFirst()){
                    JOptionPane.showMessageDialog(null,"Invalid PNR.Please enter valid PNR Number");
                } 
                else{
                   table = new JTable();
                   table.setShowGrid(true);
                   table.setGridColor(Color.BLACK);
                   table.setRowHeight(40);
                   table.setFont(new Font("Bell MT", Font.BOLD, 18));
                   table.setForeground(Color.WHITE);
                   table.setBackground(new Color(51,153,255)); 
        
                   JScrollPane jsp = new JScrollPane(table);
                   jsp.setBounds(24,300,1100,50);
                   add(jsp); 
                   table.setModel(DbUtils.resultSetToTableModel(rs));  
                }                               
            }
            catch(Exception e){
                e.printStackTrace();
            }  
        }   
    }
    
    public static void main(String args[]){
        new JourneyDetails();
    }
}
