package com.ohgiraffers;

import java.sql.Date;

public class ProductAndRentalDTO {

    private int id;
    private String model;
    private String ram;
    private String ssd;
    private String brand;
    private Date productDate;
    private RentalDTO rental;

    public ProductAndRentalDTO() {}

    public ProductAndRentalDTO(int id, String model, String ram, String ssd, String brand, Date productDate, RentalDTO rental) {
        this.id = id;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.productDate = productDate;
        this.rental = rental;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public RentalDTO getRental() {
        return rental;
    }

    public void setRental(RentalDTO rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "ProductAndRentalDTO{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", brand='" + brand + '\'' +
                ", productDate=" + productDate +
                ", rental=" + rental +
                '}';
    }
}
