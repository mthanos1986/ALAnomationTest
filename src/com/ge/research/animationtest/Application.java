package com.ge.research.animationtest;

import com.anylogic.engine.gui.ExperimentHost;
import com.anylogic.engine.gui.IExperimentHost;

public class Application {
	
	public static void main(String[] args) {
		final Simulation s = new Simulation();
		IExperimentHost host = new ExperimentHost(s);
		s.setup(host);
		host.launch();
		
	}
}
