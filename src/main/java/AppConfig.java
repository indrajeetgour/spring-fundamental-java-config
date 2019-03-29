import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"gour.indrajeet"})
@PropertySource("app.properties")
public class AppConfig {
    //    to load properties values into current context for further use
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    /*also comment out the below: and added the @Service annotation in the service Impl class */
   /* @Bean(name = "customerService")
    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
//        return new CustomerServiceImpl();
    }*/

    //// we have commit the below code and added the @Repository in HibernateCustomerRepositoryImpl, to get
    //// rid of below bean
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository(){
//        return new HibernateCustomerRepositoryImpl();
//    }
}
