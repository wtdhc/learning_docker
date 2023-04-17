package com.github.two.mapper;

import com.github.two.domain.NameValue;
import com.github.two.model.NameValueTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NameValueMapper {
  	NameValueMapper INSTANCE = Mappers.getMapper(NameValueMapper.class);
  	NameValue getNameValue(NameValueTO nameValueTO);
}
