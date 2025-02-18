package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl  extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton withdrawl, back;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(165, 230, 400, 20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,22));
        amount.setBounds(165, 270, 315, 25);
        image.add(amount);
        
        withdrawl = new JButton("WITHDRAW");
        withdrawl.setBounds(355, 353, 150, 20);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back = new JButton("BACK");
        back.setBounds(355, 383, 150, 20);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 700);
        setLocation(300, 0);
        setVisible(true);
        
    }
        
        public void actionPerformed(ActionEvent ae){
            
            if (ae.getSource() == withdrawl){
                
                String number = amount.getText();
                Date date = new Date();
                if (number.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You Want To Withdraw");
                } else {
                    
                    try{
                        Conn c = new Conn();
                        String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')";
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Rs "+number+" Withdrawn Successfully");
                        setVisible(false);
                         new Transactions(pinnumber).setVisible(true);
                        
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                
            }else if (ae.getSource() == back) {
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }
        }
    
    public static void main(String args[]) {
       new Withdrawl("");
    }
}

