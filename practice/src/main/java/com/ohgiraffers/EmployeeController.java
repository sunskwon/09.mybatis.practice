package com.ohgiraffers;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {

        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(int id) {

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        int lastId = employeeService.findLastId();

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(lastId + 1);
        employee.setName(parameter.get("name"));
        employee.setNo(parameter.get("no"));
        employee.setEmail(parameter.get("email"));
        employee.setPhone(parameter.get("phone"));

        if (employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("regist");
        } else {
            printResult.printErrorMessage("regist");
        }
    }

    public void modifyEmployee(Map<String, String> parameter) {

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(Integer.parseInt(parameter.get("id")));
        employee.setName(parameter.get("name"));
        employee.setNo(parameter.get("no"));
        employee.setEmail(parameter.get("email"));
        employee.setPhone(parameter.get("phone"));

        if (employeeService.modifyEmployee(employee)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }
    }

    public void deleteEmployee(int id) {

        if (employeeService.deleteEmployee(id)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
