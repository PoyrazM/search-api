package com.poyrazm.searchapi.servicelayer.impl;

import com.poyrazm.searchapi.entity.Product;
import com.poyrazm.searchapi.repository.IProductRepository;
import com.poyrazm.searchapi.servicelayer.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProductsByNameContains(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
