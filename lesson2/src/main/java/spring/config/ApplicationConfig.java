package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Qualifer;
import spring.api.SimpleService;
import spring.service.BetaService;
import spring.service.SimpleServiceBean;
import spring.service.SimpleServiceImpl;
import spring.service.SimpleServiceTest;

import javax.management.MXBean;

@ComponentScan("spring")
public class ApplicationConfig {

    @Bean
    @Qualifer("bean")
    public SimpleService simpleBean() {
        return new SimpleServiceBean();

    }

    @Bean
    @Qualifer("impl")
    public SimpleService simpleimpl() {
        return new SimpleServiceImpl();
    }

    @Bean
    @Qualifer("test")
    public SimpleService simpleTest() {
        return new SimpleServiceTest();
    }

    @Bean
    public BetaService betaService(
            @Qualifer("bean") SimpleService simpleServiceBean,
            @Qualifer("impl") SimpleService simpleServiceImpl,
            @Qualifer("test") SimpleService simpleServiceTest
    ) {


        final BetaService betaService = new BetaService();
        betaService.setSimpleServiceBean(simpleServiceBean);
        betaService.setSimpleServiceImpl(simpleServiceImpl);
        betaService.setSimpleServiceTest(simpleServiceTest);
        return betaService;
    }
}