package com.practice.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Runtime implements IAnnotationTransformer{

	public void transform(ITestAnnotation test, Class arg1, Constructor arg2, Method arg3) {
		test.setRetryAnalyzer(Failledrunner.class);
	
		
	}

}
