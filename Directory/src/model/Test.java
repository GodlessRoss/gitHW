package model;

import java.util.Arrays;

public class Test {

	private String name;
	private Question questions[];
	private String tag;

	public Test(String name, Question questions[]) {
		this.name = name;
		this.questions = questions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", questions=" + Arrays.toString(questions) + ", tag=" + tag + "]";
	}

}
