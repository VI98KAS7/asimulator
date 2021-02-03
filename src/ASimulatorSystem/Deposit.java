package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Deposit extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2;
    JButton b1, b2, b3;
    public Deposit() {

        setLayout(null);

        l2 = new JLabel("ENTER AMOUNT YOU WANT");
        l2.setFont(new Font("Raleway", Font.BOLD, 38));
        l2.setBounds(110, 150, 1200, 50);
        add(l2);

        l3 = new JLabel("TO DEPOSIT");
        l3.setFont(new Font("Raleway", Font.BOLD, 38));
        l3.setBounds(240, 200, 1200, 50);
        add(l3);

        l4 = new JLabel("Enter Pin: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 25));
        l4.setBounds(400,20,150,35);
        this.add(l4);

        tf1 = new JTextField();
        tf1.setBounds(520, 20, 150, 35);
        tf1.setFont(new Font("Raleway", Font.BOLD, 18));
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(180, 300, 350, 35);
        tf2.setFont(new Font("Raleway", Font.BOLD, 18));
        add(tf2);

        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(370, 350, 150, 40);
        add(b1);

        b2 = new JButton("DEPOSIT");
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(190, 350, 150, 40);
        add(b2);

        b3 = new JButton("EXIT");
        b3.setFont(new Font("Raleway", Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(220, 450, 250, 40);
        add(b3);

        b1.addActionListener(this);//back
        b2.addActionListener(this);//deposit
        b3.addActionListener(this);//exit


        setVisible(true);
        setLocation(300,10);
        setSize(700,700);
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            String a = tf1.getText(); //Pin
            String b = tf2.getText();
            //double balance = 0, d = 0;

            if (ae.getSource() == b2) {
                if (tf2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter amount before Deposit");
                } else if(a.equals("")) {
                    JOptionPane.showMessageDialog(null, "Pin is Required for deposit");
                }
                else {
                    Conn c1 = new Conn();

                    ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+a+"' ");

//                    while (rs.next()) {
//                        String pin = rs.getString("pin");
//
//                        if (a == pin) {
//
//                            balance = Double.parseDouble(b);
//                            String s1 = "INSERT INTO bank VALUES('"+pin+"','"+balance+"',null,'"+balance+"')";
//                            c1.s.executeUpdate(s1);
//                        }
//                        break;
//                    }

                    double balance = 0;
                    if (rs.next()) {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");

                        double d = Double.parseDouble(b);
                        balance = balance + d;

                        String.valueOf(balance);
                        String.valueOf(d);

                        String s1 = "INSERT INTO bank VALUES('"+pin+"','"+d+"',null,'"+balance+"')";
                        c1.s.executeUpdate(s1);
                    }
                    JOptionPane.showMessageDialog(null, "Rs. "+b+" Deposited Successfully ");

                    new Transaction().setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == b1) {
                new Transaction().setVisible(true);
                setVisible(false);
            } else if (ae.getSource() == b3) {
                System.exit(0);
            }

        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        new Deposit();
    }
    
}
