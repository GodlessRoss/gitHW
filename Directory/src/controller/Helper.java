package controller;

import java.awt.Color;

import javax.swing.JButton;

import model.Almanac;
import model.Question;
import model.Test;
import model.Theme;

public final class Helper {
	static Almanac almanac;
	static Theme[] themes;
	static Test[] tests;

	static {
		almanac = Runner.getAlmanac();
		themes = almanac.getThemes();
		tests = almanac.getTests();
	}

	public static String setingText(String name) {
		for (Theme theme : themes) {
			if (name != null && name.equals(theme.getName())) {
				return theme.getText();
			}
		}
		return "Ошибка чтения";
	}

	public static Test getTests(String name) {
		for (Test test : tests) {
			if (name != null && name.equals(test.getName())) {
				return test;
			}
		}
		return null;
	}

	public static void setColorButtons(int counter, int tempCounter, JButton button1, JButton button2, JButton button3,
			JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9,
			JButton button10, JButton button11, JButton button12) {
		switch (counter) {
		case 0:
			button1.setBackground(Color.YELLOW);
			button2.setBackground(Color.GRAY);
			break;
		case 1:
			button2.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button3.setBackground(Color.GRAY);
			} else {
				button1.setBackground(Color.GRAY);
			}
			break;
		case 2:
			button3.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button4.setBackground(Color.GRAY);
			} else {
				button2.setBackground(Color.GRAY);
			}
			break;
		case 3:
			button4.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button5.setBackground(Color.GRAY);
			} else {
				button3.setBackground(Color.GRAY);
			}
			break;
		case 4:
			button5.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button6.setBackground(Color.GRAY);
			} else {
				button4.setBackground(Color.GRAY);
			}
			break;
		case 5:
			button6.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button7.setBackground(Color.GRAY);
			} else {
				button5.setBackground(Color.GRAY);
			}
			break;
		case 6:
			button7.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button8.setBackground(Color.GRAY);
			} else {
				button6.setBackground(Color.GRAY);
			}
			break;
		case 7:
			button8.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button9.setBackground(Color.GRAY);
			} else {
				button7.setBackground(Color.GRAY);
			}
			break;
		case 8:
			button9.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button10.setBackground(Color.GRAY);
			} else {
				button8.setBackground(Color.GRAY);
			}
			break;
		case 9:
			button10.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button11.setBackground(Color.GRAY);
			} else {
				button9.setBackground(Color.GRAY);
			}
			break;
		case 10:
			button11.setBackground(Color.YELLOW);
			if (tempCounter > counter) {
				button12.setBackground(Color.GRAY);
			} else {
				button10.setBackground(Color.GRAY);
			}
			break;
		case 11:
			button12.setBackground(Color.YELLOW);
			button11.setBackground(Color.GRAY);
			break;

		}
	}

	public static void setColorButtons(int counter, JButton button1, JButton button2, JButton button3, JButton button4,
			JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10,
			JButton button11, JButton button12) {
		button1.setBackground(Color.GRAY);
		button2.setBackground(Color.GRAY);
		button3.setBackground(Color.GRAY);
		button4.setBackground(Color.GRAY);
		button5.setBackground(Color.GRAY);
		button6.setBackground(Color.GRAY);
		button7.setBackground(Color.GRAY);
		button8.setBackground(Color.GRAY);
		button9.setBackground(Color.GRAY);
		button10.setBackground(Color.GRAY);
		button11.setBackground(Color.GRAY);
		button12.setBackground(Color.GRAY);

		if (counter == 0) {
			button1.setBackground(Color.YELLOW);
		} else if (counter == 1) {
			button2.setBackground(Color.YELLOW);
		} else if (counter == 2) {
			button3.setBackground(Color.YELLOW);
		} else if (counter == 3) {
			button4.setBackground(Color.YELLOW);
		} else if (counter == 4) {
			button5.setBackground(Color.YELLOW);
		} else if (counter == 5) {
			button6.setBackground(Color.YELLOW);
		} else if (counter == 6) {
			button7.setBackground(Color.YELLOW);
		} else if (counter == 7) {
			button8.setBackground(Color.YELLOW);
		} else if (counter == 8) {
			button9.setBackground(Color.YELLOW);
		} else if (counter == 9) {
			button10.setBackground(Color.YELLOW);
		} else if (counter == 10) {
			button11.setBackground(Color.YELLOW);
		} else if (counter == 11) {
			button12.setBackground(Color.YELLOW);
		}

	}

	public static void gerateTotalTest() {
		
	}

}
