package controller;

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

	// public static Test какоетоНазваниеМетода(String name) {
	// Question[] quest;
	// for (Test test : tests) {
	// if (name != null && name.equals(test.getQuestions())) {
	// quest = test.getQuestions();
	// for (Question questmads : quest) {
	// questmads.getName();
	// questmads.getText();
	// String prav = questmads.getCorrectAnswer();
	// return test;
	// }
	// }
	// return null;
	// }
}
