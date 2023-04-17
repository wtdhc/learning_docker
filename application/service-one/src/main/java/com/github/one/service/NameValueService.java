package com.github.one.service;

import com.github.one.domain.NameValue;
import reactor.core.publisher.Mono;

public interface NameValueService {
	NameValue updateNameValue(NameValue value, boolean fromRabbit);
	Mono<NameValue> getNameValue();
	NameValue generateUUID();
}
