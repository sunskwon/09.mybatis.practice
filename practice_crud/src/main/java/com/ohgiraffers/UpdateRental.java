package com.ohgiraffers;

public class UpdateRental {

    private int id;
    private String rental;

    public UpdateRental() {}

    public UpdateRental(int id, String rental) {
        this.id = id;
        this.rental = rental;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    @Override
    public String toString() {
        return "UpdateRental{" +
                "id=" + id +
                ", rental='" + rental + '\'' +
                '}';
    }
}
