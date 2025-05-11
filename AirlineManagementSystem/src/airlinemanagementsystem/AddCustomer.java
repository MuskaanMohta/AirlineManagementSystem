package airlinemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JTextField tfname,tfnationality,tfaadhar,tfaddress,tfphone,tfemail;
    JRadioButton rbmale,rbfemale;
    
    public AddCustomer(){
        getContentPane().setBackground(new Color(51,153,255));
        setLayout(null);
        
        JLabel heading=new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(220,20,500,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("BELL MT",Font.ITALIC,32));
        add(heading);
        
        //NAME
        JLabel lblname=new JLabel("NAME");
        lblname.setBounds(20,80,150,25);
        lblname.setForeground(Color.WHITE);
        lblname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,80,250,25);
        add(tfname);
        
        //NATIONALITY
        JLabel lblnationality = new JLabel("NATIONALITY");
        lblnationality.setBounds(20, 130, 150, 25);
        lblnationality.setForeground(Color.WHITE);
        lblnationality.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(200,130,150,25);
        add(tfnationality);
        
        //AADHAR
        JLabel lblaadhar = new JLabel("AADHAR NO.");
        lblaadhar.setBounds(20, 180, 150, 25);
        lblaadhar.setForeground(Color.WHITE);
        lblaadhar.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(200,180,150,25);
        add(tfaadhar);
        
        //ADDRESS
        JLabel lbladdress = new JLabel("ADDRESS");
        lbladdress.setBounds(20, 230, 150, 25);
        lbladdress.setForeground(Color.WHITE);
        lbladdress.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,230,250,25);
        add(tfaddress);
        
        //GENDER
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(20, 280, 150, 25);
        lblgender.setForeground(Color.WHITE);
        lblgender.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblgender);
        
        ButtonGroup gendergroup = new ButtonGroup();
        
        rbmale = new JRadioButton("MALE");
        rbmale.setBounds(200,280,70,25);
        rbmale.setBackground(new Color(51,153,255));
        rbmale.setForeground(Color.WHITE);
        rbmale.setFont(new Font("Arial",Font.BOLD,16));
        add(rbmale);
        
        rbfemale = new JRadioButton("FEMALE");
        rbfemale.setBounds(300,280,100,25);
        rbfemale.setBackground(new Color(51,153,255));
        rbfemale.setForeground(Color.WHITE);
        rbfemale.setFont(new Font("Arial",Font.BOLD,16));
        add(rbfemale);
        
        gendergroup.add(rbmale);
        gendergroup.add(rbfemale);
        
        //PHONE
        JLabel lblphone = new JLabel("CONTACT NO.");
        lblphone.setBounds(20, 330, 150, 25);
        lblphone.setForeground(Color.WHITE);
        lblphone.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200,330,150,25);
        add(tfphone);
        
        //EMAIL
        JLabel lblemail = new JLabel("EMAIL ID");
        lblemail.setBounds(20, 380, 150, 25);
        lblemail.setForeground(Color.WHITE);
        lblemail.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,380,250,25);
        add(tfemail);
        
        //SAVE BUTTON
        JButton save = new JButton("SAVE");
        save.setBackground(new Color(0,0,150));
        save.setForeground(Color.WHITE);
        save.setFont(new Font("Bell MT",Font.BOLD,18));
        save.setBounds(220,440,150,30);
        save.addActionListener(this);
        add(save);
        
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/customer.jpg"));
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(500,80,300,400);
        add(lblimage);
        
        setSize(900,600);
        setLocation(300,150);  
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String name=tfname.getText();
        String nationality=tfnationality.getText();
        String aadhar=tfaadhar.getText();
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        String gender=null;
        
        if(rbmale.isSelected())
            gender="MALE";
        else
            gender="FEMALE";
        
        try{
             Conn c = new Conn(); 
             String query = "insert into passenger values('"+name+"','"+nationality+"','"+aadhar+"','"+address+"','"+gender+"','"+phone+"','"+email+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
             setVisible(false);
         }
         catch(Exception e){
             e.printStackTrace();
         }
    }
    public static void main(String args[]){
        new AddCustomer();
    }
}
