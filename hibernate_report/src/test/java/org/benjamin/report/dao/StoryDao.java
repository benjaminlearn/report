package org.benjamin.report.dao;

import java.util.ArrayList;
import java.util.List;

import org.benjamin.report.model.RExamplesTable;
import org.benjamin.report.model.RMeta;
import org.benjamin.report.model.RNarrative;
import org.benjamin.report.model.RScenario;
import org.benjamin.report.model.RStory;
import org.benjamin.report.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StoryDao {
	
	
	public static void main(String[] args) {
		StoryDao sd = new StoryDao();
		HibernateUtils hu = new HibernateUtils();
		
		SessionFactory sf = hu.getSessionFactory();
		Session sesstion = hu.getSession();
		
		// Meta
		RMeta rm = new RMeta();
//		sesstion.save(rm);
		
		// Narrative
		RNarrative n = new RNarrative();
		n.setAsA("asI");
		n.setInOrderTo("in order to");
		n.setiWantTo("I want to");
//		sesstion.save(n);
		
		// Scenarios
		List<RScenario> scenarios = new ArrayList<RScenario>();
		
		// Story
		RStory st = new RStory();
		st.setDescription("story description");
		st.setMeta(rm);
		st.setName("story name");
		st.setPath("story path");
		st.setNarrative(n);
//		st.setScenarios(scenarios);
		for(int i=0;  i< 3; i++) {
			RScenario s = new RScenario();
			s.setTitle("The title of Scenario - " + i);
			RMeta r = new RMeta();
//			sesstion.save(r);
			s.setMeta(r);
			
			RExamplesTable rt = new RExamplesTable();
//			sesstion.save(rt);
			s.setExamplesTable(rt);
			s.setStory(st);
			
			scenarios.add(s);
//			sesstion.save(s);
		}
		
		st.setScenarios(scenarios);

		sesstion.save(st);
		
		sesstion.getTransaction().commit();
	}

}
