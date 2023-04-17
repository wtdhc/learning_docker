package com.github.two.service;

import com.github.two.model.AllNameValueTO;
import com.github.two.model.NameValueTO;

public interface NameValueService {
  	NameValueTO updateNameValue(NameValueTO nameValueTO);
  	AllNameValueTO getAllNameValues(String name);
  	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);
  	NameValueTO generateUUID();
}
