package ynu.mavena.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ynu.mavena.entity.Customer;
import ynu.mavena.service.Customerservice;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerController {

    private static Logger logger= LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    Customerservice customerservice;

    @PostMapping("/login")
    public Map login(@RequestBody Customer customer){
        Map map = new HashMap();
        Customer customer1 = customerservice.login(customer);
        logger.info(customer1.toString());
        if(customer1!=null){
            map.put("msg","log in sucessfully");
            return map;
        }
        map.put("msg","log in failure");
        return map;
    }


}
