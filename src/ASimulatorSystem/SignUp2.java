package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp2 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField tf1, tf2, tf3;
    JRadioButton rb1, rb2, rb3, rb4, rb5;
    JButton b;
    JComboBox cb1, cb2, cb3, cb4, cb5;

    Random ram = new Random();
    long first4 = (ram.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

    public SignUp2(){
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
        setTitle("NEW ACCOUNT OPENING FORM - PAGE 2");

        // Declaring variables
        l1 = new JLabel("Form No: ");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));

        l2 = new JLabel("Page 2: Additional Dtails");
        l2.setFont(new Font("Raleway", Font.BOLD, 25));

        l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Educational");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel(" Qualification:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Occupation:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("PAN Number:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("AADHAR Number:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Senior Citizen:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("Existing Account:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        //TextField declaration
        tf1 = new JTextField();
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));

        tf2 = new JTextField();
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));

        //Button Declaration
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 25));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(700, 560, 140, 35);
        b.addActionListener(this);
        this.add(b);

        //RadioButton Declaration
        rb1 = new JRadioButton("Yes");
        rb1.setFont(new Font("Raleway", Font.BOLD, 14));

        rb2 = new JRadioButton("No");
        rb2.setFont(new Font("Raleway", Font.BOLD, 14));

        rb3 = new JRadioButton("Yes");
        rb3.setFont(new Font("Raleway", Font.BOLD, 14));

        rb4 = new JRadioButton("No");
        rb4.setFont(new Font("Raleway", Font.BOLD, 14));

        //Declaring Combo box
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Buddhist","Others"};
        cb1 = new JComboBox(religion);
        cb1.setBackground(Color.white);

        String category[] = {"GENERAL","OBC","SC","ST","Other"};
        cb2 = new JComboBox(category);
        cb2.setBackground(Color.white);

        String income[] = {"Null","<10,000","<1,00,000","<10,00,000","ABOVE 10,00,000"};
        cb3 = new JComboBox(income);
        cb3.setBackground(Color.white);

        String education[] = {"Non-Graduate","Graduate","Post-graduate","Doctrate","Others"};
        cb4 = new JComboBox(education);
        cb4.setBackground(Color.white);

        String occupation[] = {"Salaried","Self-Employeed","Business","Student","Retired","Others"};
        cb5 = new JComboBox(occupation);
        cb5.setBackground(Color.white);

        //Setting in window
        setLayout(null);

        l1.setBounds(600,20,150,35);
        this.add(l1);

        l2.setBounds(200,20,700,30);
        this.add(l2);

        l3.setBounds(150, 100, 100, 25);
        this.add(l3);

        l4.setBounds(150, 150, 150, 25);
        add(l4);

        l5.setBounds(150, 200, 150, 25);
        add(l5);

        l6.setBounds(150,250,150,25);
        this.add(l6);


        l7.setBounds(145,270,150,25);
        this.add(l7);

        l8.setBounds(150, 320, 150, 25);
        this.add(l8);

        l9.setBounds(150, 370, 150, 25);
        add(l9);

        l10.setBounds(150, 420, 200, 25);
        add(l10);

        l11.setBounds(150,470,1200,25);
        this.add(l11);
        rb1.setBounds(400, 470, 100, 30);
        rb2.setBounds(530, 470, 100, 30);
        add(rb1);
        add(rb2);

        l12.setBounds(150,520,700,25);
        this.add(l12);
        rb3.setBounds(400, 520, 100, 30);
        rb4.setBounds(530, 520, 100, 30);
        add(rb3);
        add(rb4);

        //seting up all textfield
        cb1.setBounds(400, 100, 440, 30);
        cb1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cb1);

        cb2.setBounds(400, 150, 440, 30);
        cb2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cb2);

        cb3.setBounds(400, 200, 440, 30);
        cb3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cb3);

        cb4.setBounds(400, 250, 440, 30);
        cb4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cb4);

        cb5.setBounds(400, 320, 440, 30);
        cb5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cb5);

        tf1.setBounds(400, 370, 440, 30);
        tf1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf1);

        tf2.setBounds(400, 420, 440, 30);
        tf2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(720,20,90,35);
        tf3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(tf3);

//        Object get;
//        get.ContentPane().setBackground(Color.white);
        setLocation(200, 0);
        setSize(1000, 700);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        String a = (String)cb1.getSelectedItem();
        String b = (String)cb2.getSelectedItem();
        String c = (String)cb3.getSelectedItem();
        String d = (String)cb4.getSelectedItem();
        String e = (String)cb5.getSelectedItem();

        String f = tf1.getText();
        String g = tf2.getText();

        String h = null;
        if (rb1.isSelected()){
            h = "Yes";
        } else if (rb2.isSelected()) {
            h = "No";
        }

        String i = null;
        if (rb3.isSelected()){
            i = "Yes";
        } else if (rb4.isSelected()) {
            i = "No";
        }

        String j = tf3.getText();

        try {
            if (tf1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                Conn c1 = new Conn();
                //String s;
                String sql = "INSERT INTO SIGNUP2 VALUES('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                c1.s.executeUpdate(sql);

                new SignUp3().setVisible(true);
                setVisible(false);
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2();
    }
}

