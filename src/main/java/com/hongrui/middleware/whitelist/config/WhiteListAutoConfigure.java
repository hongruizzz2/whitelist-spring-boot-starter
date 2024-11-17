package com.hongrui.middleware.whitelist.config;

import com.hongrui.middleware.whitelist.DoJoinPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 10:29
 */
@Configuration
@ConditionalOnClass(WhiteListProperties.class)
@EnableConfigurationProperties(WhiteListProperties.class)
public class WhiteListAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    public DoJoinPoint point() {
        return new DoJoinPoint();
    }

    @Bean("whiteListConfig")
    @ConditionalOnMissingBean
    public String whiteListConfig(WhiteListProperties properties) {
        return properties.getUsers();
    }

}
