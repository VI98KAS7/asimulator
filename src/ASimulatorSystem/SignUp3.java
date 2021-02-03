
package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField tf1;
    JRadioButton rb1, rb2, rb3, rb4;
    JButton b1, b2;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;

    public SignUp3() {

        // setting Text to the centre

        setFont(new Font("System", Font.BOLD, 25));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT OPENING FORM - PAGE 2");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        //for (int i = 0; i!=w; i++) pad += " ";
        pad = String.format("%"+w+"s", pad);
        setTitle("NEW ACCOUNT OPENING FORM - PAGE 3");

        //Declaring variables
        l1 = new JLabel("Form No: ");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));

        l2 = new JLabel("Page 3: Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 25));

        l3 = new JLabel("Account Type: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("XXXX-XXXX-XXXX-1234");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("(Your 16 digit Card Number)");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));

        l7 = new JLabel(" It would appear on TM Card/Cheque Book and Statement");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));

        l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("(4-Digit password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));

        l11 = new JLabel("Serice Required");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        // JTextField

        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 18));
        tf1.setBounds(720,20,90,35);
        this.add(tf1);

        //JRadio Buttons:

        rb1 = new JRadioButton("Saving Account");
        rb1.setBounds(150,130, 200, 25);
        add(rb1);
        rb1.setFont(new Font("Raleway", Font.BOLD, 14));

        rb2 = new JRadioButton("Fixed Deposite Account");
        rb2.setBounds(350,130, 200, 25);
        add(rb2);
        rb2.setFont(new Font("Raleway", Font.BOLD, 14));

        rb3 = new JRadioButton("Current Account");
        rb3.setBounds(150,160, 200, 25);
        add(rb3);
        rb3.setFont(new Font("Raleway", Font.BOLD, 14));

        rb4 = new JRadioButton("Recurring Deposite Account");
        rb4.setBounds(350,160, 350, 25);
        add(rb4);
        rb4.setFont(new Font("Raleway", Font.BOLD, 14));

        //jButtons

        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(250, 540, 140, 35);
        b1.addActionListener(this);
        this.add(b1);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 25));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(420, 540, 140, 35);
        b2.addActionListener(this);
        this.add(b2);

        //JCheckBox
        cb1 = new JCheckBox("ATM Card");
        cb1.setFont(new Font("Raleway", Font.BOLD, 14));
        cb1.setBounds(150,370,200,25);
        add(cb1);

        cb2 = new JCheckBox("Internet Banking");
        cb2.setFont(new Font("Raleway", Font.BOLD, 14));
        cb2.setBounds(350,370,200,25);
        add(cb2);

        cb3 = new JCheckBox("Mobile Banking");
        cb3.setFont(new Font("Raleway", Font.BOLD, 14));
        cb3.setBounds(150,400,200,25);
        add(cb3);

        cb4 = new JCheckBox("Email Alerts");
        cb4.setFont(new Font("Raleway", Font.BOLD, 14));
        cb4.setBounds(350,400,200,25);
        add(cb4);

        cb5 = new JCheckBox("Cheque Book");
        cb5.setFont(new Font("Raleway", Font.BOLD, 14));
        cb5.setBounds(150,430,200,25);
        add(cb5);

        cb6 = new JCheckBox("E-Statement");
        cb6.setFont(new Font("Raleway", Font.BOLD, 14));
        cb6.setBounds(350,430,200,25);
        add(cb6);

        cb7 = new JCheckBox("I herby declares that the above entered details correct to the best of my knowledge.", true);
        cb7.setFont(new Font("Raleway", Font.BOLD, 12));
        cb7.setBounds(150,500,700,25);
        add(cb7);

        //Adding Components

        setLayout(null);

        l1.setBounds(600,20,150,35);
        this.add(l1);

        l2.setBounds(200,20,700,30);
        this.add(l2);

        l3.setBounds(150, 90, 350, 25);
        this.add(l3);

        l4.setBounds(150, 200, 350, 25);
        add(l4);

        l5.setBounds(350, 200, 350, 25);
        add(l5);

        l6.setBounds(150,225,350,25);
        this.add(l6);


        l7.setBounds(350,225,700,25);
        this.add(l7);

        l8.setBounds(150, 270, 150, 25);
        this.add(l8);

        l9.setBounds(350, 270, 150, 25);
        add(l9);

        l10.setBounds(150, 295, 200, 25);
        add(l10);

        l11.setBounds(150,340,350,25);
        this.add(l11);

        setVisible(true);
        setSize(850, 700);
        setLocation(200, 10);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = null;
        if (rb1.isSelected()) {
            a = "Saving Account";
        } else if (rb2.isSelected()) {
            a = "Fixed Deposit Account";
        } else if (rb3.isSelected()) {
            a = "Current Account";
        } else if (rb4.isSelected()) {
            a = "Recurring Deposite Account";
        }

        Random ram = new Random();
        long first7 = (ram.nextLong() % 90000000L) + 5040936000000000L;
        long first8 = Math.abs(first7);

        //Random ram = new Random();
        long first3 = (ram.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);

        String b = "";
        if (cb1.isSelected()) {
            b = b+" ATM Card";
        }
        if (cb2.isSelected()) {
            b = b+" Internet Banking";
        }
        if (cb3.isSelected()) {
            b = b+" Mobile Banking";
        }
        if (cb4.isSelected()) {
            b = b+" Email Alerts";
        }
        if (cb5.isSelected()) {
            b = b+" Cheque Book";
        }
        if (cb6.isSelected()) {
            b = b+" E-Statement";
        }

        String c = tf1.getText();

        try {
            if (ae.getSource() == b1) {
                if (b.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the Required Fields");
                } else {
                    Conn c1 = new Conn();
                    String sql1 = "INSERT INTO signup3 VALUES('"+a+"','"+first8+"','"+first4+"','"+b+"','"+c+"')";
                    String sql2 = "INSERT INTO login VALUES('"+first8+"','"+first4+"')";

                    c1.s.executeUpdate(sql1);
                    c1.s.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin" + first4);

                    new Deposit().setVisible(true);
                    setVisible(false);
                }
            } else if (ae.getSource() == b2) {
                System.exit(0);
            }
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp3();
    }
}
