package com.example.empresa_jrb.cosumer;


import com.example.empresa_jrb.domain.model.Metric;
import com.example.empresa_jrb.infrastructure.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface MetricResponseMapper extends EntityToDto<Metric, MetricRespose> {

}