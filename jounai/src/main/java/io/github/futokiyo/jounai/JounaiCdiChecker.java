package io.github.futokiyo.jounai;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.CDI;

@ApplicationScoped
public class JounaiCdiChecker implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4716359791921549690L;

	public void handle(@Observes @Initialized(ApplicationScoped.class) Object event) {
		System.out.println("JounaiCdiChecker worked!");
	}
}