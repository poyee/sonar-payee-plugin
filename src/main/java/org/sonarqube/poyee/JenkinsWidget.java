package org.sonarqube.poyee;

import org.sonar.api.web.*;

@WidgetScope("GLOBAL")
@UserRole(UserRole.USER)
@Description("Test Jenkins last buld information.")
@WidgetCategory({"Global"})
@WidgetProperties({
  @WidgetProperty(
    key = "JenkinsHost",
    description = "Jenkins host URL"
  ),
  @WidgetProperty(
	key = "JenkinsProjectName",
    description = "Jenkins project name"
  ),
})

public class JenkinsWidget extends AbstractRubyTemplate implements RubyRailsWidget{
	  
	@Override  
	public String getId() {
	    return "jenkins-test-status";
	}
	@Override
	  public String getTitle() {
	    return "Jenkins Test Status";
	}

	@Override
	protected String getTemplatePath() {
	   return "/Users/liupoyee/Documents/workspace/sonar-poyee-plugin/src/main/resources/test.html.erb";
	}
}
