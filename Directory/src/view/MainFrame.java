package view;

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import controller.Helper;
import model.Test;

public class MainFrame extends JFrame {

	private JTree themeTree;
	private JTextArea themeTextArea;
	private JScrollBar treeScrollBar;
	private JButton addTestButton;
	private JButton runTestButton;
	private JScrollPane themeScrollPane;
	private JSeparator separator;
	private JScrollPane scrollPaneTree;

	private int counter = 1;
	private JLabel lblNewLabel;
	private JScrollPane addTestScrollPane;
	private JButton btnX;
	private JTextArea addTestTextArea;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 748, 404);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		scrollPaneTree = new JScrollPane();
		scrollPaneTree.setBounds(0, 0, 500, 300);
		getContentPane().add(scrollPaneTree);

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);

		themeScrollPane = new JScrollPane();

		runTestButton = new JButton("Начать тест");
		runTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) themeTree.getLastSelectedPathComponent();
				if (!addTestTextArea.getText().equals("")) {
					String[] listTheme = new String[counter - 1];
					StringTokenizer tokenizer = new StringTokenizer(addTestTextArea.getText(), ";");
					int i = 0;
					StringBuilder word = new StringBuilder("");
					while (tokenizer.hasMoreTokens()) {
						word.append(tokenizer.nextToken());
						if (word.length() > 1) {
							int index = word.indexOf(" ");
							if (index != -1) {
								word.delete(0, index + 1);
							}
							index = word.indexOf("\n");
							if (index != -1) {
								word.delete(index, index + 2);
							}
							listTheme[i++] = word.toString();
						}
						word.delete(0, word.length() + 1);
					}

					Test[] tests = new Test[counter - 1];
					for (i = 0; i < tests.length; i++) {
						tests[i] = Helper.getTests(listTheme[i]);
					}
					TestFrame testFrame = new TestFrame(tests);
					setVisible(false);
					testFrame.setVisible(true);
				} else if (selectedNode != null) {
					Object selectedObj = selectedNode.getUserObject().toString();
					Test[] theme = new Test[1];
					theme[0] = Helper.getTests(selectedObj.toString());
					TestFrame testFrame = new TestFrame(theme);
					setVisible(false);
					testFrame.setVisible(true);
				} else if (selectedNode == null) {
					JOptionPane.showMessageDialog(null, "Выберите хотя бы один раздел!", "Ошибка!",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		addTestButton = new JButton("Добавить в список");
		addTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) themeTree.getLastSelectedPathComponent();
				if (selectedNode != null) {
					Object selectedObj = selectedNode.getUserObject().toString();
					if (addTestTextArea.getText().toString().indexOf(selectedObj.toString()) == -1) {
						addTestTextArea.setText((addTestTextArea.getText().toString() + counter++ + ". "
								+ selectedObj.toString() + ";\n"));
					}
				}
			}
		});

		lblNewLabel = new JLabel("Выбранные тесты");

		addTestScrollPane = new JScrollPane();

		btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTestTextArea.setText("");
				counter = 1;
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPaneTree, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(themeScrollPane, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel)
						.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(addTestButton, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(runTestButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnX))
								.addComponent(addTestScrollPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(themeScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
						.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(addTestScrollPane, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnX)
								.addComponent(runTestButton))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(addTestButton))
						.addComponent(scrollPaneTree, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
					.addContainerGap())
		);

		addTestTextArea = new JTextArea();
		addTestScrollPane.setViewportView(addTestTextArea);

		themeTextArea = new JTextArea();
		themeScrollPane.setViewportView(themeTextArea);
		themeTextArea.setWrapStyleWord(true);
		themeTextArea.setLineWrap(true);
		themeTextArea.setEditable(false);

		themeTree = new JTree();

		themeTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Темы") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("Введение в технологию Java");
				node_1.add(new DefaultMutableTreeNode("Базовые понятия технологии Java"));
				node_1.add(new DefaultMutableTreeNode("Жизненный цикл, компиляции и исполнения  приложения Java"));
				node_1.add(new DefaultMutableTreeNode("Инсталляция платформы Java"));
				node_1.add(new DefaultMutableTreeNode("Пример написания первого приложения"));
				node_1.add(new DefaultMutableTreeNode("Обзор существующих IDE"));
				add(node_1);
				add(new DefaultMutableTreeNode("ООП"));
			}
		}));

		themeTree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent event) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) themeTree.getLastSelectedPathComponent();
				Object selectedObj = selectedNode.getUserObject().toString();
				themeTextArea.setText(Helper.setingText(selectedObj.toString()));
			}
		});

		scrollPaneTree.setViewportView(themeTree);

		treeScrollBar = new JScrollBar();
		scrollPaneTree.setRowHeaderView(treeScrollBar);
		getContentPane().setLayout(groupLayout);
	}
}
