import gour.indrajeet.repository.CustomerRepository;
import gour.indrajeet.repository.HibernateCustomerRepositoryImpl;
import gour.indrajeet.service.CustomerService;
import gour.indrajeet.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
//        return new CustomerServiceImpl();
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}
