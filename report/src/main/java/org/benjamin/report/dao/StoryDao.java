package org.benjamin.report.dao;

import java.util.ArrayList;
import java.util.List;

import org.benjamin.report.model.Narrative;
import org.benjamin.report.model.Scenario;
import org.benjamin.report.model.Story;
import org.benjamin.report.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StoryDao {
	
	
	public static void main(String[] args) {
		StoryDao sd = new StoryDao();
		HibernateUtils hu = new HibernateUtils();
		
		SessionFactory sf = hu.getSessionFactory();
		Session sesstion = hu.getSession();
		
		List<Scenario> scenarios = new ArrayList<Scenario>();
		
		for(int i=0;  i< 3; i++) {
			Scenario s = new Scenario();
			s.setSummary("Tis the summary of Scenario - " + i);
			scenarios.add(s);
			sesstion.save(s);
		}

		
		Narrative n = new Narrative();
		n.setAsI("asI");
		n.setInOrderTO("in order to");
		n.setiWantTo("I want to");
		sesstion.save(n);
		
		Story st = new Story();
		st.setJiraId("jira ID");
		st.setNarrative(n);
		st.setScenarios(scenarios);
		sesstion.save(st);
		
		sesstion.getTransaction().commit();
	}

}
