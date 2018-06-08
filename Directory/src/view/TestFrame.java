package view;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

import model.Question;
import model.Test;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.Helper;

public class TestFrame extends JFrame {

	MainFrame mainFrame;
	private JLabel themesLabel;
	private JLabel currentThemeLabel;
	private JLabel questionLabel;
	private JTextArea questionTextArea;
	private JTextField answerTextField;
	private JButton quest1Button;
	private JButton quest2Button;
	private JButton quest4Button;
	private JButton quest3Button;
	private JButton quest5Button;
	private JButton quest6Button;
	private JButton quest7Button;
	private JButton quest8Bbutton;
	private JButton quest9Button;
	private JButton quest10Button;
	private JButton quest11Button;
	private JButton quest12Button;
	private JButton enterButton;
	private JButton nextButton;
	private JButton backButton;

	private int counter = 0;
	private Test[] totalTests;
	private Question[] totalQuestions;
	// private JButton[] buttons = { quest1Button, quest2Button, quest3Button,
	// quest4Button, quest5Button, quest6Button,
	// quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button };

	public TestFrame(Test[] tests, MainFrame mainFrame) {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent event) {
				TestFrame.this.mainFrame = mainFrame;
				if (tests != null) {
					themesLabel.setText("Тест по темам: ");
					for (Test test : tests) {
						if (test != null) {
							themesLabel.setText(themesLabel.getText() + test.getName() + ", ");
						}
					}
					StringBuilder tempString = new StringBuilder();
					tempString.append(themesLabel.getText());
					tempString.replace(tempString.length() - 2, tempString.length() + 1, ".");
					themesLabel.setText(tempString.toString());
					tempString = null;

					totalTests = tests;
					totalQuestions = totalTests[0].getQuestions();
					currentThemeLabel.setText(totalTests[0].getName());
					questionLabel.setText(totalQuestions[0].getName());
					questionTextArea.setText(totalQuestions[0].getText());
					quest1Button.setBackground(Color.YELLOW);

				}
			}
		});
		getContentPane().setEnabled(false);

		themesLabel = new JLabel();
		themesLabel.setToolTipText("");
		themesLabel.setText("Выбранные темы\r\n");

		currentThemeLabel = new JLabel("Текущая тема");

		questionLabel = new JLabel("Текущее имя вопроса");

		JLabel justLabel = new JLabel("Введите ответ:");

		answerTextField = new JTextField();
		answerTextField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);

		enterButton = new JButton("Принять");

		quest1Button = new JButton("1");
		quest1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[0].getName());
				questionTextArea.setText(totalQuestions[0].getText());
				counter = 0;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);

			}
		});
		panel.add(quest1Button);

		quest2Button = new JButton("2");
		quest2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 1;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest2Button);

		quest3Button = new JButton("3");
		quest3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 2;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest3Button);

		quest4Button = new JButton("4");
		quest4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 3;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest4Button);

		quest5Button = new JButton("5");
		quest5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 4;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest5Button);

		quest6Button = new JButton("6");
		quest6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 5;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest6Button);

		quest7Button = new JButton("7");
		quest7Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 6;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest7Button);

		quest8Bbutton = new JButton("8");
		quest8Bbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 7;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest8Bbutton);

		quest9Button = new JButton("9");
		quest9Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 8;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest9Button);

		quest10Button = new JButton("10");
		quest10Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 9;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest10Button);

		quest11Button = new JButton("11");
		quest11Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 10;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest11Button);

		quest12Button = new JButton("12");
		quest12Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 11;
				currentThemeLabel.setText(totalTests[0].getName());
				questionLabel.setText(totalQuestions[counter].getName());
				questionTextArea.setText(totalQuestions[counter].getText());
				Helper.setColorButtons(counter, quest1Button, quest2Button, quest3Button, quest4Button, quest5Button,
						quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button, quest11Button,
						quest12Button);
			}
		});
		panel.add(quest12Button);

		JButton completeButton = new JButton("Закончить тест");
		completeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Программист Антон сказал, что реализует эту возможность к субботе, правда он не уточнил к какой..",
						"Недовольство Владимира!", JOptionPane.PLAIN_MESSAGE);
			}
		});
		panel.add(completeButton);

		nextButton = new JButton(">");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counter < 11) {
					int tempCounter = counter;
					currentThemeLabel.setText(totalTests[0].getName());
					questionLabel.setText(totalQuestions[++counter].getName());
					questionTextArea.setText(totalQuestions[counter].getText());
					Helper.setColorButtons(counter, tempCounter, quest1Button, quest2Button, quest3Button, quest4Button,
							quest5Button, quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button,
							quest11Button, quest12Button);
				}
			}
		});

		backButton = new JButton("<");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counter > 0) {
					int tempCounter = counter;
					currentThemeLabel.setText(totalTests[0].getName());
					questionLabel.setText(totalQuestions[--counter].getName());
					questionTextArea.setText(totalQuestions[counter].getText());
					Helper.setColorButtons(counter, tempCounter, quest1Button, quest2Button, quest3Button, quest4Button,
							quest5Button, quest6Button, quest7Button, quest8Bbutton, quest9Button, quest10Button,
							quest11Button, quest12Button);
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
								groupLayout
										.createSequentialGroup().addContainerGap()
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup().addGap(10).addGroup(groupLayout
										.createParallelGroup(Alignment.TRAILING)
										.addComponent(themesLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 746,
												Short.MAX_VALUE)
										.addComponent(currentThemeLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												746, Short.MAX_VALUE)
										.addComponent(
												questionLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 746,
												Short.MAX_VALUE)
										.addGroup(Alignment.LEADING,
												groupLayout.createSequentialGroup().addComponent(justLabel).addGap(18)
														.addComponent(answerTextField, GroupLayout.DEFAULT_SIZE, 175,
																Short.MAX_VALUE)
														.addGap(18)
														.addComponent(enterButton, GroupLayout.PREFERRED_SIZE, 86,
																GroupLayout.PREFERRED_SIZE)
														.addGap(245)
														.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 57,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(nextButton, GroupLayout.PREFERRED_SIZE, 57,
																GroupLayout.PREFERRED_SIZE))
										.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 746,
												Short.MAX_VALUE))))
						.addGap(31)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(11)
						.addComponent(themesLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE).addGap(6)
						.addComponent(currentThemeLabel).addGap(6)
						.addComponent(questionLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE).addGap(11)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(justLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup().addGap(1)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(answerTextField, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(enterButton)))
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(nextButton)
										.addComponent(backButton)))
						.addGap(7).addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)));

		questionTextArea = new JTextArea();
		scrollPane.setViewportView(questionTextArea);
		questionTextArea.setText("Текст текущего вопроса\r\n");
		questionTextArea.setWrapStyleWord(true);
		questionTextArea.setLineWrap(true);
		questionTextArea.setEditable(false);
		questionTextArea.setBackground(SystemColor.text);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 803, 402);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}