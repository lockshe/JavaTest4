package ynu.mavena.controller;

import org.apache.ibatis.annotations.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.applet.resources.MsgAppletViewer;
import ynu.mavena.entity.Staff;
import ynu.mavena.service.StaffService;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StaffController {

    private static Logger logger = LoggerFactory.getLogger(StaffController.class);

    @Autowired
    StaffService staffService;

    @PutMapping("/")
    public Map addStaff(@RequestParam("address")String address , @RequestBody Staff staff, HttpServletRequest request){
        Map map = new HashMap();
        if(staffService.addStaff(address,staff)){
            request.getSession().setAttribute("staff_id",staff.getStaff_id());
            map.put("msg","success");
        }
        else {
            map.put("msg","failed,don'have this address");
        }

        return map;
    }

    @PostMapping("/")
    public Map updateStaff(@RequestBody Staff staff,HttpServletRequest request){
        Map map = new HashMap();
        int staff_id = staff.getStaff_id();
        logger.info("staff_id"+staff_id);
        staff.setStaff_id(staff_id);
        staffService.updateStaff(staff);
        map.put("msg","success");
        return map;
    }

    @DeleteMapping("/")
    public Map deleteStaff(@RequestBody Staff staff){
        Map map = new HashMap();
        int staff_id = staff.getStaff_id();
        logger.info("staff_id"+staff_id);
        staffService.deleteStaff(staff_id);
        map.put("msg","success");
        return map;
    }
}
