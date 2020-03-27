package semifir.cinexo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import semifir.cinexo.services.FilmService;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext contexte = SpringApplication.run(App.class, args);
		

	}
}
