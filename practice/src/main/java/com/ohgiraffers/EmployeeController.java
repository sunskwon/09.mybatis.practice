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

        String job = parameter.get("job");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(lastId + 1);
        employee.setName(parameter.get("name"));
        employee.setNo(parameter.get("no"));
        employee.setEmail(parameter.get("email"));
        employee.setPhone(parameter.get("phone"));

        switch (job) {
            case "대표" : employee.setJobCode("J1"); break;
            case "부사장" : employee.setJobCode("J2"); break;
            case "부장" : employee.setJobCode("J3"); break;
            case "차장" : employee.setJobCode("J4"); break;
            case "과장" : employee.setJobCode("J5"); break;
            case "대리" : employee.setJobCode("J6"); break;
            case "사원" : employee.setJobCode("J7"); break;
            default: employee.setJobCode(""); break;
        }

        employee.setSalLevel(parameter.get("salLevel"));

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

        String job = parameter.get("job");
        switch (job) {
            case "대표" : employee.setJobCode("J1"); break;
            case "부사장" : employee.setJobCode("J2"); break;
            case "부장" : employee.setJobCode("J3"); break;
            case "차장" : employee.setJobCode("J4"); break;
            case "과장" : employee.setJobCode("J5"); break;
            case "대리" : employee.setJobCode("J6"); break;
            case "사원" : employee.setJobCode("J7"); break;
            default: employee.setJobCode(""); break;
        }

        employee.setSalLevel(parameter.get("salLevel"));

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
