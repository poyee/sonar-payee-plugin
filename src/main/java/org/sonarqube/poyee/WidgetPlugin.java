package org.sonarqube.poyee;

import org.sonar.api.Plugin.Context;
import org.sonar.api.Plugin;


import java.util.*;


public class WidgetPlugin implements Plugin
{
	@Override
	public void define(Context context) {
		context.addExtension(JenkinsWidget.class);
	}
}
