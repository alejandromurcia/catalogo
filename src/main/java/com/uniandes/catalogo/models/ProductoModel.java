package com.uniandes.catalogo.models;

public class ProductoModel {
        private int id;
        private String name;
        private String description;
        private Double valor;

        public ProductoModel(int id, String name, String description, Double valor) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
            this.valor = valor;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }
    }