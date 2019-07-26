package ynu.mavena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ynu.mavena.dao.CustomerDao;
import ynu.mavena.entity.Customer;

@Service
public class Customerservice {

    @Autowired
    CustomerDao customerDao;

    public Customer login(Customer customer){
        return customerDao.Login(customer);
    }
}
