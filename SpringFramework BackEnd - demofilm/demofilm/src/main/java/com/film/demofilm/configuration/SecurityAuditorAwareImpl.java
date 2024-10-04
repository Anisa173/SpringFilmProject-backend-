package com.film.demofilm.configuration;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;


public class SecurityAuditorAwareImpl implements AuditorAware<Integer> {

	@Override
	public Optional<Integer> getCurrentAuditor() {
		 return SecurityUtils.getLoggedUserId()!=null?Optional.of(SecurityUtils.getLoggedUserId()):Optional.empty();
	    }
	}


