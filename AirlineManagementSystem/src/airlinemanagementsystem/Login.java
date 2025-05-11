package airlinemanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton reset,submit,close;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    public Login(){
        getContentPane().setBackground( new Color(127,0,255));
        setLayout(null);
        
        //Label for username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20,20,100,20);
        lblusername.setForeground(Color.WHITE);
        lblusername.setFont(new Font("ALGERIAN",Font.ITALIC,18));
        add(lblusername);
        
        //Text Field for username
         tfusername = new JTextField();
        tfusername.setBounds(130,20,200,20);
        add(tfusername);
        
        //Label for password
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20,60,100,20);
        lblpassword.setForeground(Color.WHITE);
        lblpassword.setFont(new Font("ALGERIAN",Font.ITALIC,18));
        add(lblpassword);
        
        //Password Field for password
        tfpassword = new JPasswordField();
        tfpassword.setBounds(130,60,200,20);
        add(tfpassword);
        
        //Reset Button
        reset = new JButton("RESET");
        reset.setBounds(40,120,120,20);
        reset.setBackground(new Color(200,0,125));
        reset.setFont(new Font("Arial",Font.BOLD,15));
        reset.setForeground(Color.WHITE);
        reset.addActionListener(this);
        add(reset);
        
        //Submit Button
        submit = new JButton("SUBMIT");
        submit .setBounds(190,120,120,20);
        submit.setBackground(new Color(200,0,125));
        submit.setFont(new Font("Arial",Font.BOLD,15));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        //Close Button
        close = new JButton("CLOSE");
        close.setBounds(120,160,120,20);
        close.setBackground(new Color(200,0,125));
        close.setFont(new Font("Arial",Font.BOLD,15));
        close.setForeground(Color.WHITE);
        close.addActionListener(this);
        add(close);
        
        setSize(400,250);
        setLocation(600,250);
        setUndecorated(true);
        setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==submit){
             String username = tfusername.getText();
             String password = tfpassword.getText();
             try{
                Conn c = new Conn(); 
                String query = "select * from login where username = '"+username+"' and password = '"+password+"'";  
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    new Home();
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    setVisible(false);
                }
             }
             catch(Exception e){
                 e.printStackTrace();
             }
         }
         else if(ae.getSource()==close){
             setVisible(false);
         }
         else if(ae.getSource()==reset){
             tfusername.setText("");
             tfpassword.setText("");
         }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
