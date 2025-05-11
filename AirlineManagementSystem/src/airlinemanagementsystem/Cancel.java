package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class Cancel extends JFrame implements ActionListener {

    JTextField tfpnr;
    JButton show,cancelBtn;
    JLabel tfname,tfcancel,tfcode,tfdate;
    
    public Cancel(){
        getContentPane().setBackground(new Color(0,0,150));
        setLayout(null);
        
        Random random = new Random();
        
        JLabel heading=new JLabel("CANCELLATION");
        heading.setBounds(320,20,500,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("BELL MT",Font.ITALIC,32));
        add(heading);
        
        JLabel lblpnr = new JLabel("PNR Number :");
        lblpnr.setBounds(20,80,280,35);
        lblpnr.setForeground(new Color(244,194,194));
        lblpnr.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(lblpnr);
        
        tfpnr = new JTextField();
        tfpnr.setBounds(200,85,130,25);
        add(tfpnr);
        
        show = new JButton("Show Details");
        show.setBackground(new Color(190,0,150));
        show.setForeground(Color.WHITE);
        show.setFont(new Font("BELL MT",Font.ITALIC,20));
        show.setBounds(360,80,140,30);
        show.addActionListener(this);
        add(show);
        
        JLabel name = new JLabel("Name");
        name.setBounds(20,130,120,35);
        name.setForeground(new Color(244,194,194));
        name.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(name);
        
        tfname = new JLabel();
        tfname.setBounds(220,130,180,25);
        tfname.setForeground(new Color(255,248,220));
        tfname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfname);
        
        JLabel cancel = new JLabel("Cancellation No.");
        cancel.setBounds(20,180,160,35);
        cancel.setForeground(new Color(244,194,194));
        cancel.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(cancel);
        
        tfcancel = new JLabel(""+random.nextInt(1000000));
        tfcancel.setBounds(220,180,120,25);
        tfcancel.setForeground(new Color(255,248,220));
        tfcancel.setFont(new Font("Bell MT",Font.BOLD,28));
        add(tfcancel);
        
        JLabel fcode = new JLabel("Flight Code");
        fcode.setBounds(20,230,120,35);
        fcode.setForeground(new Color(244,194,194));
        fcode.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(fcode);
        
        tfcode = new JLabel();
        tfcode.setBounds(220,230,180,25);
        tfcode.setForeground(new Color(255,248,220));
        tfcode.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfcode);
        
        JLabel date = new JLabel("Travel Date");
        date.setBounds(20,280,150,35);
        date.setForeground(new Color(244,194,194));
        date.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(date);
        
        tfdate = new JLabel();
        tfdate.setBounds(220,280,180,25);
        tfdate.setForeground(new Color(255,248,220));
        tfdate.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfdate);
        
        cancelBtn = new JButton("CANCEL");
        cancelBtn.setBackground(new Color(190,0,150));
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setFont(new Font("BELL MT",Font.ITALIC,20));
        cancelBtn.setBounds(260,330,140,30);
        cancelBtn.addActionListener(this);
        add(cancelBtn);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/cancel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(320, 240, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(350,40,500,400);
        add(lblimage);
        
        setSize(800,450);
        setLocation(300,150);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== show){
            String pnr = tfpnr.getText();
            try{
                Conn c = new Conn();
                String query = "select * from reservation where PNR='"+pnr+"'";
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfcode.setText(rs.getString("flight_code"));
                    tfdate.setText(rs.getString("ddate"));
                }
                else{
                  JOptionPane.showMessageDialog(null,"Invalid PNR.Please enter valid PNR Number");  
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else if(ae.getSource()==cancelBtn){
            String name = tfname.getText();
            String PNR = tfpnr.getText();
            String cancelNo = tfcancel.getText();
            String flight_code = tfcode.getText();
            String ddate = tfdate.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into cancel values('"+PNR+"','"+name+"','"+cancelNo+"','"+flight_code+"','"+ddate+"')";
                c.s.executeUpdate(query);
                c.s.executeUpdate("delete from reservation where PNR='"+PNR+"'");
                JOptionPane.showMessageDialog(null,"Ticket Cancelled");
                setVisible(false);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    
    public static void main(String args[]){
        new Cancel();
    }
}
