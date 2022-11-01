package com.kpi.limit.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {

//    @Value("${limit-service.minLimit}")
    private int minLimit;
//    @Value("${limit-service.maxLimit}")
    private int maxLimit;

    public LimitConfiguration() {

    }

    public LimitConfiguration(int minLimit, int maxLimit) {
        super();
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(int minLimit) {
        this.minLimit = minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }
}
