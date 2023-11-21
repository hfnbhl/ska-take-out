package com.ska.service;

import com.ska.dto.EmployeeLoginDTO;
import com.ska.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
