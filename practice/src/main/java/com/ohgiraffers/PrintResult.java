package com.ohgiraffers;

import java.util.List;

public class PrintResult {

    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        for (EmployeeDTO employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "사원 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "사원 조회를 실패했습니다."; break;
            case "regist" : errorMessage = "신규 사원 등록을 실패했습니다."; break;
            case "modify" : errorMessage = "사원 정보 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "사원 정보 삭제를 실패했습니다."; break;
            default: errorMessage = "알 수 없는 에러가 발생했습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printEmployee(EmployeeDTO employee) {

        System.out.println(employee);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "regist" : successMessage = "신규 사원 등록을 성공했습니다."; break;
            case "modify" : successMessage = "사원 정보 수정을 성공했습니다."; break;
            case "delete" : successMessage = "사원 정보 삭제를 성공했습니다."; break;
            default: successMessage = "알 수 없는 결과가 발생했습니다."; break;
        }

        System.out.println(successMessage);
    }
}
