package spring;

import spring.config.ApplicationConfig;
import spring.service.MegaService;


public class Application {

    public static void main(String[] args){
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        System.out.println(context.getBean(MegaService.class));
        System.out.println(context.getBean("DEFAULT"));
        System.out.println(context.getBean("FIRST"));
        System.out.println(context.getBean("SECOND"));
    }
}
