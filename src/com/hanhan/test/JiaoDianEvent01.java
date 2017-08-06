package com.hanhan.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.List;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class JiaoDianEvent01 extends JFrame implements FocusListener {

    List info = new List(10);
    JTextField tf = new JTextField("");
    JButton button = new JButton("确认");

    public JiaoDianEvent01(String title) {
        super(title);
        add(info, "North");
        add(tf, "Center");
        add(button, "South");
        tf.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.isTemporary()) {
           
                info.add("暂时性获得--zanShiXingHuoDe");
          
        } else {
        
                info.add("长久性获得--zanShiXingHuoDe");
       
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.isTemporary()) {
            info.add("暂时性失去---zanShiXingShiQu");
        } else {
            info.add("长久性失去---changJiuXingShiqu");
        }

    }

    public static void main(String[] args) {
        JiaoDianEvent01 de = new JiaoDianEvent01("测试窗口");
        de.setSize(500, 400);
        de.setDefaultCloseOperation(EXIT_ON_CLOSE);
//          de.pack();//设置大小为自适应
        de.setVisible(true);
    }

}

