package model;

public class Almanac {

	private Theme[] themes;
	private Test[] tests;

//	public Almanac(Theme themes[], Test tests[]) {
//		this.themes = themes;
//		this.tests = tests;
//	}

	public Test[] getTests() {
		return tests;
	}

	public void setTests(Test[] tests) {
		this.tests = tests;
	}

	public Theme[] getThemes() {
		return themes;
	}

	public void setThemes(Theme[] themes) {
		this.themes = themes;
	}
}
