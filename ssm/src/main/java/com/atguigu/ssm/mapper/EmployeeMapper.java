package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

/**
 * ClassName:EmployeeMapper
 * Author:lxd
 * Date:2023/3/20 18:41
 * Description:
 */
public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
