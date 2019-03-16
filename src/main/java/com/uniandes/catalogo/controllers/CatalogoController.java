package com.uniandes.catalogo.controllers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.uniandes.catalogo.models.ProductoModel;
import com.uniandes.catalogo.services.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * This controller provides the access for the receiver end point
 *
 */
@Controller
@EnableAutoConfiguration
public class CatalogoController {
		
	@Autowired
	private CatalogoService catalogoService;
		
	@RequestMapping(value = "/catalogo", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductoModel> getCatalogo() {
    	return this.catalogoService.getCatalogo();
    }
}