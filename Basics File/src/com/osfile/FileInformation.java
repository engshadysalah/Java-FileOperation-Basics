/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osfile;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class FileInformation extends JFrame {

    public FileInformation() {

        method();
    }

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;

    private void method() {

        JPanel p = new JPanel();
        add(p);

        JLabel l1 = new JLabel("File Bath");
        p.add(l1);

        JLabel l2 = new JLabel("Directory");
        p.add(l2);

        JLabel l3 = new JLabel("Can Writes");
        p.add(l3);

        JLabel l4 = new JLabel("Can Read");
        p.add(l4);

        JLabel l5 = new JLabel("Can Exection");
        p.add(l5);

        JLabel l6 = new JLabel("Last Mdifiy");
        p.add(l6);

        JLabel l7 = new JLabel("File Size");
        p.add(l7);

        JLabel l8 = new JLabel("is file");
        p.add(l8);

        JLabel l9 = new JLabel("is directory");
        p.add(l9);

        JLabel l10 = new JLabel("File Name");
        p.add(l10);

        t1 = new JTextField();
        p.add(t1);

        t2 = new JTextField();
        p.add(t2);

        t3 = new JTextField();
        p.add(t3);

        t4 = new JTextField();
        p.add(t4);

        t5 = new JTextField();
        p.add(t5);

        t6 = new JTextField();
        p.add(t6);

        t7 = new JTextField();
        p.add(t7);

        t8 = new JTextField();
        p.add(t8);

        t9 = new JTextField();
        p.add(t9);

        t10 = new JTextField();
        p.add(t10);

        JButton b = new JButton();
        p.add(b);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(450, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 450, 500);
        p.setBackground(Color.gray);
        p.setLayout(null);

        l1.setBounds(5, 10, 80, 50);
        l2.setBounds(5, 60, 80, 50);
        l3.setBounds(5, 110, 80, 50);
        l4.setBounds(5, 160, 80, 50);
        l5.setBounds(5, 210, 80, 50);
        l6.setBounds(5, 260, 80, 50);
        l7.setBounds(5, 310, 80, 50);
        l8.setBounds(5, 360, 80, 50);
        l9.setBounds(5, 410, 80, 50);
        l10.setBounds(260, 0, 60, 50);

        t1.setBounds(100, 10, 130, 30);
        t2.setBounds(100, 60, 130, 30);
        t3.setBounds(100, 110, 130, 30);
        t4.setBounds(100, 160, 130, 30);
        t5.setBounds(100, 210, 130, 30);
        t6.setBounds(100, 260, 130, 30);
        t7.setBounds(100, 310, 130, 30);
        t8.setBounds(100, 360, 130, 30);
        t9.setBounds(100, 410, 130, 30);
        t10.setBounds(320, 0, 130, 30);

        b.setBounds(300, 50, 130, 30);
        b.setText("Get Informetion");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                actionmethod(e);

            }
        });

    }
    
  

    private void actionmethod(ActionEvent e) {

        try {

           
            File f2 = new File(t10.getText());

            String canewrite = f2.canWrite() ? "Yes" : "NO";
            String caneread = f2.canRead() ? "Yes" : "NO";

            t1.setText(f2.getPath());
            t2.setText(f2.getParent());
            t3.setText(canewrite);
            t4.setText(caneread);
            t5.setText(f2.canExecute() ? "Yes" : "NO");
            t6.setText("Date" + new Date(f2.lastModified()));
            t7.setText(f2.length() + "bit");
            t8.setText(f2.isFile() ? "Yes" : "NO");
            t9.setText(f2.isDirectory() ? "Yes" : "NO");

        } catch (Exception exp) {

            System.err.print(exp.getMessage());
        }

    }
    
    public static void main(String[] args) {
        new FileInformation();
    }
}
