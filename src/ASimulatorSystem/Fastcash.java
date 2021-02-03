package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Fastcash extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    public Fastcash() {

        setLayout(null);
        l1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(130, 70, 1200, 50);
        add(l1);

        b1 = new JButton("Rs. 100");
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(150, 200, 250, 40);
        add(b1);

        b2 = new JButton("Rs. 500");
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(450, 200, 250, 40);
        add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setFont(new Font("Raleway", Font.BOLD, 25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(150, 300, 250, 40);
        add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setFont(new Font("Raleway", Font.BOLD, 25));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.setBounds(450, 300, 250, 40);
        add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setFont(new Font("Raleway", Font.BOLD, 25));
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);
        b5.setBounds(150, 400, 250, 40);
        add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setFont(new Font("Raleway", Font.BOLD, 25));
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        b6.setBounds(450, 400, 250, 40);
        add(b6);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("Raleway", Font.BOLD, 25));
        b7.setBackground(Color.black);
        b7.setForeground(Color.white);
        b7.setBounds(300, 500, 250, 40);
        add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setVisible(true);
        setLocation(200,20);
        setSize(900,700);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

        } else if (ae.getSource() == b2) {
            new Withdraw().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == b3) {
            new Fastcash().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == b4) {
            new Login().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == b5) {
            new Pin().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == b6) {
            String pinn = JOptionPane.showInputDialog("Enter Pin");
            Conn c1 = new Conn();

            try {
                ResultSet rs = c1.s.executeQuery("SELECT balance FROM bank ORDER BY pin = '"+pinn+"' DESC LIMIT 1");

                if (rs.next()) {
                    String balance = rs.getString("balance");
                    JOptionPane.showMessageDialog(null, "Ypur account balance is"+balance);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource()== b7){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Fastcash();
    }
}
