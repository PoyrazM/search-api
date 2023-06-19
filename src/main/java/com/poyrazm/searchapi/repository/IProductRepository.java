package com.poyrazm.searchapi.repository;

import com.poyrazm.searchapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

//    @Query("SELECT p FROM Product p WHERE " +
//            "p.name LIKE CONCAT('%',:query, '%')" +
//            "OR p.description LIKE CONCAT('%', :query, '%')")
//    List<Product> searchProducts(String query);

    List<Product> searchProductsByNameContains(String name);

}
