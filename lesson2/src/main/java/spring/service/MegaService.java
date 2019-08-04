package spring.service;

@Component
public class MegaService {

    @Autowired
    private BestService bestService;

    public  BestService getBestService(){
        return  bestService;
    }
}
