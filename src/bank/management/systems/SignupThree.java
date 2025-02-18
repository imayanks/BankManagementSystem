package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(800, 1000));
        contentPanel.setBackground(Color.WHITE);  // Set background color to white
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 850, 820);
        add(scrollPane);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        contentPanel.add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 130, 200, 40);
        contentPanel.add(type);
        
        
        r1 = new JRadioButton("Saving Acount");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        contentPanel.add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        contentPanel.add(r2);
        
        r3 = new JRadioButton("Current Acount");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 150, 20);
        contentPanel.add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Acount");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        contentPanel.add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        contentPanel.add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        contentPanel.add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number:");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        contentPanel.add(carddetail);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        contentPanel.add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        contentPanel.add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password:");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        contentPanel.add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        contentPanel.add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        contentPanel.add(c1);
        
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        contentPanel.add(c2);
        
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        contentPanel.add(c3);
        
        c4 = new JCheckBox("SMS & EMAIL ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        contentPanel.add(c4);
        
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        contentPanel.add(c5);
        
        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        contentPanel.add(c6);
        
        c7 = new JCheckBox("I Hereby Declares That The Above Entered Details Are Correct To The Best Of My Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        contentPanel.add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit .addActionListener(this);
        contentPanel.add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel .addActionListener(this);
        contentPanel.add(cancel);
        
        getContentPane().setBackground(Color.WHITE); // Set main frame background to white
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    
        if (ae.getSource() == submit) {
        String accountType = null;
        if (r1.isSelected()) {
            accountType = "Savings Account";
        } else if (r2.isSelected()) {
            accountType = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            accountType = "Current Account";
        } else if (r4.isSelected()) {
            accountType = "Recurring Deposit Account";
        }

        if (accountType == null) {
            JOptionPane.showMessageDialog(null, "Please select an Account Type.");
            return;
        }

        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        
        String facility = "";
        if (c1.isSelected()) {
            facility += "ATM CARD, ";
        }
        if (c2.isSelected()) {
            facility += "INTERNET BANKING, ";
        }
        if (c3.isSelected()) {
            facility += "MOBILE BANKING, ";
        }
        if (c4.isSelected()) {
            facility += "EMAIL & SMS ALERT, ";
        }
        if (c5.isSelected()) {
            facility += "CHEQUE BOOK, ";
        }
        if (c6.isSelected()) {
            facility += "E-STATEMENT, ";
        }

        if (facility.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Choose at least one service to proceed.");
            return;
        }

        if (!c7.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please check the declaration to proceed.");
            return;
        }

        try {
            Conn c = new Conn();
            String query1 = "insert into signupthree values('" + formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
            String query2 = "insert into login values('" + formno + "', '" + cardnumber + "', '" + pinnumber + "')";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null, "Card Number: "+ cardnumber + "\n PIN: " + pinnumber);
            
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    } else if (ae.getSource() == cancel) {
        setVisible(false);
        new Login().setVisible(true);
    }
}

    public static void main(String args[]) {
        new SignupThree("");
    }
}
