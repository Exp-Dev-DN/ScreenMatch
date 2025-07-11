package br.com.alura.projectzero__one;

import br.com.alura.projectzero__one.model.DadosSerie;
import br.com.alura.projectzero__one.service.ConsumoApi;
import br.com.alura.projectzero__one.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectzeroOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectzeroOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=af7e489e");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
