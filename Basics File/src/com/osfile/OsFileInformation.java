/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osfile;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rm
 */
public class OsFileInformation extends JFrame {

    public OsFileInformation() {

        jpInt();
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

    JTextField un;
    JLabel sho;

    JButton assc;
    JTextField ass;

    JTextArea show;

    private void jpInt() {

        JPanel p = new JPanel();
        add(p);

        JLabel l11 = new JLabel("os.name");
        p.add(l11);

        JLabel l1 = new JLabel();
        p.add(l1);

        JLabel l22 = new JLabel("os.vertion");
        p.add(l22);

        JLabel l2 = new JLabel();
        p.add(l2);

        JLabel l33 = new JLabel("user name");
        p.add(l33);

        JLabel l3 = new JLabel();
        p.add(l3);

        JLabel l44 = new JLabel("user home");
        p.add(l44);

        JLabel l4 = new JLabel();
        p.add(l4);

        JLabel l55 = new JLabel("java .class path");
        p.add(l55);

        JLabel l5 = new JLabel();
        p.add(l5);

        JLabel l66 = new JLabel("user id");
        p.add(l66);

        JLabel l6 = new JLabel();
        p.add(l6);

        JButton exit = new JButton("Exit");
        p.add(exit);

        assc = new JButton("ASciCode");
        p.add(assc);

        JButton uni = new JButton("UniCoade");
        p.add(uni);

        ass = new JTextField();
        p.add(ass);

        un = new JTextField();
        p.add(un);

        show = new JTextArea();
        p.add(show);

        JButton encre = new JButton("Encreption");
        p.add(encre);

        JButton discr = new JButton("Discription");
        p.add(discr);

        JTextField enadis = new JTextField();
        p.add(enadis);

        sho = new JLabel();
        p.add(sho);

        this.setVisible(true);
        this.setTitle("iam new form");
        this.setSize(800, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        p.setBounds(0, 0, 800, 700);
        p.setBackground(Color.gray);
        p.setLayout(null);

        l11.setBounds(5, 450, 80, 30);
        l22.setBounds(5, 480, 80, 30);
        l33.setBounds(5, 510, 80, 30);
        l44.setBounds(5, 540, 80, 30);
        l55.setBounds(5, 570, 80, 30);
        l66.setBounds(5, 600, 80, 30);

        l1.setText(System.getProperty("os.name"));
        l1.setBounds(90, 450, 80, 30);

        l2.setText(System.getProperty("os.version"));
        l2.setBounds(90, 480, 80, 30);

        l3.setText(System.getProperty("user.name"));
        l3.setBounds(90, 510, 80, 30);

        l4.setText(System.getProperty("user.home"));
        l4.setBounds(90, 540, 80, 30);

        l5.setText(System.getProperty("java.class.path"));
        l5.setBounds(90, 570, 400, 30);

        l6.setText(System.getProperty("user.dir"));
        l6.setBounds(90, 600, 400, 30);

        exit.setBounds(650, 20, 70, 30);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        assc.setBounds(380, 250, 90, 30);
        assc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String input = ass.getText();

                int lenth = input.length();

                char currenCharc;
                int asccicod;

                show.setText(null);

                for (int x = 0; x < lenth; x++) {

                    currenCharc = input.charAt(x);

                }

            }
        });

        uni.setBounds(380, 290, 90, 30);
        uni.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                char unicod = (char) (Integer.parseInt(un.getText()));

                sho.setText("" + unicod);

            }
        });

        ass.setBounds(475, 250, 130, 30);

        un.setBounds(475, 290, 90, 30);

        show.setBounds(10, 170, 300, 280);

        encre.setBounds(380, 330, 90, 30);
        discr.setBounds(470, 330, 90, 30);

        enadis.setBounds(560, 330, 130, 30);

        sho.setBounds(600, 200, 200, 200);

    }

    public static void main(String[] args) {
        new  OsFileInformation();
    }
}
