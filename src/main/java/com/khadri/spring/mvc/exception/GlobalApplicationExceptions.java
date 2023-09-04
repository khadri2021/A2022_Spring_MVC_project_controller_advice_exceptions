package com.khadri.spring.mvc.exception;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalApplicationExceptions {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNPE() {
		return "npe";
	}

	@ExceptionHandler(value = IOException.class)
	public String handleIOE() {
		return "ioe";
	}

	@ExceptionHandler(value = Exception.class)
	public String handleAnyException() {
		return "exception";
	}
}
