package com.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import NEC.hibernateTutorial.*;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello World! I am from hibernatemapping package");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Question q1 = new Question(0, null, null);
		q1.setQ_id(1);
		q1.setQuestion("What is java?");
		session.save(q1);
		
		Answer a1 = new Answer(0, null);
		a1.setA_id(4);
		a1.setAnswer("Java is programming language.");
		a1.setQuestion(q1);
		session.save(a1);
		
//		q1.setAnswer(a1);
		
		
		Question q2 = new Question(0, null, null);
		q2.setQ_id(2);
		q2.setQuestion("What is collection framework?");
		session.save(q2);
		
		Answer a2 = new Answer(0, null);
		a2.setA_id(5);
		a2.setAnswer("API to work with group of objects.");
		a2.setQuestion(q2);
		a2.setQuestion(q1);
		session.save(a2);
		
//		q2.setAnswer(a2);
		
		Question q3 = new Question(0, null, null);
		q3.setQ_id(3);
		q3.setQuestion("What is eclipse?");
		session.save(q3);
		
		Answer a3 = new Answer(0, null);
		a3.setA_id(6);
		a3.setAnswer("IDE to writing codes.");
		a3.setQuestion(q3);
		session.save(a3);
		
//		q3.setAnswer(a3);
		
//		session.close();
//		transaction.commit();

	}

}
