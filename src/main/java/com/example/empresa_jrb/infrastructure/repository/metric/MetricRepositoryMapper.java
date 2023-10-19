package com.example.empresa_jrb.infrastructure.repository.metric;


import com.example.empresa_jrb.domain.model.Metric;
import com.example.empresa_jrb.infrastructure.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface MetricRepositoryMapper extends EntityToDto<Metric, MetricDto> {
}