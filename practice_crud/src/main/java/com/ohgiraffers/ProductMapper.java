package com.ohgiraffers;

import java.util.List;

public interface ProductMapper {
    List<ProductAndRentalDTO> selectAll();

    List<ProductAndRentalDTO> selectById(SearchCriteria searchCriteria);

    int findMaxId();

    int registProduct(ProductDTO product);

    int deleteProduct(int id);
}
