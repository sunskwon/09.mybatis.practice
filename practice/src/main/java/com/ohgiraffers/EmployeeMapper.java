package com.ohgiraffers;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int findLastId();

    int registEmployee(EmployeeDTO employee);

    int modifyEmployee(EmployeeDTO employee);

    int deleteEmployee(int id);
}
