package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class BookFlight  extends JFrame implements ActionListener{
    
    JTextField tfaadhar;
    JLabel tfname,tfnationality,tfphone,tfemail,tfgender;
    JLabel labelfname,labelfcode;
    JButton fetchUser,fetchFlight,bookFlight;
    Choice source,destination;
    JDateChooser dcdate;
    
    BookFlight(){
        getContentPane().setBackground(new Color(0,0,150));
        setLayout(null);
        
        //Heading Label
        JLabel heading=new JLabel("BOOK FLIGHT");
        heading.setBounds(350,20,500,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("BELL MT",Font.ITALIC,32));
        add(heading);
        
        //Aadhar label
        JLabel lblaadhar = new JLabel("AADHAR");
        lblaadhar.setBounds(60, 80, 150, 25);
        lblaadhar.setForeground(new Color(244,194,194));
        lblaadhar.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblaadhar);
        
        //Aadhar TextField 
        tfaadhar = new JTextField();
        tfaadhar.setBounds(220,80,150,25);
        add(tfaadhar);
        
        //Fetch User button
        fetchUser = new JButton("USER DETAILS");
        fetchUser.setBackground(new Color(190,0,150));
        fetchUser.setFont(new Font("Arial",Font.ITALIC,16));
        fetchUser.setForeground(Color.WHITE);
        fetchUser.setBounds(380,80,150,25);
        fetchUser.addActionListener(this);
        add(fetchUser);
        
        //Label for Name
        JLabel lblname=new JLabel("NAME");
        lblname.setBounds(60,130,150,25);
        lblname.setForeground(new Color(244,194,194));
        lblname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblname);
        
        //Label for unedited field name value fetched from db
        tfname = new JLabel();
        tfname.setBounds(220,130,150,25);
        tfname.setForeground(new Color(255,248,220));
        tfname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfname);
        
        //Label for Nationality
        JLabel lblnationality = new JLabel("NATIONALITY");
        lblnationality.setBounds(60, 180, 150, 25);
        lblnationality.setForeground(new Color(244,194,194));
        lblnationality.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblnationality);
        
        //Nationality unedited field value fetched from DB
        tfnationality = new JLabel();
        tfnationality.setBounds(220,180,150,25);
        tfnationality.setForeground(new Color(255,248,220));
        tfnationality.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfnationality);
        
        //Label for GENDER
        JLabel lblgender = new JLabel("GENDER");
        lblgender.setBounds(60, 230, 150, 25);
        lblgender.setForeground(new Color(244,194,194));
        lblgender.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblgender);
        
        //Label for unedited field phone value fetched from DB
        tfgender=new JLabel();
        tfgender.setBounds(220,230,150,25);
        tfgender.setForeground(new Color(255,248,220));
        tfgender.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfgender);
        
        //Label for Phone
        JLabel lblphone = new JLabel("CONTACT NO.");
        lblphone.setBounds(60, 280, 150, 25);
        lblphone.setForeground(new Color(244,194,194));
        lblphone.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblphone);
        //Label for unedited field phone value fetched from DB
        tfphone = new JLabel();
        tfphone.setBounds(220,280,150,25);
        tfphone.setForeground(new Color(255,248,220));
        tfphone.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfphone);
        
        //Label for email
        JLabel lblemail = new JLabel("EMAIL ID");
        lblemail.setBounds(60, 330, 150, 25);
        lblemail.setForeground(new Color(244,194,194));
        lblemail.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblemail);
        //Label for unedited field email id value fetched from DB
        tfemail = new JLabel();
        tfemail.setBounds(220,330,250,25);
        tfemail.setForeground(new Color(255,248,220));
        tfemail.setFont(new Font("Bell MT",Font.BOLD,20));
        add(tfemail);
        
        //Label for source
        JLabel lblsource = new JLabel("SOURCE");
        lblsource.setBounds(60, 380, 150, 25);
        lblsource.setForeground(new Color(244,194,194));
        lblsource.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblsource);
        
        //Dropdown for source
        source = new Choice();
        source.setBounds(220,380,150,25);
        add(source);
        
        //label for destination
        JLabel lbldest = new JLabel("DESTINATION");
        lbldest.setBounds(60, 430, 150, 25);
        lbldest.setForeground(new Color(244,194,194));
        lbldest.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lbldest);
        
        //Dropdown box for destination
        destination = new Choice();
        destination.setBounds(220,430,150,25);
        add(destination);
        
        //Add values in dropdown of source and destination from db
        try
        {
            Conn c = new Conn();
            String query = "select * from flight";
            ResultSet rs = c.s.executeQuery(query); 
            
            while(rs.next()){
                source.add(rs.getString("source"));
                destination.add(rs.getString("destination"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //Fetch Flight Button
        fetchFlight = new JButton("FETCH FLIGHTS");
        fetchFlight.setBackground(new Color(190,0,150));
        fetchFlight.setFont(new Font("Arial",Font.ITALIC,16));
        fetchFlight.setForeground(Color.WHITE);
        fetchFlight.setBounds(380,430,180,25);
        fetchFlight.addActionListener(this);
        add(fetchFlight);
        
        //Label for flight name
        JLabel lblfname=new JLabel("FLIGHT NAME");
        lblfname.setBounds(60,480,150,25);
        lblfname.setForeground(new Color(244,194,194));
        lblfname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblfname);
        
        //Label for unedited field flight name value fetched from db
        labelfname = new JLabel();
        labelfname.setBounds(220,480,250,25);
        labelfname.setForeground(new Color(255,248,220));
        labelfname.setFont(new Font("Bell MT",Font.BOLD,20));
        add(labelfname);
        
        //Label for flight code
        JLabel lblfcode=new JLabel("FLIGHT CODE");
        lblfcode.setBounds(60,530,150,25);
        lblfcode.setForeground(new Color(244,194,194));
        lblfcode.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lblfcode);
        
        //Label for unedited field flight code value fetched from db
        labelfcode = new JLabel();
        labelfcode.setBounds(220,530,150,25);
        labelfcode.setForeground(new Color(255,248,220));
        labelfcode.setFont(new Font("Bell MT",Font.BOLD,20));
        add(labelfcode);
        
        //Label for date of travel
        JLabel lbldate=new JLabel("DATE OF TRAVEL");
        lbldate.setBounds(60,580,180,25);
        lbldate.setForeground(new Color(244,194,194));
        lbldate.setFont(new Font("Bell MT",Font.BOLD,20));
        add(lbldate);
        
        //Calendar will be dislayed
        dcdate = new JDateChooser();
        dcdate.setBounds(250,580,150,25);
        add(dcdate);
        
        //Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/book.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 420, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(600,80,500,410);
        add(lblimage);
        
        //Book Flight Button
        bookFlight = new JButton("BOOK FLIGHT");
        bookFlight.setBackground(new Color(190,0,150));
        bookFlight.setFont(new Font("Arial",Font.ITALIC,16));
        bookFlight.setForeground(Color.WHITE);
        bookFlight.setBounds(250,630,150,25);
        bookFlight.addActionListener(this);
        add(bookFlight);
        
        setSize(1100,700);
        setLocation(200,50);    
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==fetchUser){
            String aadhar = tfaadhar.getText();
            try{
                Conn c = new Conn();
                String query = "select * from passenger where aadhar='"+aadhar+"'";
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfnationality.setText(rs.getString("nationality"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                    tfgender.setText(rs.getString("gender"));
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter correct Aadhar Number");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else if(ae.getSource()==fetchFlight){
            String src = source.getSelectedItem();
            String dest = destination.getSelectedItem();
            try{
                Conn c = new Conn();
                String query = "select * from flight where source='"+src+"' and destination='"+dest+"'";
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    labelfname.setText(rs.getString("flight_name"));
                    labelfcode.setText(rs.getString("flight_code"));
                }
                else{
                    JOptionPane.showMessageDialog(null,"No Flights Found");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else{
            
            Random random = new Random();
            
            String aadhar=tfaadhar.getText();
            String name=tfname.getText();
            String nationality=tfnationality.getText();
            String gender = tfgender.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            String flightname = labelfname.getText();
            String flightcode = labelfcode.getText();
            
            String src = source.getSelectedItem();
            String dest = destination.getSelectedItem();
            
            String ddate = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            
            try{
                Conn c = new Conn();
                String query="insert into reservation values('PNR-"+random.nextInt(1000000)+"','TIC-"+random.nextInt(1000000)+"','"+aadhar+"','"+name+"','"+nationality+"','"+gender+"','"+phone+"','"+email+"','"+flightname+"','"+flightcode+"','"+src+"','"+dest+"','"+ddate+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"FLight Ticket Booked Successfully");
                setVisible(false);
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
        
    }
    
    public static void main(String args[]){
        new BookFlight();
    }
}
