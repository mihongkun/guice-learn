package com.mihk.guicedemo.helloworlddemo;

import java.io.PrintStream;

import com.google.inject.AbstractModule;
import com.mihk.guicedemo.MyApplet;

public class HelloWorldModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrintStringWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		bind(String.class).annotatedWith(Output.class).toInstance("Hello,World!");
	}

}
