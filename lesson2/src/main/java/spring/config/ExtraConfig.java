package spring.config;

import org.springframework.context.annotation.Bean;
import spring.service.BestService;

import javax.management.MXBean;
@ComponentScan("spring")
public class ExtraConfig {

    @Bean
    public BestService bestService(){
        return new  BestService();
    }
}
