package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, others;
    JDateChooser dateChooser;
    
    SignupOne() {
        
        setLayout(null);
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(800, 1000));
        contentPanel.setBackground(Color.WHITE);  // Set background color to white
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 850, 800);
        add(scrollPane);
        
        getContentPane().setBackground(Color.WHITE); // Set main frame background to white
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("Application Form No." + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        contentPanel.add(formno);
        
        JLabel personDetails = new JLabel("Page 1:Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        contentPanel.add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        contentPanel.add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        contentPanel.add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 190, 400, 30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(fnameTextField);
        
        JLabel dbo = new JLabel("Date Of Birth:");
        dbo.setFont(new Font("Raleway", Font.BOLD, 22));
        dbo.setBounds(100, 240, 200, 30);
        contentPanel.add(dbo);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        contentPanel.add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        contentPanel.add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 55, 30);
        male.setBackground(Color.WHITE);
        contentPanel.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(470, 290, 70, 30);
        female.setBackground(Color.WHITE);
        contentPanel.add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(640, 290, 63, 30);
        other.setBackground(Color.WHITE);
        contentPanel.add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        contentPanel.add(email);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        contentPanel.add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 80, 30);
        married.setBackground(Color.WHITE);
        contentPanel.add(married);
        
        unmarried = new JRadioButton("Un-Married");
        unmarried.setBounds(470, 390, 90, 30);
        unmarried.setBackground(Color.WHITE);
        contentPanel.add(unmarried);
        
        others = new JRadioButton("Others");
        others.setBounds(640, 390, 64, 30);
        others.setBackground(Color.WHITE);
        contentPanel.add(others);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        contentPanel.add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        contentPanel.add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        contentPanel.add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        contentPanel.add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300, 590, 400, 30);
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        contentPanel.add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
       
       String formno = "" + random; //long
       String name = nameTextField.getText();// setText
       String fname = fnameTextField.getText();
       String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
       String gender = null;
       if (male.isSelected()) {
           gender = "Male";
       } else if (female.isSelected()) {
           gender = "Female";
       
       } else if (other.isSelected()) {
           gender = "Other";
       }
       String email = emailTextField.getText();
       String marital = null;
       if (married.isSelected()) {
           marital = "Married";
       } else if (unmarried.isSelected()) {
           marital = "Unmarried";
       
       } else if (others.isSelected()) {
           marital = "Others";
       }
       String address = addressTextField.getText();
       String city = cityTextField.getText();
       String state = stateTextField.getText();
       String pincode = pincodeTextField.getText();
       
       
       try {
           
           if (name.equals("")) {
               JOptionPane.showMessageDialog(null,"Name is Required");
           } else {
               Conn c = new Conn();
               String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupTwo(formno).setVisible(true);
           }
           
       } catch (Exception e) {
           System.out.println(e);
       }
       
    }

    public static void main(String args[]) {
       
        new SignupOne();
    }
}
