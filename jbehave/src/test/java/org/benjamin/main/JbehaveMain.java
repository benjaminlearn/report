package org.benjamin.main;

import java.util.List;

import org.benjamin.model.StudentSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class JbehaveMain extends JUnitStories {
	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.useStoryControls(new StoryControls().doDryRun(false))
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				.useStoryReporterBuilder(new StoryReporterBuilder().withReporters(new BDDReport()).withFormats(Format.XML, Format.IDE_CONSOLE,
						Format.CONSOLE, Format.HTML, Format.TXT).withFailureTrace(true).withFailureTraceCompression(true));
	}

	@Override
	protected List<String> storyPaths() {
		// TODO Auto-generated method stub
		return new StoryFinder().findPaths(CodeLocations.codeLocationFromPath("src/test/resources"), "**/*.story",
				"**/exclude_*.story");
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new StudentSteps());
	}
}
