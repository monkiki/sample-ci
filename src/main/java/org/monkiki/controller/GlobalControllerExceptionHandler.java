package org.monkiki.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pavila on 17/06/16.
 * <p>
 * Esto parece que ahora no tiene efecto, pasando a usarse BasicErrorController.java
 * Ver http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-error-handling
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {
	private static Logger log = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		log.error(e.getMessage(), e);
		ModelAndView model = new ModelAndView();
		model.addObject("exception", e);
		model.addObject("url", req.getRequestURL());
		model.setViewName("error");
		return model;
	}
}
