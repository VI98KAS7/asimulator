package ASimulatorSystem;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    Pin() {

        setLayout(null);

        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(200, 100, 700, 40);
        add(l1);

        l2 = new JLabel("Current PIN");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(130, 200, 150, 22);
        add(l2);

        l3 = new JLabel("New PIN");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(130, 250, 150, 22);
        add(l3);

        l4 = new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(130, 300, 200, 22);
        add(l4);

        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 18));
        tf1.setBounds(300, 200, 350, 22);
        add(tf1);

        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 18));
        tf2.setBounds(300, 250, 350, 22);
        add(tf2);

        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 18));
        tf3.setBounds(300, 300, 350, 22);
        add(tf3);

        b1 = new JButton("SAVE");
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(200, 400, 150, 35);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(400, 400, 150, 35);
        add(b2);

        b1.addActionListener(this); //save
        b2.addActionListener(this); //back

        setLocation(300, 10);
        setSize(800, 700);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String a = tf1.getText();
        String b = tf2.getText();
        String c = tf3.getText();

        try {

            if (ae.getSource() == b1) {
                if(a.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill All Fields");
                } else
                if (b.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New Pin");
                } else
                if (c.equals("")) {
                    JOptionPane.showMessageDialog(null,"Enter New pin");
                } else
                if (b.equals(c)) {
                    Conn c1 = new Conn();
                    String q1 = "UPDATE bank SET pin = '"+b+"' where pin = '"+a+"'";
                    String q2 = "UPDATE login SET pin = '"+b+"' where pin = '"+a+"'";
                    String q3 = "UPDATE signup3 SET pin = '"+b+"' where pin = '"+a+"'";

                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);

                    JOptionPane.showMessageDialog(null, "PIN Changed Successfully");

                    new Transaction().setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == b2) {
                new Transaction().setVisible(true);
                setVisible(false);
            }

        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        new Pin();
    }
}
