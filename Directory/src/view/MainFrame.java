package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.tree.DefaultTreeModel;

import controller.Helper;
import controller.Runner;
import model.Almanac;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class MainFrame extends JFrame {

	private JTree themeTree;

	{
		Almanac almanac = Runner.getAlmanac();
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 587, 281);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPaneTree = new JScrollPane();
		scrollPaneTree.setBounds(0, 0, 500, 300);
		getContentPane().add(scrollPaneTree);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);

		JScrollPane scrollPane = new JScrollPane();

		JButton button = new JButton("Начать тест");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton button_1 = new JButton("Добавить в список");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPaneTree, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button))
					.addGap(12))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
						.addComponent(scrollPaneTree, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1)))
					.addContainerGap())
		);
		panel.setLayout(new BorderLayout(0, 0));

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		panel.add(textArea_1, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);

		themeTree = new JTree();

		themeTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Темы") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("Введение в технологию Java");
				node_1.add(new DefaultMutableTreeNode("Базовые понятия технологии Java"));
				node_1.add(new DefaultMutableTreeNode("Жизненный цикл, компиляции и исполнения  приложения Java"));
				node_1.add(new DefaultMutableTreeNode("Инсталляция платформы Java"));
				node_1.add(new DefaultMutableTreeNode("Пример написания первого приложения"));
				node_1.add(new DefaultMutableTreeNode("Обзор существующих IDE"));
//				add(node_1);
//				add(new DefaultMutableTreeNode("ООП"));
			}
		}));

		themeTree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent event) {
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) themeTree.getLastSelectedPathComponent();
				Object selectedObj = selectedNode.getUserObject().toString();
				if (selectedObj.equals("Введение в технологию Java")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Базовые понятия технологии Java")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Введение в технологию Java")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Жизненный цикл, компиляции и исполнения  приложения Java")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Инсталляция платформы Java")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Пример написания первого приложения")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("Обзор существующих IDE")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				} else if (selectedObj.equals("ООП")) {
					textArea.setText(Helper.setingText(selectedObj.toString()));
				}
			}
		});

		scrollPaneTree.setViewportView(themeTree);

		JScrollBar scrollBar = new JScrollBar();
		scrollPaneTree.setRowHeaderView(scrollBar);
		getContentPane().setLayout(groupLayout);
	}
}
