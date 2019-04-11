package com.github.yishenggudou.blitzcrank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

public class BlitzcrankAutoConfigure {

    @Autowired
    private BlitzcrankServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "com.github.yishenggudou.blitzcrank", value = "enabled", havingValue = "true")
    BlitzcrankService exampleService() {
        return new BlitzcrankService();
    }
}
