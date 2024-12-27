package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){


        JPanel panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,310,1900,720);
        panel.setBackground(new Color(138, 184, 199));
        add(panel);

        JButton btn10 = new JButton("Logout");
        btn10.setFont(new Font("serig", Font.BOLD, 25));
        btn10.setBounds(1560,650,300,50);
        btn10.setBackground(new Color(210,222,220));
        panel.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();

            }
        });


        JPanel panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10,5,1900,300);
        panel1.setBackground(new Color(138, 184, 199));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = i1.getImage().getScaledInstance(300,275,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1650,25,250,250);
        panel1.add(label);

//remember to add the logo to the top left corner

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image image1 = i11.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1,125,300,100);
        panel1.add(label1);

        JButton btn1 = new JButton("Add new Patient");
        btn1.setFont(new Font("serig", Font.BOLD, 25));
        btn1.setBounds(300,30,400,60);
        btn1.setBackground(new Color(210,222,220));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new New_Patient();

            }
        });


        JButton btn2 = new JButton("List of Rooms");
        btn2.setFont(new Font("serig", Font.BOLD, 25));
        btn2.setBounds(300,120,400,60);
        btn2.setBackground(new Color(210,222,220));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setFont(new Font("serig", Font.BOLD, 25));
        btn3.setBounds(300,210,400,60);
        btn3.setBackground(new Color(210,222,220));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btn4 = new JButton(" Employee info");
        btn4.setFont(new Font("serig", Font.BOLD, 25));
        btn4.setBounds(750,30,400,60);
        btn4.setBackground(new Color(210,222,220));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient info");
        btn5.setFont(new Font("serig", Font.BOLD, 25));
        btn5.setBounds(750,120,400,60);
        btn5.setBackground(new Color(210,222,220));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new ALL_Patient_Info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setFont(new Font("serig", Font.BOLD, 25));
        btn6.setBounds(750,210,400,60);
        btn6.setBackground(new Color(210,222,220));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_discharge();
            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setFont(new Font("serig", Font.BOLD, 25));
        btn7.setBounds(1200,30,400,60);
        btn7.setBackground(new Color(210,222,220));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new update_patient_details();
            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setFont(new Font("serig", Font.BOLD, 25));
        btn8.setBounds(1200,120,400,60);
        btn8.setBackground(new Color(210,222,220));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Ambulance();
            }
        });

        JButton btn9 = new JButton("Search room");
        btn9.setFont(new Font("serig", Font.BOLD, 25));
        btn9.setBounds(1200,210,400,60);
        btn9.setBackground(new Color(210,222,220));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchRoom();
            }
        });

        setSize(1900,2090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
