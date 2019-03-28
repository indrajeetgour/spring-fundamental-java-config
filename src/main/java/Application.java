import gour.indrajeet.AppConfig;
import gour.indrajeet.service.CustomerService;
import gour.indrajeet.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
//        CustomerService customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(customerService.findAll().get(0).getLastname());

    }
}
