package com.infosys.componentScan.filters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.infosys.package1.BeanC;

@Component
@ComponentScan(basePackages = "com.infosys.package1", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanC.class ))
public class ComponentScanConfig {

}
