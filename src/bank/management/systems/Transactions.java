package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit, cashWithdrawl, miniStatement, pinChange, fastCash, balanceEnquiry, exit;
    String pinnumber;
    
    Transactions(String pinnumber) {
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(900, 700));
        contentPanel.setBackground(Color.WHITE);  // Set background color to white
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 900, 700);
        add(scrollPane);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        contentPanel.add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210, 255, 300, 30); // Adjusted position
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(170, 325, 160, 20);
        deposit.addActionListener(this);
        image.add(deposit);
        
        cashWithdrawl = new JButton("CASH WITHDRAWAL");
        cashWithdrawl.setBounds(345, 325, 160, 20);
        cashWithdrawl.addActionListener(this);
        image.add(cashWithdrawl);
        
        fastCash = new JButton("FAST CASH");
        fastCash.setBounds(170, 350, 160, 20);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setBounds(345, 350, 160, 20);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        pinChange = new JButton("PIN CHANGE");
        pinChange.setBounds(170, 375, 160, 20);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setBounds(345, 375, 160, 20);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(170, 400, 160, 20);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900, 700);
        setLocation(300, 50);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == cashWithdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinChange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if (ae.getSource() == balanceEnquiry) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == miniStatement) {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Transactions("");
    }
}
