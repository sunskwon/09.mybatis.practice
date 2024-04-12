package com.ohgiraffers;

import com.sun.tools.jconsole.JConsoleContext;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLOutput;
import java.util.List;

import static com.ohgiraffers.Template.getSqlSession;

public class RentalService {
    public List<ProductAndRentalDTO> selectAll() {

        SqlSession sqlSession = getSqlSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductAndRentalDTO> productList = mapper.selectAll();

        sqlSession.close();

        return productList;
    }

    public List<ProductAndRentalDTO> selectById(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        List<ProductAndRentalDTO> productList = mapper.selectById(searchCriteria);

        sqlSession.close();

        return productList;
    }

    public boolean updateRentalById(UpdateRental updateRental) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper mapper = sqlSession.getMapper(RentalMapper.class);

        int result = mapper.updateRentalById(updateRental);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public String findRental(int id) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper mapper = sqlSession.getMapper(RentalMapper.class);

        String rental = mapper.findRental(id);

        return rental;
    }

    public int findMaxId() {

        SqlSession sqlSession = getSqlSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        int maxId = mapper.findMaxId();

        return maxId;
    }

    public boolean registProduct(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        int result = mapper.registProduct(product);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0? true : false;
    }

    public boolean registRental(RentalDTO rental) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper mapper = sqlSession.getMapper(RentalMapper.class);

        int result = mapper.registRental(rental);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0? true : false;
    }

    public boolean deleteRental(int id) {

        SqlSession sqlSession = getSqlSession();

        RentalMapper mapper = sqlSession.getMapper(RentalMapper.class);

        int result = mapper.deleteRental(id);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0? true : false;
    }

    public boolean deleteProduct(int id) {

        SqlSession sqlSession = getSqlSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        int result = mapper.deleteProduct(id);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0? true : false;
    }
}
