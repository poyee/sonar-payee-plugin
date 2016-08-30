package org.sonarqube.poyee;

import org.sonar.api.web.*;

@WidgetScope("GLOBAL")
@UserRole(UserRole.USER)
@Description("Displays Jenkins last buld information.")
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
	    return "user-text";
	}
	@Override
	  public String getTitle() {
	    return "Jenkins Project Build Information";
	}

	@Override
	protected String getTemplatePath() {
	   return "/my_widget.html.erb";
	}
}
