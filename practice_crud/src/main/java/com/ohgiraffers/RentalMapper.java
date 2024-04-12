package com.ohgiraffers;

public interface RentalMapper {
    int updateRentalById(UpdateRental updateRental);

    String findRental(int id);

    int registRental(RentalDTO rental);

    int deleteRental(int id);
}
