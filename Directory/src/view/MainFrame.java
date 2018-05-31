package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private JButton testButton = new JButton("Тест");
	private JButton almancButtin1 = new JButton("Альманах");
	private JButton buttin3 = new JButton("Войти администратору");
	private JButton buttin2 = new JButton("Выйти");
	
	
	public  MainFrame () {
		super("Simpel Example");
		this.setBounds(500,500,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container =  this.getContentPane();
		container.setLayout(new GridLayout(1,6,2,2));
		container.add(testButton);
		container.add(almancButtin1);
		container.add(buttin3);
		container.add(buttin2);
		
		almancButtin1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Тело метода
				
			}
		});
	}
	
	
	

}
