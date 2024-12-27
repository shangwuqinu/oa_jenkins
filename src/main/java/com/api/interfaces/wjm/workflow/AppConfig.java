
package com.api.interfaces.wjm.workflow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    // 创建 RestTemplate 的 Bean
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
