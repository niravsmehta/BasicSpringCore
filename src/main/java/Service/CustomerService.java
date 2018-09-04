package Service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Bean.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class CustomerService implements InitializingBean, DisposableBean {
	@Autowired
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying Customer");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Intializing Customer values");
		customer.setName("FirsCustomer");
		customer.setId(1);
		customer.setAge(25);
	}
	public Customer updateCustomer(Customer c) {
		customer.setName(c.getName());
		customer.setAge(c.getAge());
		customer.setId(c.getId());
		return customer;
		
	}

}
