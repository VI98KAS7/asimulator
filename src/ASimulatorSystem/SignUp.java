package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    JRadioButton rb1, rb2, rb3, rb4, rb5;
    JButton b;
    JComboBox cb1, cb2, cb3;

    Random ram = new Random();
    long first4 = (ram.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    public SignUp(){
        // setting Text to the centre

        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT OPENING FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = "";
        //for (int i = 0; i!=w; i++) pad += " ";
        pad = String.format("%"+w+"s", pad);
        setTitle("NEW ACCOUNT OPENING FORM");

        // Declaring variables
        l1 = new JLabel("APPLICATION FORM NUMBER: " +first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Name: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        l13 = new JLabel("Date:");
        l13.setFont(new Font("Raleway", Font.BOLD, 20));

        l14 = new JLabel("Month:");
        l14.setFont(new Font("Raleway", Font.BOLD, 20));

        l15 = new JLabel("Year:");
        l15.setFont(new Font("Raleway", Font.BOLD, 20));

        //TextField declaration
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));

        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));

        tf3 = new JTextField();
        tf3.setFont(new Font("Raleway", Font.BOLD, 14));

        tf4 = new JTextField();
        tf4.setFont(new Font("Raleway", Font.BOLD, 14));

        tf5 = new JTextField();
        tf5.setFont(new Font("Raleway", Font.BOLD, 14));

        tf6 = new JTextField();
        tf6.setFont(new Font("Raleway", Font.BOLD, 14));

        tf7 = new JTextField();
        tf7.setFont(new Font("Raleway", Font.BOLD, 14));

        //Button Declaration
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 18));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(700, 600, 140, 35);
        b.addActionListener(this);
        this.add(b);

        //RadioButton Declaration
        rb1 = new JRadioButton("Male");
        rb1.setFont(new Font("Raleway", Font.BOLD, 14));

        rb2 = new JRadioButton("Female");
        rb2.setFont(new Font("Raleway", Font.BOLD, 14));

        rb3 = new JRadioButton("Married");
        rb3.setFont(new Font("Raleway", Font.BOLD, 14));

        rb4 = new JRadioButton("Unmarried");
        rb4.setFont(new Font("Raleway", Font.BOLD, 14));

        rb5 = new JRadioButton("Other");
        rb5.setFont(new Font("Raleway", Font.BOLD, 14));

        //Declaring Combo box
        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cb1 = new JComboBox(date);
        cb1.setBackground(Color.white);

        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        cb2 = new JComboBox(month);
        cb2.setBackground(Color.white);

        String year[] = {"1","2","3","4","5","6","7","8","9"};
        cb3 = new JComboBox(year);
        cb3.setBackground(Color.white);

        //Setting in window
        setLayout(null);

        l1.setBounds(150,20,1200,35);
        this.add(l1);

        l2.setBounds(350,60,700,30);
        this.add(l2);

        l3.setBounds(150, 100, 100, 18);
        this.add(l3);

        l4.setBounds(150, 150, 150, 18);
        add(l4);

        l5.setBounds(150, 200, 150, 18);
        add(l5);

        l6.setBounds(150,250,150,18);
        this.add(l6);
        rb1.setBounds(400, 250, 100, 30);
        rb2.setBounds(530, 250, 100, 30);
        add(rb1);
        add(rb2);

        l7.setBounds(150,300,150,18);
        this.add(l7);

        l8.setBounds(150, 350, 150, 18);
        this.add(l8);
        rb3.setBounds(400, 350, 100, 30);
        rb4.setBounds(530, 350, 100, 30);
        rb5.setBounds(660, 350, 100, 30);
        add(rb3);
        add(rb4);
        add(rb5);

        l9.setBounds(150, 400, 100, 18);
        add(l9);

        l10.setBounds(150, 450, 100, 22);
        add(l10);

        l11.setBounds(150,500,1200,18);
        this.add(l11);

        l12.setBounds(150,550,700,18);
        this.add(l12);

        l13.setBounds(400, 200, 70, 18);
        cb1.setBounds(455, 196, 80, 30);
        this.add(l13);
        add(cb1);

        l14.setBounds(540, 200, 70, 18);
        add(l14);
        cb2.setBounds(615, 196, 80, 30);
        add(cb2);

        l15.setBounds(700, 200, 70, 18);
        add(l15);
        cb3.setBounds(760, 196, 80, 30);
        add(cb3);


        //seting up all textfield
        tf1.setBounds(400, 100, 440, 30);
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf1);

        tf2.setBounds(400, 150, 440, 30);
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf2);

        tf3.setBounds(400, 300, 440, 30);
        tf3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf3);

        tf4.setBounds(400, 400, 440, 30);
        tf4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf4);

        tf5.setBounds(400, 450, 440, 30);
        tf5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf5);

        tf6.setBounds(400, 500, 440, 30);
        tf6.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf6);

        tf7.setBounds(400, 550, 440, 30);
        tf7.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf7);

        setLocation(200, 0);
        setSize(1000, 700);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        String a = tf1.getText();
        String b = tf2.getText();

        String ac = (String)cb1.getSelectedItem();
        String bc = (String)cb2.getSelectedItem();
        String cc = (String)cb3.getSelectedItem();

        String d = null;
        if (rb1.isSelected()) {
            d = "Male";
        } else if (rb2.isSelected()) {
            d = "Female";
        }

        String e = tf3.getText();
        String f = null;
        if (rb3.isSelected()) {
            f = "Married";
        } else if (rb4.isSelected()) {
            f = "Unmarried";
        } else if (rb5.isSelected()) {
            f = "Others";
        }

        String g = tf4.getText();
        String h = tf5.getText();
        String i = tf6.getText();
        String j = tf7.getText();

        try {
            if (tf1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                Conn c1 = new Conn();
                String sql = "INSERT INTO signup VALUES('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
                c1.s.executeUpdate(sql);

                new SignUp2().setVisible(true);
                setVisible(false);
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
       new SignUp();
    }
}
