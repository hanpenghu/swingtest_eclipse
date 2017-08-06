package com.hanhan.test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ShiYongShuZuDeFangShiChuanJianLieBiaoKuang {

	public void f(){
		JFrame f=new JFrame("测试窗口");
		f.setSize(400,300);
		f.setLocation(300, 300);
		f.setDefaultCloseOperation(3);//3是EXIT_ON_CLOSE
		JPanel p=new JPanel();
		f.setContentPane(p);
		p.setLayout(new BorderLayout());
		String[]name={"韩寒","韩韩","憨憨","喊喊","hanhan"};
		JList l=new JList(name);
		JTextField tf =new JTextField();
		p.add(l,"North");
		p.add(tf,"South");
		//监听JList,当其中一个被选中的时候,就在JTextField中显示这个选中的
		l.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				tf.setText((String)((JList)(e.getSource())).getSelectedValue());
			}
			
		});
		f.setVisible(true);

	}
	
	
	public static void main(String[]args){
		
	  new ShiYongShuZuDeFangShiChuanJianLieBiaoKuang().f();
	}
	
	
	
	
	
	
	
	
	

}
