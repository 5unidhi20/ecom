package com.capstone.ecom.services.customer;

import com.capstone.ecom.dto.ProductDto;
import com.capstone.ecom.entity.Product;
import com.capstone.ecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerProductServiceImpl implements  CustomerProductService {
    private final ProductRepository productRepository;

    public CustomerProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }
}
