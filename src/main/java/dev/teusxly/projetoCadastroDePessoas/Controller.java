package dev.teusxly.projetoCadastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String dizerHolar() {
		return "olá, tudo bem?";
	}
}
