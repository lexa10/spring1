package spring.service;

public class MegaService {

    private String name;

    public MegaService(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "MegaService{" + "name='" + name + '\'' + '}';
    }
}
