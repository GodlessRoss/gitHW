package model;

public class Question {

	private String name;
	private String text;
	private String correctAnswer;
	private int countCorrect;
	private String tag;

	public Question(String name, String text, String correctAnswer, int countCorrect) {
		this.name = name;
		this.text = text;
		this.correctAnswer = correctAnswer;
		this.countCorrect = countCorrect;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getCountCorrect() {
		return countCorrect;
	}

	public void setCountCorrect(int countCorrect) {
		this.countCorrect = countCorrect;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
}
