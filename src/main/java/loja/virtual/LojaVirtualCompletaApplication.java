package loja.virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "LojaVirtualCompletaApplication.model")
public class
LojaVirtualCompletaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualCompletaApplication.class, args);
	}

}
