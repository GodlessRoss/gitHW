package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.tree.DefaultTreeModel;

import controller.Helper;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

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
	private JTextArea addTestTextArea;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 587, 281);
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
			public void actionPerformed(ActionEvent e) {
			}
		});

		addTestButton = new JButton("Добавить в список");
		addTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) themeTree.getLastSelectedPathComponent();
				if (selectedNode != null) {
					String selectedObj = selectedNode.getUserObject().toString();
					if (addTestTextArea.getText().indexOf(selectedObj) == -1) {
						addTestTextArea
								.setText(addTestTextArea.getText() + counter++ + ". " + selectedObj.toString() + ";\n");
					}
				}
			}
		});

		lblNewLabel = new JLabel("Выбранные тесты");

		addTestScrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(scrollPaneTree, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(themeScrollPane, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(lblNewLabel)
								.addComponent(addTestButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(runTestButton).addComponent(addTestScrollPane))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(themeScrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 220,
										Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup().addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(addTestScrollPane, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(runTestButton)
										.addGap(7).addComponent(addTestButton))
								.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 220,
										Short.MAX_VALUE)
								.addComponent(scrollPaneTree, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 220,
										Short.MAX_VALUE))
						.addContainerGap()));

		addTestTextArea = new JTextArea();
		addTestTextArea.setWrapStyleWord(true);
		addTestTextArea.setLineWrap(true);
		addTestTextArea.setEditable(false);
		addTestTextArea.setBackground(Color.WHITE);
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
