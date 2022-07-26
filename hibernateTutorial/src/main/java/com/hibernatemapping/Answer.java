package com.hibernatemapping;

import javax.persistence.*;

@Entity
@Table(name="answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn 
	@Column
	private int a_id;

	@Column
	private String answer;
	
//	@OneToOne
//	private Question question;

	@ManyToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(int a_id, String answer) {
		super();
		this.a_id = a_id;
		this.answer = answer;
//		this.question = question;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
