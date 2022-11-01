package com.kpi.limit.controller;

import com.kpi.limit.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limits")
    public LimitConfiguration getLimit() {

        return new LimitConfiguration(limitConfiguration.getMinLimit(), limitConfiguration.getMaxLimit());
    }
}
