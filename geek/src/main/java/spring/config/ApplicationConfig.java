package spring.config;

import spring.service.MegaService;
import org.springframework.context.annotation.Bean;

import javax.management.MXBean;

public class ApplicationConfig {

    @Bean
    public MegaService megaService() {
        return new MegaService("DEFAULT!");
    }
    @Bean
    public MegaService megaServiceFirst() {
        return new MegaService("FIRST!");
    }
    @Bean
    public MegaService megaServiceSecond() {
        return new MegaService("SECOND!");
    }
}

