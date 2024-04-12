package com.ohgiraffers;

import java.util.List;

public class PrintResult {
    public void printSelectAll(List<ProductAndRentalDTO> productList) {

        for (ProductAndRentalDTO product : productList) {
            System.out.println(product);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectAll" :
                System.out.println("목록 조회에 실패했습니다."); break;
            case "selectById" :
                System.out.println("제품 조회에 실패했습니다."); break;
            case "updateRentalById" :
                System.out.println("제품 대여(반납)에 실패했습니다."); break;
            case "registProduct" :
                System.out.println("제품 추가에 실패했습니다."); break;
            case "registRental" :
                System.out.println("대여 목록 추가에 실패했습니다."); break;
            case "deleteRental" :
                System.out.println("대여 목록 삭제에 실패했습니다."); break;
            case "deleteProduct" :
                System.out.println("제품 삭제에 실패했습니다."); break;
            default:
                System.out.println("알 수 없는 에러가 발생했습니다."); break;
        }
    }

    public void printSelectById(ProductAndRentalDTO product) {

        System.out.println(product);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "updateRentalById" :
                System.out.println("제품 대여(반납)에 성공했습니다."); break;
            case "registProduct" :
                System.out.println("제품 추가에 성공했습니다."); break;
            case "registRental" :
                System.out.println("대여 목록 추가에 성공했습니다."); break;
            case "deleteRental" :
                System.out.println("대여 목록 삭제에 성공했습니다."); break;
            case "deleteProduct" :
                System.out.println("제품 삭제에 성공했습니다."); break;
            default:
                System.out.println("알 수 없는 응답이 발생했습니다."); break;
        }
    }
}
