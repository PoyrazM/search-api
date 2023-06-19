package com.poyrazm.searchapi.servicelayer;

import com.poyrazm.searchapi.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}

