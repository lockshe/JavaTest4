package ynu.mavena.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ynu.mavena.controller.StaffController;
import ynu.mavena.dao.StaffDao;
import ynu.mavena.entity.Address;
import ynu.mavena.entity.Staff;

import javax.servlet.http.HttpServletRequest;

@Service
public class StaffService {

    private static Logger logger = LoggerFactory.getLogger(StaffService.class);

    @Autowired
    StaffDao staffDao;

    @Transactional
    public boolean addStaff(String address, Staff staff){
        int id = 0;
        Address add = null;
        add = staffDao.queryAddress(address);
        if (add==null){
            logger.error("error address");
            return false;
        }
        logger.info("add------");
        staff.setAddress_id(add.getAddress_id());
        staffDao.addStaff(staff);
        return true;
    }

    public void updateStaff(Staff staff){
        logger.info("update----"+staff.toString());
        staffDao.updateStaff(staff);
    }

    public void deleteStaff(int staff_id){
        logger.info("delete----staff");
        staffDao.deleteStaff(staff_id);
    }

}
