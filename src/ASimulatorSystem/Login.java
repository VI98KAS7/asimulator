package ASimulatorSystem;

//import jdk.nashorn.internal.scripts.JO;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
        JLabel l1, l2, l3;
        JTextField tf1, pf1;
        //JPasswordField pf1;
        JButton b1, b2, b3;

        //SignUp sn = new SignUp();
        public Login() {
            // setting Text to the centre

            setFont(new Font("System", Font.BOLD, 22));
            Font f = getFont();
            FontMetrics fm = getFontMetrics(f);
            int x = fm.stringWidth("AUTOMATED TElleR MACHINE");
            int y = fm.stringWidth(" ");
            int z = getWidth() - x;
            int w = z/y;
            String pad = "";
            //for (int i = 0; i!=w; i++) pad += " ";
            pad = String.format("%"+w+"s", pad);
            setTitle("AUTOMATED TELLER MACHINE");

            //Defining Components
            l1 = new JLabel("WELCOME TO ATM");
            l1.setFont(new Font("Osward",Font.BOLD, 38));

            l2 = new JLabel("Card No:");
            l2.setFont(new Font("Raleway",Font.BOLD, 28));

            l3 = new JLabel("Pin:");
            l3.setFont(new Font("Raleway",Font.BOLD, 28));

            tf1 = new JTextField();
            tf1.setFont(new Font("Osward", Font.BOLD, 24));

            pf1 = new JTextField();

            pf1.setFont(new Font("Osward", Font.BOLD, 24));

            b1 = new JButton("SIGN IN");
            b1.setFont(new Font("Raleway", Font.BOLD, 24));
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.white);

            b2 = new JButton("CLEAR");
            b2.setFont(new Font("Raleway", Font.BOLD, 24));
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.white);

            b3 = new JButton("NEW ACCOUNT");
            b3.setFont(new Font("Raleway", Font.BOLD, 24));
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.white);

            setLayout(null);

            l1.setBounds(280, 30, 390, 170);
            this.add(l1);

            l2.setBounds(250, 200, 180, 50);
            this.add(l2);

            l3.setBounds(250, 260, 180, 50);
            this.add(l3);

            tf1.setBounds(430, 200, 250, 50);
            this.add(tf1);

            pf1.setBounds(430, 260, 250, 50);
            this.add(pf1);

            b1.setBounds(250, 350, 200, 50);
            this.add(b1);

            b2.setBounds(475, 350, 200, 50);
            this.add(b2);

            b3.setBounds(250, 410, 425, 50);
            this.add(b3);

            //Adding Action Listener
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            setSize(950,700);
            setLocation(200, 10);
            setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try {
            Conn c1 = new Conn();
            String a = tf1.getText();
            String b = pf1.getText();

            String sql = "SELECT * FROM login WHERE cardno = '"+a+"' and pin = '"+b+"'";
            ResultSet rs = c1.s.executeQuery(sql);

            if (ae.getSource() == b1) {
                if (rs.next()) {
                    new Transaction().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card no or password");
                }
            } else
            if(ae.getSource() == b2) {
                tf1.setText("");
                pf1.setText("");
            } else if(ae.getSource() == b3) {
                new SignUp().setVisible(true);
                setVisible(false);
            }
        }
        catch (Exception e) {
              e.printStackTrace();
        System.out.println("Error" +e);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
    
}
