package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;
import java.sql.ResultSet;
import java.util.Date;

public class New_Patient extends JFrame implements ActionListener {
    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldDisease, textFieldDeposit;

    JRadioButton r1, r2;
    Choice c1;
    JLabel date;
    JButton b1, b2;


    New_Patient() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 640);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(650, 150, 200, 200);
        panel.add(label);

        JLabel labelName = new JLabel("New Patient Form");
        labelName.setBounds(140, 11, 250, 60);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel.add(labelName);

        JLabel labelID = new JLabel("ID:");
        labelID.setBounds(35, 80, 200, 30);
        labelID.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelID.setForeground(Color.WHITE);
        panel.add(labelID);

        comboBox = new JComboBox(new String[]{"Aadhar Card", "Voter ID", "Driving License"});
        comboBox.setBounds(200, 85, 200, 20);
        comboBox.setBackground(new Color(3, 45, 48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("ID number:");
        labelNumber.setBounds(35, 130, 200, 30);
        labelNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelNumber.setForeground(Color.white);
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(200, 130, 200, 20);
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name:");
        labelName1.setBounds(35, 180, 200, 30);
        labelName1.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName1.setForeground(Color.white);
        panel.add(labelName1);

        textName = new JTextField();
        textName.setBounds(200, 180, 200, 20);
        panel.add(textName);

        JLabel labelGender = new JLabel("Gender:");
        labelGender.setBounds(35, 230, 200, 30);
        labelGender.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelGender.setForeground(Color.white);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(109, 164, 170));
        r1.setBounds(200, 237, 80, 20);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(109, 164, 170));
        r2.setBounds(320, 237, 80, 20);
        panel.add(r2);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JLabel labelDisease = new JLabel("Disease:");
        labelDisease.setBounds(35, 280, 200, 30);
        labelDisease.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDisease.setForeground(Color.white);
        panel.add(labelDisease);

        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(200, 280, 200, 20);
        panel.add(textFieldDisease);

        JLabel labelRoom = new JLabel("Room:");
        labelRoom.setBounds(35, 330, 200, 30);
        labelRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelRoom.setForeground(Color.white);
        panel.add(labelRoom);

        c1 = new Choice();
        try {
            conn c = new conn();
            // Update the query to fetch only available rooms
            ResultSet resultSet = c.statement.executeQuery("SELECT room_no FROM Room WHERE Availability = 'Available'");

            // Add the available rooms to the dropdown
            while (resultSet.next()) {
                c1.add(resultSet.getString("room_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        c1.setBounds(200,330,200, 20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3, 45, 48));
        panel.add(c1);


        JLabel labelDate = new JLabel("Time:");
        labelDate.setBounds(35, 380, 200, 30);
        labelDate.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDate.setForeground(Color.white);
        panel.add(labelDate);

        Date date1 = new Date();

        date = new JLabel("" + date1);
        date.setBounds(200, 385, 300, 20);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.BOLD,17));
        panel.add(date);

        JLabel labelDeposit = new JLabel("Deposit:");
        labelDeposit.setBounds(35, 430, 200, 30);
        labelDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelDeposit.setForeground(Color.white);
        panel.add(labelDeposit);

        textFieldDeposit = new JTextField();
        textFieldDeposit.setBounds(200, 435, 200, 20);
        panel.add(textFieldDeposit);

        b1 = new JButton("ADD");
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.setBounds(75, 500, 150, 50);
        b1.setBackground(new Color(210,222,220));
        b1.setForeground(Color.BLACK);
        b1.addActionListener((this));
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.setBounds(300, 500, 150, 50);
        b2.setBackground(new Color(210,222,220));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);

        setUndecorated(true);
        setSize(900,650);
        setLayout(null);
        setLocation(520, 370);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            conn c = new conn();
            String radioBTN = null;
            if (r1.isSelected()) {
                radioBTN = "Male";
            } else if (r2.isSelected()) {
                radioBTN = "Female";
            }
            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = radioBTN;
            String s5 = textFieldDisease.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldDeposit.getText();


            try {
                String q = "insert into Patient_Info values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "')";
                String q1 = "update room set Availability = 'Occupied' where room_no = " + s6;
                c.statement.execute(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Added Successfully");
                setVisible(false);

            } catch (Exception E) {
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }


    }


    public static void main(String[] args) {
        new New_Patient();
    }
}
