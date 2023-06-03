/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author thành
 */
public class Home extends JFrame implements ActionListener{
    JButton add, update, remove, view;
    Home(){
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(360, 170, 400, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add =new JButton("Add Employee");
        add.setBounds(350, 230, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view =new JButton("View Employee");
        view.setBounds(600, 230, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update =new JButton("Update Employee");
        update.setBounds(350, 290, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove =new JButton("Remove Employee");
        remove.setBounds(600, 290, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
       
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
  public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }
    
    public static void main(String[] args) {
        new Home();
    }
}
