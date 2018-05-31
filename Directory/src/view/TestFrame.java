package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestFrame extends JFrame {
	private JButton backButton = new JButton("Назад");

	public TestFrame() {
		super("Example");
		this.setBounds(500, 500, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(new GridLayout(1, 6, 2, 2));
		container.add(backButton);

		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainFrame newFrame = new MainFrame();
				newFrame.setVisible(true);
			}
		});
	}
}
