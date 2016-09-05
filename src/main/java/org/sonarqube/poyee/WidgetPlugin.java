package org.sonarqube.poyee;

import org.sonar.api.SonarPlugin;
import java.util.*;


public class WidgetPlugin extends SonarPlugin
{
	@Override
	public List getExtensions() {
		return Arrays.asList(JenkinsWidget.class);
	}
}
