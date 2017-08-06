package com.hanhan.test;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class VectorFangShiChuanJianLieBiaoKuanng {

	public void f() {
		JFrame f=new JFrame("Test Vctor JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new GridLayout(1,3));
		String []s={"美国","日本","加拿大","新西兰","斐济","澳大利亚","大不列颠","爱尔兰","乌克兰"};
		Vector v=new Vector();
		v.addElement("Nokia 3310");
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8260");
		v.addElement("motorola v8088");
		v.addElement("NEC DB2100");
		JList l1=new JList(s);
		JList l2=new JList(v);
		l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		l2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		l1.setBorder(BorderFactory.createTitledBorder("你最喜欢那个国家"));
		l2.setBorder(BorderFactory.createTitledBorder("你最喜欢哪款手机"));
		contentPane.add(new JScrollPane(l1));
		contentPane.add(new JScrollPane(l2));
		f.setSize(300, 100);
		f.setDefaultCloseOperation(3);//关闭结束程序用3
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new VectorFangShiChuanJianLieBiaoKuanng().f();

	}

}
