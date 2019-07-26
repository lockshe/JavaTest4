package ynu.mavena.dao;

import org.apache.ibatis.annotations.Mapper;
import ynu.mavena.entity.Customer;

@Mapper
public interface CustomerDao {

    Customer Login(Customer customer);

}
