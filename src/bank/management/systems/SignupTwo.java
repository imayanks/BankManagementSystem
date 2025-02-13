package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField aadharTextField, panTextField;
    JButton next;
    JRadioButton eyes ,eno, syes, sno;
    JComboBox Religion, Category, Occupation, Education, Income;
    String formno;
    
    SignupTwo(String formno) {
        
        this.formno = formno;
        setLayout(null);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(800, 1000));
        contentPanel.setBackground(Color.WHITE);  // Set background color to white
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 850, 800);
        add(scrollPane);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        contentPanel.add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 22));
        religion.setBounds(100, 140, 100, 30);
        contentPanel.add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Jain", "Others"};
        Religion = new JComboBox(valReligion);
        Religion.setBounds(300, 140, 400, 30);
        Religion.setBackground(Color.WHITE);
        contentPanel.add(Religion);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 22));
        category.setBounds(100, 190, 200, 30);
        contentPanel.add(category);
        
        String valCategory[] = {"General", "OBC", "ST", "SC", "Other"};
        Category = new JComboBox(valCategory);
        Category.setBounds(300, 190, 400, 30);
        Category.setBackground(Color.WHITE);
        contentPanel.add(Category);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setBounds(100, 240, 200, 30);
        contentPanel.add(income);
        
        String valIncome[] = {"Null", "< 1.5 lacs", "< 2.5 lacs", "< 5 lacs", "upto 10 lacs"};
        Income = new JComboBox(valIncome);
        Income.setBounds(300, 240, 400, 30);
        Income.setBackground(Color.WHITE);
        contentPanel.add(Income);
        
        JLabel Eductional = new JLabel("Eductional:");
        Eductional.setFont(new Font("Raleway", Font.BOLD, 22));
        Eductional.setBounds(100, 290, 200, 30);
        contentPanel.add(Eductional);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 22));
        qualification.setBounds(100, 315, 200, 30);
        contentPanel.add(qualification);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        Education = new JComboBox(educationValues);
        Education.setBounds(300, 315, 400, 30);
        Education.setBackground(Color.WHITE);
        contentPanel.add(Education);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        occupation.setBounds(100, 390, 200, 30);
        contentPanel.add(occupation);
        
        String valoccupation[] = {"Self-Employeed", "Salaried", "Student", "Agriculture", "Defence", "Lawyer","Doctor", "Others"};
        Occupation = new JComboBox(valoccupation);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.WHITE);
        contentPanel.add(Occupation);
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 22));
        pan.setBounds(100, 440, 200, 30);
        contentPanel.add(pan);
        
        panTextField = new JTextField();
        panTextField.setBounds(300, 440, 400, 30);
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar.setBounds(100, 490, 200, 30);
        contentPanel.add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(300, 490, 400, 30);
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        contentPanel.add(aadharTextField);
        
        JLabel SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        SeniorCitizen.setBounds(100, 540, 200, 30);
        contentPanel.add(SeniorCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(330, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        contentPanel.add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(490, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        contentPanel.add(sno);
        
        ButtonGroup SeniorCitizengroup = new ButtonGroup();
        SeniorCitizengroup.add(syes);
        SeniorCitizengroup.add(sno);
        
        JLabel ExistingCustomer = new JLabel("Existing Customer:");
        ExistingCustomer.setFont(new Font("Raleway", Font.BOLD, 22));
        ExistingCustomer.setBounds(100, 590, 200, 30);
        contentPanel.add(ExistingCustomer);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(330, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        contentPanel.add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(490, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        contentPanel.add(eno);
        
        ButtonGroup ExistingCustomergroup = new ButtonGroup();
        ExistingCustomergroup.add(eyes);
        ExistingCustomergroup.add(eno);
        
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
         
       String sreligion = (String) Religion.getSelectedItem();
       String scategory = (String) Category.getSelectedItem();
       String sincome = (String) Income.getSelectedItem();
       String seducation = (String) Education.getSelectedItem();
       String soccupation = (String) Occupation.getSelectedItem();
       String span = panTextField.getText();
       String saadhar = aadharTextField.getText();
       
       String SeniorCitizen = null;
       if (syes.isSelected()) {
           SeniorCitizen = "yes";
       } else if (sno.isSelected()) {
           SeniorCitizen = "No";
       }
       
       String ExistingAccount = null;
       if (eyes.isSelected()) {
           ExistingAccount = "yes";
       } else if (eno.isSelected()) {
           ExistingAccount = "No";
       }
           
       
       try {
           
           if (span.equals("")) {
               JOptionPane.showMessageDialog(null,"PAN Number is Required");
           }else if (saadhar.equals("")) {
               JOptionPane.showMessageDialog(null,"Aadhar Number is Required");
           }else {
               Conn c = new Conn();
               String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorCitizen, existingAccount)"+ "VALUES('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '"+ span + "' , '" + saadhar + "', '" + SeniorCitizen + "', '" + ExistingAccount + "')";
               c.s.executeUpdate(query);
           }
           
           
           //Signup3 Object
           setVisible(false);
           new SignupThree(formno).setVisible(true);
       } catch (Exception e) {
           System.out.println(e);
       }
       
    }

    public static void main(String args[]) {
       
        new SignupTwo("");
    }
}

