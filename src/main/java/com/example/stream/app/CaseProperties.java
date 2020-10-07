package com.example.stream.app;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("case")
public class CaseProperties {

	/**
	 * Flag to control which case to use.
	 */
	private boolean uppercase = true;

	public boolean isUppercase() {
		return uppercase;
	}

	public void setUppercase(boolean uppercase) {
		this.uppercase = uppercase;
	}
}
