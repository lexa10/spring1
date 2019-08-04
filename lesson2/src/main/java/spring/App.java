package spring;

import spring.config.ApplicationConfig;
import spring.service.BetaService;

public class App {

    public static  void main(String [] args){
        final ApplicationContext context = new AnnotationConfigApplicatonContext(ApplicationConfig.class);

        final BetaService bestService = context.getBean(BetaService.class);

        System.out.println(bestService.getSimpleServiceBean().get);
        System.out.println(bestService);
        System.out.println(bestService);
    }
}
