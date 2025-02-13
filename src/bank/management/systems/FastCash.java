package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton hun, fiveHun, thou, twoThou, fiveThou, tenThou, back;
    String pinnumber;
    
    FastCash(String pinnumber) {
        
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
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(195, 255, 300, 30); // Adjusted position
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);
        
        hun = new JButton("₹100");
        hun.setBounds(170, 325, 160, 20);
        hun.addActionListener(this);
        image.add(hun);
        
        fiveHun = new JButton("₹500");
        fiveHun.setBounds(345, 325, 160, 20);
        fiveHun.addActionListener(this);
        image.add(fiveHun);
        
        thou = new JButton("₹1000");
        thou.setBounds(170, 350, 160, 20);
        thou.addActionListener(this);
        image.add(thou);
        
        twoThou = new JButton("₹2000");
        twoThou.setBounds(345, 350, 160, 20);
        twoThou.addActionListener(this);
        image.add(twoThou);
        
        fiveThou = new JButton("₹5000");
        fiveThou.setBounds(170, 375, 160, 20);
        fiveThou.addActionListener(this);
        image.add(fiveThou);
        
        tenThou = new JButton("₹10000");
        tenThou.setBounds(345, 375, 160, 20);
        tenThou.addActionListener(this);
        image.add(tenThou);
        
        back = new JButton("BACK");
        back.setBounds(170, 400, 160, 20);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back) {
           
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        
        } else {
            
            String amount = ((JButton)ae.getSource()).getText().substring(1);
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "₹"+ amount + "Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new FastCash("");
    }
}
