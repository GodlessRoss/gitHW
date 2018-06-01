package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;

public class TestFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame window = new TestFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 616, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 121, 574, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("Тест по следующим темам:");
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setBounds(10, 58, 574, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 176, 574, 122);
		frame.getContentPane().add(textArea);
		
		JButton button = new JButton("Назад");
		button.setBounds(21, 341, 108, 34);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Вперед");
		button_1.setBounds(484, 341, 100, 34);
		frame.getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setBounds(229, 341, 135, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Введите ответ:");
		label.setBounds(139, 341, 80, 34);
		frame.getContentPane().add(label);
		
		JButton button_2 = new JButton("Ввод");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(374, 341, 100, 34);
		frame.getContentPane().add(button_2);
	}

}
