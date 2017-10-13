package com.mihk.guicedemo.helloworlddemo;

import javax.inject.Inject;

import com.google.inject.Provider;
import com.mihk.guicedemo.MyApplet;

public class StringWritingApplet implements MyApplet {

	private MyDestination destination;
	private Provider<String> stringProvider;

	private void writeString() {

		destination.write(stringProvider.get());
	}
	
	@Inject
	public StringWritingApplet(MyDestination destination,@Output Provider<String> stringProvider) {
		super();
		this.destination = destination;
		this.stringProvider = stringProvider;
	}

	@Override
	public void run() {
		writeString();
	}
}
