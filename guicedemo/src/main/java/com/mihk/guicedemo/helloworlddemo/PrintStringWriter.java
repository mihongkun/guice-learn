package com.mihk.guicedemo.helloworlddemo;

import java.io.PrintStream;

import javax.inject.Inject;

public class PrintStringWriter implements MyDestination {

	private PrintStream destination;

	@Override
	public void write(String string) {
		destination.println(string);
		
	}

	@Inject
	public PrintStringWriter(PrintStream destination) {
		super();
		this.destination = destination;
	}

}
