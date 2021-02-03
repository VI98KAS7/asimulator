package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Withdraw extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2;
    JButton b1, b2, b3;
    public Withdraw() {

        setLayout(null);

        l1 = new JLabel("MAXIMUM DAILY WITHDRAWAL");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(130, 100, 1200, 50);
        add(l1);

        l2 = new JLabel("IS RS. $10,000");
        l2.setFont(new Font("Raleway", Font.BOLD, 38));
        l2.setBounds(320, 150, 450, 50);
        add(l2);

        l3 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l3.setFont(new Font("Raleway", Font.BOLD, 38));
        l3.setBounds(130, 300, 1200, 50);
        add(l3);

        l4 = new JLabel("Enter Pin: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 25));
        l4.setBounds(600,20,150,35);
        this.add(l4);

        tf1 = new JTextField();
        tf1.setBounds(720, 20, 150, 35);
        tf1.setFont(new Font("Raleway", Font.BOLD, 18));
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(140, 350, 570, 35);
        tf2.setFont(new Font("Raleway", Font.BOLD, 18));
        add(tf2);

        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(450, 400, 250, 40);
        add(b1);

        b2 = new JButton("WITHDRAW");
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(150, 400, 250, 40);
        add(b2);

        b3 = new JButton("EXIT");
        b3.setFont(new Font("Raleway", Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(300, 500, 250, 40);
        add(b3);

        b1.addActionListener(this); //back
        b2.addActionListener(this); //withdraw
        b3.addActionListener(this); //exit

        setVisible(true);
        setLocation(200,20);
        setSize(900,700);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String a = tf1.getText(); //Pin
            String b = tf2.getText();

            if (ae.getSource() == b2) {
                if (tf2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter amount before withdraw");
                } else {
                    Conn c1 = new Conn();

                    ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+a+"' ");

                    double balance = 0;
                    if (rs.next()) {
                        String pin = rs.getString("pin");
                        balance = rs.getDouble("balance");

                        double d = Double.parseDouble(b);
                        balance = balance - d;

                        String s1 = "INSERT INTO bank VALUES('"+pin+"',null,'"+d+"','"+balance+"')";
                        c1.s.executeUpdate(s1);
                    }
                    JOptionPane.showMessageDialog(null, "Rs. "+b+" Debited Successfully ");

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
        new Withdraw();
    }
}
