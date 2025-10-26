import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    private JTextField tfName, tfRoll, tfClass, tfDepartment, tfEmail;
    private JButton btnSubmit, btnClear;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel("Name:"));
        tfName = new JTextField();
        panel.add(tfName);

        panel.add(new JLabel("Roll Number:"));
        tfRoll = new JTextField();
        panel.add(tfRoll);

        panel.add(new JLabel("Class:"));
        tfClass = new JTextField();
        panel.add(tfClass);

        panel.add(new JLabel("Department:"));
        tfDepartment = new JTextField();
        panel.add(tfDepartment);

        panel.add(new JLabel("Email:"));
        tfEmail = new JTextField();
        panel.add(tfEmail);

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
        panel.add(btnSubmit);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        panel.add(btnClear);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String name = tfName.getText();
            String roll = tfRoll.getText();
            String cls = tfClass.getText();
            String dept = tfDepartment.getText();
            String email = tfEmail.getText();

            if (name.isEmpty() || roll.isEmpty() || cls.isEmpty() || dept.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(this, "Invalid email format", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Student Registered Successfully!");
            }
        } else if (e.getSource() == btnClear) {
            tfName.setText("");
            tfRoll.setText("");
            tfClass.setText("");
            tfDepartment.setText("");
            tfEmail.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
