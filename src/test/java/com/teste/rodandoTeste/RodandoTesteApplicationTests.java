package com.teste.rodandoTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RodandoTesteApplicationTests {

	@Test
	void validandoCPFValido() {
		var verdadeiro = ValidadorCpf.validar("615.284.680-31");
		assertEquals(true, verdadeiro);
	}

}
