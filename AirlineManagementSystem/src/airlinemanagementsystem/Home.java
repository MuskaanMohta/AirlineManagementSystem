package airlinemanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame implements ActionListener {
    public Home(){
        getContentPane().setBackground(new Color(51,153,255));
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/flight.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(0,5,1600,800);
        add(image);
        
        JLabel heading = new JLabel("INDIAN AIRLINES WELCOMES YOU");
        heading.setBounds(500,40,1000,40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Arial",Font.BOLD,36));
        image.add(heading);
        
        //Navbar or MenuBar
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        menubar.setPreferredSize(new Dimension(menubar.getPreferredSize().width,40));
        menubar.setBackground(new Color(0,0,140));
        menubar.setForeground(Color.WHITE);
        
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        details.setForeground(Color.WHITE);
        details.setFont(new Font("Arial",Font.PLAIN,15));
        
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        ticket.setForeground(Color.WHITE);
        ticket.setFont(new Font("Arial",Font.PLAIN,15));
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        
        JMenuItem logout = new JMenuItem("Logout");
        logout.setBackground(new Color(0,0,140));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Arial",Font.PLAIN,15));
        logout.addActionListener(this);
        menubar.add(logout);
        
        
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String text=ae.getActionCommand();
        if(text.equals("Add Customer Details")){
            new AddCustomer();
        }
        if(text.equals("Flight Details")){
            new FlightInfo();
        }
        if(text.equals("Book Flight")){
            new BookFlight();
        }
        if(text.equals("Journey Details")){
            new JourneyDetails();
        }
        if(text.equals("Cancel Ticket")){
            new Cancel();
        }
        if(text.equals("Boarding Pass")){
            new BoardingPass();
        }
        if(text.equals("Logout")){
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new Home();
    }
}
