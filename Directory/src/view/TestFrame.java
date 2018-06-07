package view;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

import model.Question;
import model.Test;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TestFrame extends JFrame {
	private JTextField answTextField1;
	private JTextField answTextField2;
	private JTextField answTextField_3;
	private JTextField answTextField_4;
	private JTextField answTextField_5;
	private JTextField answTextField_6;
	private JTextField answTextField_7;
	private JTextField answTextField_8;
	private JTextField answTextField_9;
	private JTextField answTextField_10;
	private JTextField answTextField_11;
	private JTextField answTextField_12;
	private JPanel testPanel_1;
	private JLabel themesLabel_1;
	private JLabel themeLabel_1;
	private JLabel nameQuestLabel_1;
	private JLabel answLabel_1;
	private JTextArea textQuestTextArea_1;
	private JButton backButton_1;
	private JButton enterButton_1;
	private JButton nextButton_1;
	private JPanel testPanel_2;
	private JLabel themesLabel_2;
	private JLabel themeLabel_2;
	private JLabel nameQuestLabel_2;
	private JTextArea textQuestTextArea_2;
	private JLabel answLabel_2;
	private JButton enterButton_2;
	private JButton backButton_2;
	private JButton nextButton_2;
	private JPanel testPanel_3;
	private JLabel themesLabel_3;
	private JLabel themeLabel_3;
	private JLabel nameQuestLabel_3;
	private JTextArea textQuestTextArea_3;
	private JLabel answLabel_3;
	private JButton enterButton_3;
	private JButton backButton_3;
	private JButton nextButton_3;
	private JPanel testPanel_4;
	private JLabel themesLabel_4;
	private JLabel themeLabel_4;
	private JLabel nameQuestLabel_4;
	private JTextArea textQuestTextArea_4;
	private JButton enterButton_4;
	private JButton backButton_4;
	private JButton nextButton_4;
	private JPanel testPanel_5;
	private JLabel themesLabel_5;
	private JLabel themeLabel_5;
	private JLabel nameQuestLabel_5;
	private JTextArea textQuestTextArea_5;
	private JLabel answLabel_5;
	private JButton enterButton_5;
	private JButton backButton_5;
	private JButton nextButton_5;
	private JPanel testPanel_6;
	private JLabel themesLabel_6;
	private JLabel themeLabel_6;
	private JLabel nameQuestLabel_6;
	private JTextArea textQuestTextArea_6;
	private JLabel answLabel_6;
	private JButton enterButton_6;
	private JButton backButton_6;
	private JButton nextButton_6;
	private JPanel testPanel_7;
	private JLabel themesLabel_7;
	private JLabel themeLabel_7;
	private JLabel nameQuestLabel_7;
	private JTextArea textQuestTextArea_7;
	private JLabel answLabel_7;
	private JButton enterButton_7;
	private JButton backButton_7;
	private JButton nextButton_7;
	private JPanel testPanel_8;
	private JLabel themesLabel_8;
	private JLabel themeLabel_8;
	private JLabel nameQuestLabel_8;
	private JTextArea textQuestTextArea_8;
	private JLabel answLabel_8;
	private JButton enterButton_8;
	private JButton backButton_8;
	private JButton nextButton_8;
	private JPanel testPanel_9;
	private JLabel themesLabel_9;
	private JLabel themeLabel_9;
	private JLabel nameQuestLabel_9;
	private JTextArea textQuestTextArea_9;
	private JLabel answLabel_9;
	private JButton enterButton_9;
	private JButton backButton_9;
	private JButton nextButton_9;
	private JPanel testPanel_10;
	private JLabel themesLabel_10;
	private JLabel themeLabel_10;
	private JLabel nameQuestLabel_10;
	private JTextArea textQuestTextArea_10;
	private JLabel answLabel_10;
	private JButton enterButton_10;
	private JButton backButton_10;
	private JButton nextButton_10;
	private JPanel testPanel_11;
	private JLabel themesLabel_11;
	private JLabel themeLabel_11;
	private JLabel nameQuestLabel_11;
	private JTextArea textQuestTextArea_11;
	private JLabel answLabel_11;
	private JButton enterButton_11;
	private JButton backButton_11;
	private JButton nextButton_11;
	private JPanel testPanel_12;
	private JLabel themesLabel_12;
	private JLabel themeLabel_12;
	private JLabel nameQuestLabel_12;
	private JTextArea textQuestTextArea_12;
	private JLabel answLabel_12;
	private JButton enterButton_12;
	private JButton backButton_12;
	private JButton nextButton_12;

	MainFrame mainFrame;

	public TestFrame(Test[] tests, MainFrame mainFrame) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent event) {
				TestFrame.this.mainFrame = mainFrame;
				if (tests != null) {
					// поля класса
					// StringBuilder totalNameTest = new StringBuilder();
					// Question[] totalQuestions = new Question[];
					// Test totalTest = new Test(, questions);
					Question[] questions = tests[0].getQuestions();
					themesLabel_1.setText(themesLabel_1.getText() + tests[0].getName() + ", ");
					themeLabel_1.setText(tests[0].getName());
					nameQuestLabel_1.setText(questions[0].getName());
					textQuestTextArea_1.setText(questions[0].getText());
					nameQuestLabel_2.setText(questions[1].getName());
					textQuestTextArea_2.setText(questions[1].getText());
				}
			}
		});
		getContentPane().setEnabled(false);
		setBounds(100, 100, 839, 373);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane);

		testPanel_1 = new JPanel();
		testPanel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_1, null);

		themesLabel_1 = new JLabel();
		themesLabel_1.setToolTipText("");
		themesLabel_1.setText("Тест по следующим темам:");

		themeLabel_1 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_1 = new JLabel("New label");

		answLabel_1 = new JLabel("Введите ответ:");

		answTextField1 = new JTextField();
		answTextField1.setColumns(10);

		enterButton_1 = new JButton("Ввод");
		enterButton_1.addActionListener(new ActionListener() {
?ХМ?
			public void actionPerformed(ActionEvent event) {
				Question[] questions = tests[0].getQuestions();
				String message;
				if (questions[0].getCorrectAnswer().equals(answTextField1.getText())) {
					message = "Yep!";
				} else {
					message = "Nope!";
				}
				JOptionPane.showMessageDialog(null, message, "Total", JOptionPane.PLAIN_MESSAGE);
			}
		});

		backButton_1 = new JButton("Назад");
		backButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
				mainFrame.setVisible(true);
			}
		});

		nextButton_1 = new JButton("Вперед");

		textQuestTextArea_1 = new JTextArea();
		textQuestTextArea_1.setWrapStyleWord(true);
		textQuestTextArea_1.setLineWrap(true);
		textQuestTextArea_1.setEditable(false);
		textQuestTextArea_1.setBackground(Color.ORANGE);
		GroupLayout gl_testPanel_1 = new GroupLayout(testPanel_1);
		gl_testPanel_1.setHorizontalGroup(gl_testPanel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_1
				.createSequentialGroup().addGap(15)
				.addGroup(gl_testPanel_1.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_1
						.createSequentialGroup()
						.addGroup(gl_testPanel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(textQuestTextArea_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_testPanel_1.createSequentialGroup()
										.addComponent(answLabel_1, GroupLayout.PREFERRED_SIZE, 80,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(answTextField1, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
										.addGap(18)
										.addComponent(enterButton_1, GroupLayout.PREFERRED_SIZE, 96,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(backButton_1, GroupLayout.PREFERRED_SIZE, 105,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(nextButton_1,
												GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
						.addGap(120))
						.addGroup(gl_testPanel_1.createSequentialGroup().addGap(12)
								.addGroup(gl_testPanel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(themesLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 781,
												Short.MAX_VALUE)
										.addComponent(themeLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 781,
												Short.MAX_VALUE)
										.addComponent(nameQuestLabel_1, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
								.addContainerGap()))));
		gl_testPanel_1.setVerticalGroup(gl_testPanel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_testPanel_1.createSequentialGroup().addGap(20)
						.addComponent(themesLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_1)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nameQuestLabel_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textQuestTextArea_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_testPanel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(answLabel_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(answTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(enterButton_1).addComponent(backButton_1).addComponent(nextButton_1))
						.addGap(53)));
		testPanel_1.setLayout(gl_testPanel_1);

		testPanel_2 = new JPanel();
		testPanel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_2, null);

		themesLabel_2 = new JLabel();
		themesLabel_2.setToolTipText("");
		themesLabel_2.setText("Тест по следующим темам:");

		themeLabel_2 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_2 = new JLabel("New label");

		textQuestTextArea_2 = new JTextArea();
		textQuestTextArea_2.setWrapStyleWord(true);
		textQuestTextArea_2.setLineWrap(true);
		textQuestTextArea_2.setEditable(false);
		textQuestTextArea_2.setBackground(Color.WHITE);

		answLabel_2 = new JLabel("Введите ответ:");

		answTextField2 = new JTextField();
		answTextField2.setColumns(10);

		enterButton_2 = new JButton("Ввод");

		backButton_2 = new JButton("Назад");

		nextButton_2 = new JButton("Вперед");
		GroupLayout gl_testPanel_2 = new GroupLayout(testPanel_2);
		gl_testPanel_2.setHorizontalGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_2
				.createSequentialGroup()
				.addGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_2
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_2, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_2, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_2, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_2.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_2, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_2.createSequentialGroup()
														.addComponent(answLabel_2, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField2).addGap(18)
														.addComponent(enterButton_2, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_2, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_2, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_2.setVerticalGroup(gl_testPanel_2.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_2
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_2)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_2.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_2.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_2)
										.addComponent(answTextField2, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_2.setLayout(gl_testPanel_2);

		testPanel_3 = new JPanel();
		testPanel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_3, null);

		themesLabel_3 = new JLabel();
		themesLabel_3.setToolTipText("");
		themesLabel_3.setText("Тест по следующим темам:");

		themeLabel_3 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_3 = new JLabel("New label");

		textQuestTextArea_3 = new JTextArea();
		textQuestTextArea_3.setWrapStyleWord(true);
		textQuestTextArea_3.setLineWrap(true);
		textQuestTextArea_3.setEditable(false);
		textQuestTextArea_3.setBackground(Color.WHITE);

		answLabel_3 = new JLabel("Введите ответ:");

		answTextField_3 = new JTextField();
		answTextField_3.setColumns(10);

		enterButton_3 = new JButton("Ввод");

		backButton_3 = new JButton("Назад");

		nextButton_3 = new JButton("Вперед");
		GroupLayout gl_testPanel_3 = new GroupLayout(testPanel_3);
		gl_testPanel_3.setHorizontalGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_3
				.createSequentialGroup()
				.addGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_3
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_3, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_3, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_3, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_3.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_3, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_3.createSequentialGroup()
														.addComponent(answLabel_3, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_3).addGap(18)
														.addComponent(enterButton_3, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_3, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_3, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_3.setVerticalGroup(gl_testPanel_3.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_3
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_3)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_3, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_3.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_3.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_3)
										.addComponent(answTextField_3, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_3.setLayout(gl_testPanel_3);

		testPanel_4 = new JPanel();
		testPanel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_4, null);

		themesLabel_4 = new JLabel();
		themesLabel_4.setToolTipText("");
		themesLabel_4.setText("Тест по следующим темам:");

		themeLabel_4 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_4 = new JLabel("New label");

		textQuestTextArea_4 = new JTextArea();
		textQuestTextArea_4.setWrapStyleWord(true);
		textQuestTextArea_4.setLineWrap(true);
		textQuestTextArea_4.setEditable(false);
		textQuestTextArea_4.setBackground(Color.WHITE);

		JLabel answLabel_4 = new JLabel("Введите ответ:");

		answTextField_4 = new JTextField();
		answTextField_4.setColumns(10);

		enterButton_4 = new JButton("Ввод");

		backButton_4 = new JButton("Назад");

		nextButton_4 = new JButton("Вперед");
		GroupLayout gl_testPanel_4 = new GroupLayout(testPanel_4);
		gl_testPanel_4.setHorizontalGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_4
				.createSequentialGroup()
				.addGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_4
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_4, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_4, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_4, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_4.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_4, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_4.createSequentialGroup()
														.addComponent(answLabel_4, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_4).addGap(18)
														.addComponent(enterButton_4, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_4, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_4, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_4.setVerticalGroup(gl_testPanel_4.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_4
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_4)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_4, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_4.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_4.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_4)
										.addComponent(answTextField_4, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_4.setLayout(gl_testPanel_4);

		testPanel_5 = new JPanel();
		testPanel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_5, null);

		themesLabel_5 = new JLabel();
		themesLabel_5.setToolTipText("");
		themesLabel_5.setText("Тест по следующим темам:");

		themeLabel_5 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_5 = new JLabel("New label");

		textQuestTextArea_5 = new JTextArea();
		textQuestTextArea_5.setWrapStyleWord(true);
		textQuestTextArea_5.setLineWrap(true);
		textQuestTextArea_5.setEditable(false);
		textQuestTextArea_5.setBackground(Color.WHITE);

		answLabel_5 = new JLabel("Введите ответ:");

		answTextField_5 = new JTextField();
		answTextField_5.setColumns(10);

		enterButton_5 = new JButton("Ввод");

		backButton_5 = new JButton("Назад");

		nextButton_5 = new JButton("Вперед");
		GroupLayout gl_testPanel_5 = new GroupLayout(testPanel_5);
		gl_testPanel_5.setHorizontalGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_5
				.createSequentialGroup()
				.addGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_5
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_5, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_5, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_5, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_5.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_5, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_5.createSequentialGroup()
														.addComponent(answLabel_5, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_5).addGap(18)
														.addComponent(enterButton_5, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_5, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_5, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_5.setVerticalGroup(gl_testPanel_5.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_5
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_5)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_5, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_5.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_5.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_5)
										.addComponent(answTextField_5, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_5.setLayout(gl_testPanel_5);

		testPanel_6 = new JPanel();
		testPanel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_6, null);

		themesLabel_6 = new JLabel();
		themesLabel_6.setToolTipText("");
		themesLabel_6.setText("Тест по следующим темам:");

		themeLabel_6 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_6 = new JLabel("New label");

		textQuestTextArea_6 = new JTextArea();
		textQuestTextArea_6.setWrapStyleWord(true);
		textQuestTextArea_6.setLineWrap(true);
		textQuestTextArea_6.setEditable(false);
		textQuestTextArea_6.setBackground(Color.WHITE);

		answLabel_6 = new JLabel("Введите ответ:");

		answTextField_6 = new JTextField();
		answTextField_6.setColumns(10);

		enterButton_6 = new JButton("Ввод");

		backButton_6 = new JButton("Назад");

		nextButton_6 = new JButton("Вперед");
		GroupLayout gl_testPanel_6 = new GroupLayout(testPanel_6);
		gl_testPanel_6.setHorizontalGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_6
				.createSequentialGroup()
				.addGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_6
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_6, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_6, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_6, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_6.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_6, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_6.createSequentialGroup()
														.addComponent(answLabel_6, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_6).addGap(18)
														.addComponent(enterButton_6, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_6, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_6, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_6.setVerticalGroup(gl_testPanel_6.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_6
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_6)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_6, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_6.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_6.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_6)
										.addComponent(answTextField_6, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_6.setLayout(gl_testPanel_6);

		testPanel_7 = new JPanel();
		testPanel_7.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_7, null);

		themesLabel_7 = new JLabel();
		themesLabel_7.setToolTipText("");
		themesLabel_7.setText("Тест по следующим темам:");

		themeLabel_7 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_7 = new JLabel("New label");

		textQuestTextArea_7 = new JTextArea();
		textQuestTextArea_7.setWrapStyleWord(true);
		textQuestTextArea_7.setLineWrap(true);
		textQuestTextArea_7.setEditable(false);
		textQuestTextArea_7.setBackground(Color.WHITE);

		answLabel_7 = new JLabel("Введите ответ:");

		answTextField_7 = new JTextField();
		answTextField_7.setColumns(10);

		enterButton_7 = new JButton("Ввод");

		backButton_7 = new JButton("Назад");

		nextButton_7 = new JButton("Вперед");
		GroupLayout gl_testPanel_7 = new GroupLayout(testPanel_7);
		gl_testPanel_7.setHorizontalGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_7
				.createSequentialGroup()
				.addGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_7
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_7, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_7, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_7, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_7.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_7, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_7.createSequentialGroup()
														.addComponent(answLabel_7, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_7).addGap(18)
														.addComponent(enterButton_7, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_7, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_7, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_7.setVerticalGroup(gl_testPanel_7.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_7
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_7)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_7, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_7.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_7.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_7)
										.addComponent(answTextField_7, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_7.setLayout(gl_testPanel_7);

		testPanel_8 = new JPanel();
		testPanel_8.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_8, null);

		themesLabel_8 = new JLabel();
		themesLabel_8.setToolTipText("");
		themesLabel_8.setText("Тест по следующим темам:");

		themeLabel_8 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_8 = new JLabel("New label");

		textQuestTextArea_8 = new JTextArea();
		textQuestTextArea_8.setWrapStyleWord(true);
		textQuestTextArea_8.setLineWrap(true);
		textQuestTextArea_8.setEditable(false);
		textQuestTextArea_8.setBackground(Color.WHITE);

		answLabel_8 = new JLabel("Введите ответ:");

		answTextField_8 = new JTextField();
		answTextField_8.setColumns(10);

		enterButton_8 = new JButton("Ввод");

		backButton_8 = new JButton("Назад");

		nextButton_8 = new JButton("Вперед");
		GroupLayout gl_testPanel_8 = new GroupLayout(testPanel_8);
		gl_testPanel_8.setHorizontalGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_8
				.createSequentialGroup()
				.addGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_8
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_8, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_8, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_8, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_8.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_8, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_8.createSequentialGroup()
														.addComponent(answLabel_8, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_8).addGap(18)
														.addComponent(enterButton_8, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_8, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_8, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_8.setVerticalGroup(gl_testPanel_8.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_8
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_8)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_8, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_8.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_8.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_8)
										.addComponent(answTextField_8, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_8.setLayout(gl_testPanel_8);

		testPanel_9 = new JPanel();
		testPanel_9.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_9, null);

		themesLabel_9 = new JLabel();
		themesLabel_9.setToolTipText("");
		themesLabel_9.setText("Тест по следующим темам:");

		themeLabel_9 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_9 = new JLabel("New label");

		textQuestTextArea_9 = new JTextArea();
		textQuestTextArea_9.setWrapStyleWord(true);
		textQuestTextArea_9.setLineWrap(true);
		textQuestTextArea_9.setEditable(false);
		textQuestTextArea_9.setBackground(Color.WHITE);

		answLabel_9 = new JLabel("Введите ответ:");

		answTextField_9 = new JTextField();
		answTextField_9.setColumns(10);

		enterButton_9 = new JButton("Ввод");

		backButton_9 = new JButton("Назад");

		nextButton_9 = new JButton("Вперед");
		GroupLayout gl_testPanel_9 = new GroupLayout(testPanel_9);
		gl_testPanel_9.setHorizontalGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING).addGroup(gl_testPanel_9
				.createSequentialGroup()
				.addGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING, false).addGroup(gl_testPanel_9
						.createSequentialGroup().addGap(19)
						.addGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(themesLabel_9, GroupLayout.PREFERRED_SIZE, 528,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(themeLabel_9, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
								.addComponent(nameQuestLabel_9, GroupLayout.PREFERRED_SIZE, 78,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								gl_testPanel_9.createSequentialGroup().addGap(19)
										.addGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING)
												.addComponent(textQuestTextArea_9, GroupLayout.PREFERRED_SIZE, 695,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_testPanel_9.createSequentialGroup()
														.addComponent(answLabel_9, GroupLayout.PREFERRED_SIZE, 80,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(answTextField_9).addGap(18)
														.addComponent(enterButton_9, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(backButton_9, GroupLayout.PREFERRED_SIZE, 105,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(nextButton_9, GroupLayout.PREFERRED_SIZE, 100,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))))
				.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_9.setVerticalGroup(gl_testPanel_9.createParallelGroup(Alignment.TRAILING).addGroup(gl_testPanel_9
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(themesLabel_9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_9)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(nameQuestLabel_9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textQuestTextArea_9, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(answLabel_9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_testPanel_9.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_testPanel_9.createParallelGroup(Alignment.BASELINE)
										.addComponent(backButton_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(enterButton_9)
										.addComponent(answTextField_9, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(nextButton_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
				.addGap(232)));
		testPanel_9.setLayout(gl_testPanel_9);

		testPanel_10 = new JPanel();
		testPanel_10.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_10, null);

		themesLabel_10 = new JLabel();
		themesLabel_10.setToolTipText("");
		themesLabel_10.setText("Тест по следующим темам:");

		themeLabel_10 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_10 = new JLabel("New label");

		textQuestTextArea_10 = new JTextArea();
		textQuestTextArea_10.setWrapStyleWord(true);
		textQuestTextArea_10.setLineWrap(true);
		textQuestTextArea_10.setEditable(false);
		textQuestTextArea_10.setBackground(Color.WHITE);

		answLabel_10 = new JLabel("Введите ответ:");

		answTextField_10 = new JTextField();
		answTextField_10.setColumns(10);

		enterButton_10 = new JButton("Ввод");

		backButton_10 = new JButton("Назад");

		nextButton_10 = new JButton("Вперед");
		GroupLayout gl_testPanel_10 = new GroupLayout(testPanel_10);
		gl_testPanel_10.setHorizontalGroup(gl_testPanel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_testPanel_10.createSequentialGroup().addGroup(gl_testPanel_10
						.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_testPanel_10.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_10.createParallelGroup(Alignment.LEADING)
										.addComponent(themesLabel_10, GroupLayout.PREFERRED_SIZE, 528,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(themeLabel_10, GroupLayout.PREFERRED_SIZE, 542,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nameQuestLabel_10, GroupLayout.PREFERRED_SIZE, 78,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_testPanel_10.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_10.createParallelGroup(Alignment.LEADING)
										.addComponent(textQuestTextArea_10, GroupLayout.PREFERRED_SIZE, 695,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_testPanel_10.createSequentialGroup()
												.addComponent(answLabel_10, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(answTextField_10).addGap(18)
												.addComponent(enterButton_10, GroupLayout.PREFERRED_SIZE, 96,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(backButton_10, GroupLayout.PREFERRED_SIZE, 105,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(nextButton_10, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))))
						.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_10.setVerticalGroup(gl_testPanel_10.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_testPanel_10.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(themesLabel_10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_10)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nameQuestLabel_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textQuestTextArea_10, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_testPanel_10.createParallelGroup(Alignment.LEADING)
								.addComponent(answLabel_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_testPanel_10.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_testPanel_10.createParallelGroup(Alignment.BASELINE)
												.addComponent(backButton_10, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(enterButton_10)
												.addComponent(answTextField_10, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(nextButton_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGap(232)));
		testPanel_10.setLayout(gl_testPanel_10);

		testPanel_11 = new JPanel();
		testPanel_11.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_11, null);

		themesLabel_11 = new JLabel();
		themesLabel_11.setToolTipText("");
		themesLabel_11.setText("Тест по следующим темам:");

		themeLabel_11 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_11 = new JLabel("New label");

		textQuestTextArea_11 = new JTextArea();
		textQuestTextArea_11.setWrapStyleWord(true);
		textQuestTextArea_11.setLineWrap(true);
		textQuestTextArea_11.setEditable(false);
		textQuestTextArea_11.setBackground(Color.WHITE);

		answLabel_11 = new JLabel("Введите ответ:");

		answTextField_11 = new JTextField();
		answTextField_11.setColumns(10);

		enterButton_11 = new JButton("Ввод");

		backButton_11 = new JButton("Назад");

		nextButton_11 = new JButton("Вперед");
		GroupLayout gl_testPanel_11 = new GroupLayout(testPanel_11);
		gl_testPanel_11.setHorizontalGroup(gl_testPanel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_testPanel_11.createSequentialGroup().addGroup(gl_testPanel_11
						.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_testPanel_11.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_11.createParallelGroup(Alignment.LEADING)
										.addComponent(themesLabel_11, GroupLayout.PREFERRED_SIZE, 528,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(themeLabel_11, GroupLayout.PREFERRED_SIZE, 542,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nameQuestLabel_11, GroupLayout.PREFERRED_SIZE, 78,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_testPanel_11.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_11.createParallelGroup(Alignment.LEADING)
										.addComponent(textQuestTextArea_11, GroupLayout.PREFERRED_SIZE, 695,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_testPanel_11.createSequentialGroup()
												.addComponent(answLabel_11, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(answTextField_11).addGap(18)
												.addComponent(enterButton_11, GroupLayout.PREFERRED_SIZE, 96,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(backButton_11, GroupLayout.PREFERRED_SIZE, 105,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(nextButton_11, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))))
						.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_11.setVerticalGroup(gl_testPanel_11.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_testPanel_11.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(themesLabel_11, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_11)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nameQuestLabel_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textQuestTextArea_11, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_testPanel_11.createParallelGroup(Alignment.LEADING)
								.addComponent(answLabel_11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_testPanel_11.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_testPanel_11.createParallelGroup(Alignment.BASELINE)
												.addComponent(backButton_11, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(enterButton_11)
												.addComponent(answTextField_11, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(nextButton_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGap(232)));
		testPanel_11.setLayout(gl_testPanel_11);

		testPanel_12 = new JPanel();
		testPanel_12.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, testPanel_12, null);

		themesLabel_12 = new JLabel();
		themesLabel_12.setToolTipText("");
		themesLabel_12.setText("Тест по следующим темам:");

		themeLabel_12 = new JLabel("За себя и за Сашку?");

		nameQuestLabel_12 = new JLabel("New label");

		textQuestTextArea_12 = new JTextArea();
		textQuestTextArea_12.setWrapStyleWord(true);
		textQuestTextArea_12.setLineWrap(true);
		textQuestTextArea_12.setEditable(false);
		textQuestTextArea_12.setBackground(Color.WHITE);

		answLabel_12 = new JLabel("Введите ответ:");

		answTextField_12 = new JTextField();
		answTextField_12.setColumns(10);

		enterButton_12 = new JButton("Ввод");

		backButton_12 = new JButton("Назад");

		nextButton_12 = new JButton("Вперед");
		GroupLayout gl_testPanel_12 = new GroupLayout(testPanel_12);
		gl_testPanel_12.setHorizontalGroup(gl_testPanel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_testPanel_12.createSequentialGroup().addGroup(gl_testPanel_12
						.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_testPanel_12.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_12.createParallelGroup(Alignment.LEADING)
										.addComponent(themesLabel_12, GroupLayout.PREFERRED_SIZE, 528,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(themeLabel_12, GroupLayout.PREFERRED_SIZE, 542,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nameQuestLabel_12, GroupLayout.PREFERRED_SIZE, 78,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_testPanel_12.createSequentialGroup().addGap(19)
								.addGroup(gl_testPanel_12.createParallelGroup(Alignment.LEADING)
										.addComponent(textQuestTextArea_12, GroupLayout.PREFERRED_SIZE, 695,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_testPanel_12.createSequentialGroup()
												.addComponent(answLabel_12, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(answTextField_12).addGap(18)
												.addComponent(enterButton_12, GroupLayout.PREFERRED_SIZE, 96,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(backButton_12, GroupLayout.PREFERRED_SIZE, 105,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(nextButton_12, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))))
						.addContainerGap(32, Short.MAX_VALUE)));
		gl_testPanel_12.setVerticalGroup(gl_testPanel_12.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_testPanel_12.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(themesLabel_12, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(themeLabel_12)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nameQuestLabel_12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textQuestTextArea_12, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_testPanel_12.createParallelGroup(Alignment.LEADING)
								.addComponent(answLabel_12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_testPanel_12.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_testPanel_12.createParallelGroup(Alignment.BASELINE)
												.addComponent(backButton_12, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(enterButton_12)
												.addComponent(answTextField_12, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(nextButton_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addGap(232)));
		testPanel_12.setLayout(gl_testPanel_12);

	}
}