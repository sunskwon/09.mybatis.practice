package com.ohgiraffers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        while (true) {
            System.out.println("===== 메뉴 관리 =====");
            System.out.println("1. 사원 전체 조회");
            System.out.println("2. 사원 번호로 사원 조회");
            System.out.println("3. 신규 사원 추가");
            System.out.println("4. 사원 수정");
            System.out.println("5. 사원 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : employeeController.selectAllEmployee(); break;
                case 2 : employeeController.selectEmployeeById(inputEmployeeId()); break;
                case 3 : employeeController.registEmployee(inputEmployee()); break;
                case 4 : employeeController.modifyEmployee(inputModify()); break;
                case 5 : employeeController.deleteEmployee(inputEmployeeId()); break;
                case 9 :
                    System.out.println("종료합니다."); break;
            }

            if (no == 9) {
                break;
            }
        }
    }

    private static int inputEmployeeId() {

        Scanner sc = new Scanner(System.in);

        System.out.print("사원 코드를 입력하세요 : ");

        return sc.nextInt();
    }

    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("사원의 이름을 입력하세요(필수) : ");
        String name = sc.nextLine();

        System.out.print("사원의 주민등록번호를 입력하세요(필수) : ");
        String no = sc.nextLine();

        System.out.print("사원의 email 주소를 입력하세요 : ");
        String email = sc.nextLine();

        System.out.print("사원의 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();

        System.out.print("사원의 직급을 입력하세요(대표, 부사장, 부장, 차장, 과장, 대리, 사원) : ");
        String job = sc.nextLine();

        System.out.print("사원의 급여등급을 입력하세요(S1 ~ S6) : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("job", job);
        parameter.put("salLevel", salLevel);

        return parameter;
    }

    private static Map<String, String> inputModify() {

        Scanner sc = new Scanner(System.in);

        Map<String, String> parameter = new HashMap<>();

        System.out.print("사원의 번호를 입력하세요 : ");
        parameter.put("id", sc.nextLine());

        System.out.print("사원의 이름을 입력하세요 : ");
        parameter.put("name", sc.nextLine());

        System.out.print("사원의 주민등록번호를 입력하세요 : ");
        parameter.put("no", sc.nextLine());

        System.out.print("사원의 email 주소를 입력하세요 : ");
        parameter.put("email", sc.nextLine());

        System.out.print("사원의 전화번호를 입력하세요 : ");
        parameter.put("phone", sc.nextLine());

        System.out.print("사원의 직급을 입력하세요(대표, 부사장, 부장, 차장, 과장, 대리, 사원) : ");
        parameter.put("job", sc.nextLine());

        System.out.print("사원의 급여등급을 입력하세요(S1 ~ S6) : ");
        parameter.put("salLevel", sc.nextLine());

        return parameter;
    }
}
