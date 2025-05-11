package airlinemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BoardingPass extends JFrame implements ActionListener{
    
    JTextField tfpnr;
    JLabel tfname,tfnationality,tfsrc,tfdest,tflname,tfcode,tfdate;
    JButton show;
    
    public BoardingPass(){
        getContentPane().setBackground(new Color(0,0,150));
        setLayout(null);
        
        JLabel heading=new JLabel("BOARDING PASS");
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
        
        show = new JButton("ENTER");
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
        
        JLabel nationality = new JLabel("Nationality");
        nationality.setBounds(20,180,120,35);
        nationality.setForeground(new Color(244,194,194));
        nationality.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(nationality);
        
        tfnationality = new JLabel();
        tfnationality.setBounds(220,180,180,25);
        tfnationality.setForeground(new Color(255,248,220));
        tfnationality.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfnationality);
        
        JLabel src = new JLabel("Source");
        src.setBounds(20,230,120,35);
        src.setForeground(new Color(244,194,194));
        src.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(src);
        
        tfsrc = new JLabel();
        tfsrc.setBounds(220,230,180,25);
        tfsrc.setForeground(new Color(255,248,220));
        tfsrc.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfsrc);
        
        JLabel dest = new JLabel("Destination");
        dest.setBounds(420,230,120,35);
        dest.setForeground(new Color(244,194,194));
        dest.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(dest);
        
        tfdest = new JLabel();
        tfdest.setBounds(560,230,180,25);
        tfdest.setForeground(new Color(255,248,220));
        tfdest.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfdest);
        
        JLabel fname = new JLabel("Flight Name");
        fname.setBounds(20,280,120,35);
        fname.setForeground(new Color(244,194,194));
        fname.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(fname);
        
        tflname = new JLabel();
        tflname.setBounds(220,280,180,25);
        tflname.setForeground(new Color(255,248,220));
        tflname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tflname);
        
        JLabel fcode = new JLabel("Flight Code");
        fcode.setBounds(420,280,120,35);
        fcode.setForeground(new Color(244,194,194));
        fcode.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(fcode);
        
        tfcode = new JLabel();
        tfcode.setBounds(560,280,180,25);
        tfcode.setForeground(new Color(255,248,220));
        tfcode.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfcode);
        
        JLabel fdate = new JLabel("Journey Date");
        fdate.setBounds(20,330,120,35);
        fdate.setForeground(new Color(244,194,194));
        fdate.setFont(new Font("BELL MT",Font.ITALIC,24));
        add(fdate);
        
        tfdate = new JLabel();
        tfdate.setBounds(220,330,180,25);
        tfdate.setForeground(new Color(255,248,220));
        tfdate.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfdate);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/boarding.jpg"));
        Image i2 = i1.getImage().getScaledInstance(320, 240, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(750,20,500,400);
        add(lblimage);
        
        setSize(1200,500);
        setLocation(200,150);
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
                    tfnationality.setText(rs.getString("nationality"));
                    tfsrc.setText(rs.getString("source"));
                    tfdest.setText(rs.getString("destination"));
                    tflname.setText(rs.getString("flight_name"));
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
    }
    
    
    public static void main(String args[]){
        new BoardingPass();
    }
}
