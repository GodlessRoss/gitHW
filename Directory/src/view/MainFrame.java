package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private JButton buttin = new JButton("Тест");
	private JButton buttin1 = new JButton("Альманах");
	private JButton buttin3 = new JButton("Войти администратору");
	private JButton buttin2 = new JButton("Выйти");
	
	
	public  MainFrame () {
		super("Simpel Example");
		this.setBounds(500,500,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container =  this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));//
		container.add(buttin);
		container.add(buttin1);
		container.add(buttin3);
		container.add(buttin2);
		buttin.addActionListener(new ButtonEventListener());
	}
	
	class ButtonEventListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	
	

}
