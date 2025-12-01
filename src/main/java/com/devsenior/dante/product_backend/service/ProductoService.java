package com.devsenior.dante.product_backend.service;

import com.devsenior.dante.product_backend.entity.Producto;
import com.devsenior.dante.product_backend.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Encontrar todos los productos
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    // Encontrar un producto por ID
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    // Guardar un producto
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    // Eliminar un producto por ID
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}

