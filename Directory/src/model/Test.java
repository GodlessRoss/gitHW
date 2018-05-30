package model;

public class Test {

	private String name;
	private Question questions[];

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

	private String tag;
}
