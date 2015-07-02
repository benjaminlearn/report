package org.benjamin.main;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.GivenStories;
import org.jbehave.core.model.Lifecycle;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.Narrative;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;
import org.jbehave.core.model.StoryDuration;
import org.jbehave.core.reporters.StoryReporter;

public class BDDReport implements StoryReporter{

	Logger log = Logger.getLogger(BDDReport.class);
	
	public void storyNotAllowed(Story story, String filter) {
		// TODO Auto-generated method stub
		log.info("----------- storyNotAllowed ------------");
		log.info("storyNotAllowed: - Story - " + story.getName() + ", filter - " + filter);
		
	}

	public void storyCancelled(Story story, StoryDuration storyDuration) {
		// TODO Auto-generated method stub
		log.info("----------- storyCancelled ------------");
		log.info("storyCancelled: - Story - " + story.getName() + ", storyDuration - " + storyDuration.getDurationInSecs());
	}

	public void beforeStory(Story story, boolean givenStory) {
		// TODO Auto-generated method stub
		log.info("----------- beforeStory ------------");
		log.info("beforeStory: - Story - " + story.getName() + ", givenStory - " + givenStory);
	}

	public void afterStory(boolean givenStory) {
		// TODO Auto-generated method stub
		log.info("----------- afterStory ------------");
		log.info("afterStory: - givenStory - " + givenStory);
	}

	public void narrative(Narrative narrative) {
		// TODO Auto-generated method stub
		log.info("----------- narrative ------------");
		log.info("narrative: - inOrderTo - " + narrative.inOrderTo());
		log.info("narrative: - asA - " + narrative.asA());
		log.info("narrative: - iWantTo - " + narrative.iWantTo());
	}

	public void lifecyle(Lifecycle lifecycle) {
		// TODO Auto-generated method stub
		log.info("----------- lifecyle ------------");
		log.info("lifecyle: - lifecyle - " + lifecycle);
		
		log.info("lifecyle: - Before Steps");
		for(String step : lifecycle.getBeforeSteps()){
			log.info("lifecyle: - Before Step - " + step);
		}
		
		log.info("lifecyle: - After Step");
		for(String step : lifecycle.getAfterSteps()){
			log.info("lifecyle: - After Step - " + step);
		}
		
	}

	public void scenarioNotAllowed(Scenario scenario, String filter) {
		log.info("----------- scenarioNotAllowed ------------");
		log.info("scenarioNotAllowed: - scenario - ");
		log.info("scenarioNotAllowed: - scenario.getTitle - " + scenario.getTitle());
		log.info("scenarioNotAllowed: - scenario.getGivenStories - " + scenario.getGivenStories());
		for(String given : scenario.getGivenStories().getPaths()) {
			log.info("Givevn Story - " + given);
		}
		
		log.info("scenarioNotAllowed: - scenario.Steps - " + scenario.getSteps());
		for(String step : scenario.getSteps()){
			log.info("scenarioNotAllowed: - scenario.Step - " + step);
		}
		// TODO Auto-generated method stub
		
	}

	public void beforeScenario(String scenarioTitle) {
		// TODO Auto-generated method stub
		log.info("----------- beforeScenario ------------");
		log.info("beforeScenario: - scenarioTitle - " + scenarioTitle);
	}

	public void scenarioMeta(Meta meta) {
		// TODO Auto-generated method stub
		log.info("----------- scenarioMeta ------------");
		log.info("scenarioMeta: - meta - " + meta);
	}

	public void afterScenario() {
		// TODO Auto-generated method stub
		log.info("------- afterScenario ------ ");
	}

	public void givenStories(GivenStories givenStories) {
		log.info("------ givenStories ------ ");
		// TODO Auto-generated method stub
		for(String given : givenStories.getPaths()) {
			log.info("Givevn Story - " + given);
		}
	}

	public void givenStories(List<String> storyPaths) {
		// TODO Auto-generated method stub
		log.info("------ givenStories ------ ");
		for(String given : storyPaths) {
			log.info("Givevn Story -storyPaths - " + given);
		}
	}

	public void beforeExamples(List<String> steps, ExamplesTable table) {
		// TODO Auto-generated method stub

		log.info("----------- beforeExamples ------------");
		for(String step : steps){
			log.info("beforeExamples: - Step - " + step);
		}
		
		log.info("beforeExamples: - table - " + table.asString());
	}

	public void example(Map<String, String> tableRow) {
		// TODO Auto-generated method stub
		log.info("----------- example ------------");
		for(Map.Entry<String, String> table : tableRow.entrySet()){
			log.info("example: - key - " + table.getKey());
			log.info("example: - value - " + table.getValue());
		}
	}

	public void afterExamples() {
		// TODO Auto-generated method stub
		log.info("----------- afterExamples ------------");
	}

	public void beforeStep(String step) {
		// TODO Auto-generated method stub
		log.info("----------- beforeStep ------------");
		log.info("step - " + step);
	}

	public void successful(String step) {
		// TODO Auto-generated method stub
		log.info("----------- successful ------------");
		log.info("step - " + step);
	}

	public void ignorable(String step) {
		// TODO Auto-generated method stub
		log.info("----------- ignorable ------------");
		log.info("step - " + step);
	}

	public void pending(String step) {
		// TODO Auto-generated method stub
		log.info("----------- pending ------------");
		log.info("step - " + step);
	}

	public void notPerformed(String step) {
		// TODO Auto-generated method stub
		log.info("----------- notPerformed ------------");
		log.info("step - " + step);
	}

	public void failed(String step, Throwable cause) {
		// TODO Auto-generated method stub
		log.info("----------- failed ------------");
		log.info("step - " + step + ", Throwable - " + cause);
	}

	public void failedOutcomes(String step, OutcomesTable table) {
		// TODO Auto-generated method stub
		log.info("----------- failedOutcomes ------------");
		log.info("step - " + step + ", OutcomesTable - " + table.asString());
	}

	public void restarted(String step, Throwable cause) {
		// TODO Auto-generated method stub
		log.info("----------- restarted ------------");
		log.info("step - " + step + ", Throwable - " + cause);
	}

	public void restartedStory(Story story, Throwable cause) {
		// TODO Auto-generated method stub
		log.info("----------- restartedStory ------------");
		log.info("story - " + story.getName() + ", Throwable - " + cause);
	}

	public void dryRun() {
		// TODO Auto-generated method stub
		log.info("----------- dryRun ------------");
	}

	public void pendingMethods(List<String> methods) {
		// TODO Auto-generated method stub
		log.info("----------- pendingMethods ------------");
		for(String method : methods) {
			log.info("method - " + method);
		}
	}

}
