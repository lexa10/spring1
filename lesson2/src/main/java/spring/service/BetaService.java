package spring.service;

import spring.api.SimpleService;

public class BetaService {

    private SimpleService simpleServiceBean;

    private SimpleService simpleServiceImpl;

    private SimpleService simpleServiceTest;

    public  SimpleService getSimpleServiceBean() {
        return simpleServiceBean;
    }
    public  void  setSimpleServiceBean(SimpleService simpleServiceBean){
        this.simpleServiceBean;
    }
    public  SimpleService getSimpleServiceImpl() {
        return simpleServiceImpl;
    }
    public  void  setSimpleServiceImpl(SimpleService simpleServiceImpl){
        this.simpleServiceImpl;
    }
    public  SimpleService getSimpleServiceTest() {
        return simpleServiceTest;
    }
    public  void  setSimpleServiceTest(SimpleService simpleServiceTest){
        this.simpleServiceTest;
    }
}

