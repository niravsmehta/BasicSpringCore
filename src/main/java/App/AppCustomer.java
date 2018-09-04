package App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import Bean.Customer;
import Service.CustomerService;

public class AppCustomer {

	public static void main(String args[]) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext("Bean", "Service");
		System.out.println("Spring Context Intialised");
		CustomerService customerService = appContext.getBean(CustomerService.class);
		System.out.println(customerService.getCustomer());
		Customer customer = appContext.getBean(Customer.class);
		customer.setName("Nirav");
		customer.setId(2);
		customer.setAge(28);
		System.out.println("Updated Customer");
		customerService.updateCustomer(customer);
		System.out.println(customerService.getCustomer());
		((AbstractApplicationContext) appContext).close();
	}
}
