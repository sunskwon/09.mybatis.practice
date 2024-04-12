package com.ohgiraffers;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class RentalController {

    private final PrintResult printResult;
    private final RentalService rentalService;

    public RentalController() {
        printResult = new PrintResult();
        rentalService = new RentalService();
    }
    public void selectAll() {

        List<ProductAndRentalDTO> productList = rentalService.selectAll();

        if (productList != null && productList.size() > 0) {
            printResult.printSelectAll(productList);
        } else {
            printResult.printErrorMessage("selectAll");
        }
    }

    public void selectById(Map<String, String> parameter) {

        SearchCriteria searchCriteria = new SearchCriteria();

        if (parameter.get("id") != null && parameter.get("id") != "") {
            searchCriteria.setCondition("id");
            searchCriteria.setValue(parameter.get("id"));
        }

        List<ProductAndRentalDTO> productList = rentalService.selectById(searchCriteria);

        if (productList != null && productList.size() > 0) {
            printResult.printSelectAll(productList);
        } else {
            printResult.printErrorMessage("selectById");
        }
    }

    public void updateRentalById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));
        String rental = rentalService.findRental(id);
        if (rental != null) {

            UpdateRental updateRental = new UpdateRental();
            updateRental.setId(id);
            updateRental.setRental(rental);

            if (rentalService.updateRentalById(updateRental)) {
                printResult.printSuccessMessage("updateRentalById");
            } else {
                printResult.printErrorMessage("updateRentalById");
            }
        } else {
            printResult.printErrorMessage("selectById");
        }
    }

    public void registBoth(Map<String, String> parameter) {

        int maxId = rentalService.findMaxId();

        ProductDTO product = new ProductDTO();
        product.setId(maxId + 1);
        product.setModel(parameter.get("model"));
        product.setRam(parameter.get("ram"));
        product.setSsd(parameter.get("ssd"));
        product.setBrand(parameter.get("brand"));
        product.setProductDate(Date.valueOf(parameter.get("productDate")));

        RentalDTO rental = new RentalDTO();
        rental.setId(maxId + 1);
        rental.setPrice(Integer.parseInt(parameter.get("price")));
        rental.setRental("Y");

        if (rentalService.registProduct(product)) {
            printResult.printSuccessMessage("registProduct");
        } else {
            printResult.printErrorMessage("registProduct");
        }

        if (rentalService.registRental(rental)) {
            printResult.printSuccessMessage("registRental");
        } else {
            printResult.printErrorMessage("registRental");
        }
    }

    public void deleteBoth(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        if (rentalService.deleteRental(id)) {
            printResult.printSuccessMessage("deleteRental");
        } else {
            printResult.printErrorMessage("deleteRental");
        }

        if (rentalService.deleteProduct(id)) {
            printResult.printSuccessMessage("deleteProduct");
        } else {
            printResult.printErrorMessage("deleteProduct");
        }
    }
}
