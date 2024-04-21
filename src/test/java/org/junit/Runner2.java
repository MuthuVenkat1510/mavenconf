package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Runner2 {
	@Test
	public void executeAll() {
		Result r = JUnitCore.runClasses(IgnoreExample.class, ExecutionSample.class);
		System.out.println("No of Failure Count " + r.getFailureCount());
		System.out.println("No of Ingonre Count" + r.getIgnoreCount());
		System.out.println("NO Of Run Count " + r.getRunCount());
		System.out.println("No Of RunTime" + r.getRunTime());
	}

}
