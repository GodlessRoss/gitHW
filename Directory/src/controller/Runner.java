package controller;

import model.*;
import controller.*;
import view.*;

public class Runner {

	static Almanac almanac = new Almanac();
	
	public static void main(String[] args) {
		genarateModels();
		genarateControllers();
		generateGUI();
	}

	private static void genarateModels() {
		almanac.setTests(generateTests());
		almanac.setThemes(generateThemes());
	}

	private static Theme[] generateThemes() {
		Theme[] themes = null;
		return themes;
	}

	private static Test[] generateTests() {
		Question quest1Theme1 = new Question("Виртуальная машина (JVM) – это: ",
				"А) спецификация, описывающая абстрактную машину, в которой могут выполняться приложения на Java;\r\n"
						+ "\r\n" + "Б) средство, которое преобразует исходный код в байт-код;"
						+ " В) это набор инструкций на промежуточном языке, предназначенный для выполнения виртуальной машинной;",
				"A", 1);
		Question quest2Theme1 = new Question("Компилятор – это:",
				"А) спецификация, описывающая абстрактную машину, в которой могут выполняться приложения на Java;\r\n"
						+ "\r\n"
						+ "Б) средство, которое преобразует исходный код в байт-код; В) это набор инструкций на промежуточном языке, предназначенный для выполнения виртуальной машинной;\r\n"
						+ "\r\n"
						+ "Г) набор средств для разработки на языке Java, которые поставляются разработчику в виде единого готового решения.",
				"Б", 1);
		Question[] questionsTheme1 = { quest1Theme1, quest2Theme1 };
		Test testTheme1 = new Test(questionsTheme1);

		// Test testTheme2 = new Test();
		Test[] tests = {testTheme1};
		return tests;
		
	}

	private static void genarateControllers() {

	}

	private static void generateGUI() {

	}

}
