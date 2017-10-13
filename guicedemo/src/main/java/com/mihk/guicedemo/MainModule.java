package com.mihk.guicedemo;

import com.google.inject.AbstractModule;
import com.mihk.guicedemo.helloworlddemo.HelloWorldModule;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new HelloWorldModule());
	}
}
