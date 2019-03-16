package com.uniandes.catalogo.services;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.uniandes.catalogo.models.ProductoModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoService.class);

	/**
     * This function listens to the notifications sent.
     */
    public List<ProductoModel> getCatalogo() {
        LOGGER.info("Obteniendo Catalogo");
        return this.buildProducto();
    }

    Faker faker = new Faker();

    /**
     * This function listens to the notifications sent.
     */
    private List<ProductoModel> buildProducto() {
        List<ProductoModel> listaProductos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String name = faker.pokemon().name();
            String description = faker.pokemon().location();
            double valor = faker.number().randomDouble(1,1000, 100000);
            listaProductos.add(new ProductoModel(i, name, description, valor));
        }

        return listaProductos;
    }
}