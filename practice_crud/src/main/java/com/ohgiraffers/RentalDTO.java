package com.ohgiraffers;

public class RentalDTO {

    private int id;
    private int price;
    private String rental;

    public RentalDTO() {}

    public RentalDTO(int id, int price, String rental) {
        this.id = id;
        this.price = price;
        this.rental = rental;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "RentalDTO{" +
                "id=" + id +
                ", price=" + price +
                ", rental='" + rental + '\'' +
                '}';
    }
}
