package com.ohgiraffers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RentalController rentalController = new RentalController();

        while (true) {

            System.out.println("===== 노트북 대여 =====");
            System.out.println("1. 전체 목록 조회");
            System.out.println("2. ID로 노트북 조회");
            System.out.println("3. 노트북 대여/반납");
            System.out.println("4. 새 노트북 입력");
            System.out.println("5. 노트북 정보 제거");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : rentalController.selectAll(); break;
                case 2 : rentalController.selectById(inputId()); break;
                case 3 : rentalController.updateRentalById(inputId()); break;
                case 4 : rentalController.registBoth(inputDTO()); break;
                case 5 : rentalController.deleteBoth(inputId()); break;
                case 9 : break;
                default:
                    System.out.println("잘못된 번호입니다.");
            }

            if (no == 9) {
                break;
            }

        }
    }

    private static Map<String, String> inputId() {

        Scanner sc = new Scanner(System.in);

        System.out.print("상품 번호를 입력하세요 : ");

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", sc.nextLine());

        return parameter;
    }

    private static Map<String, String> inputDTO() {

        Scanner sc = new Scanner(System.in);

        Map<String, String> parameter = new HashMap<>();

        System.out.print("노트북 모델을 입력하세요 : ");
        parameter.put("model", sc.nextLine());

        System.out.print("RAM을 입력하세요 : ");
        parameter.put("ram", sc.nextLine());

        System.out.print("SSD를 입력하세요 : ");
        parameter.put("ssd", sc.nextLine());

        System.out.print("제조사를 입력하세요 : ");
        parameter.put("brand", sc.nextLine());

        System.out.print("제조일을 입력하세요 : ");
        parameter.put("productDate", sc.nextLine());

        System.out.print("대여료를 입력하세요 : ");
        parameter.put("price", sc.nextLine());

        return parameter;
    }
}
