package com.dajava.backend.global.log;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LogType {
	API("api"),
	SYSTEM("system"),
	DEFAULT("default");

	private final String type;
}
