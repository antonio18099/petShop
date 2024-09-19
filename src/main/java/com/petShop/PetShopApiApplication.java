package com.petShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascotas")
public class PetShopApiApplication {

	@GetMapping("/saludo")
	public String saludar() {
		return "Bienvenido a la tienda de mascotas";
	}

	@GetMapping("/despedida")
	public String despedir() {
		return "Gracias por visitar la tienda de mascotas, ¡vuelve pronto!";
	}
}
