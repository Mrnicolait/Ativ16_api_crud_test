package com.example.api_rest.service;

import com.example.api_rest.model.Product;
import com.example.api_rest.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    public ProductServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProductTest() {
        Product product = new Product(1L, "Produto Teste", "Descrição Teste", 100.0, 10);
        when(productRepository.save(product)).thenReturn(product);

        Product createdProduct = productService.createProduct(product);
        assertEquals(product, createdProduct);
    }
}
