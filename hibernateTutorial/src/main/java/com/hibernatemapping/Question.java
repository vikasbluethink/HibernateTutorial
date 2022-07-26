package com.hibernatemapping;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int q_id;
	
	@Column
	private String question;
	
//	@OneToOne
//	private Answer answer;

	@OneToMany
	private List<Answer> answers;

	public Question(int q_id, String question, List<Answer> answers) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.answers = answers;
	}

//	public Answer getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}
//
//	public Question(int q_id, String question, Answer answer) {
//		super();
//		this.q_id = q_id;
//		this.question = question;
//		this.answer = answer;
//	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
