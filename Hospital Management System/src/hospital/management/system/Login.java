package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField;

    JPasswordField jPasswordField;

    JButton b1, b2;

    Login() {
//username
        JLabel namelabel = new JLabel("Username :");
        namelabel.setBounds(60, 50, 120, 30);
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        namelabel.setForeground(Color.BLACK);
        add(namelabel);

//password
        JLabel password = new JLabel("Password :");
        password.setBounds(60,110, 120, 30);
        password.setFont(new Font("Tahoma", Font.BOLD, 20));
        password.setForeground(Color.BLACK);
        add(password);

//box for username
        textField = new JTextField();
        textField.setBounds(180,50,170,30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground((new Color(210,222,220)));
        add(textField);

//box for password
        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(180,110,170,30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(210,222,220));
        add(jPasswordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(340, -30, 400, 300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(70,170,120,30);
        b1.setFont(new Font("serig", Font.BOLD, 15));
        b1.setBackground(new Color(210,222,220));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(220,170,120,30);
        b2.setFont(new Font("serig", Font.BOLD, 15));
        b2.setBackground(new Color(210,222,220));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

//login page
        getContentPane().setBackground(new Color(138, 184, 199));
        setSize(750,300);
        setLocation(600, 350);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String Pass = jPasswordField.getText();

                String q = "select * from login where  ID = '" + user + "' and pwd = '" + Pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    new Reception();
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }


            } catch (Exception E) {
                E.printStackTrace();
            }

        } else {
            System.exit(10);

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}





