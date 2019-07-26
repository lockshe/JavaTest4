package ynu.mavena.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ynu.mavena.entity.Address;
import ynu.mavena.entity.Staff;

@Mapper
public interface StaffDao{

    int addStaff(Staff staff);

    Address queryAddress(@Param("address") String address);

    void updateStaff(Staff staff);

    void deleteStaff(@Param("staff_id") int staff_id);
}
