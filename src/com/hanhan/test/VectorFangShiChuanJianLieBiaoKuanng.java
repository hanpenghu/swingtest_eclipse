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
		String []s={"����","�ձ�","���ô�","������","쳼�","�Ĵ�����","���е�","������","�ڿ���"};
		Vector<String> v=new Vector<String>();
		v.addElement("Nokia 3310");
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8260");
		v.addElement("motorola v8088");
		v.addElement("NEC DB2100");
		JList<Object> l1=new JList<Object>(s);
		JList<Object> l2=new JList<Object>(v);
		l1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		l2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		l1.setBorder(BorderFactory.createTitledBorder("����ϲ���Ǹ�����"));
		l2.setBorder(BorderFactory.createTitledBorder("����ϲ���Ŀ��ֻ�"));
		contentPane.add(new JScrollPane(l1));
		contentPane.add(new JScrollPane(l2));
		f.setSize(300, 100);
		f.setDefaultCloseOperation(3);//�رս���������3
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new VectorFangShiChuanJianLieBiaoKuanng().f();

	}

}
