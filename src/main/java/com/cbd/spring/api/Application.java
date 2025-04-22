package com.cbd.spring.api;

import com.cbd.spring.api.models.Usuario;
import com.cbd.spring.api.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(UsuarioRepository usuarioRepository) {
		return args -> {
			usuarioRepository.saveAll(List.of(
					new Usuario(null, "Gabriel Silva", "gabriel.silva@email.com", "senha123"),
					new Usuario(null, "Rafaela Souza", "viviane.souza@email.com", "senha123"),
					new Usuario(null, "Lucas Pereira", "lucas.pereira@email.com", "senha123"),
					new Usuario(null, "Mariana Oliveira", "mariana.oliveira@email.com", "senha123"),
					new Usuario(null, "Rafael Costa", "rafael.costa@email.com", "senha123"),
					new Usuario(null, "Amanda Lima", "amanda.lima@email.com", "senha123"),
					new Usuario(null, "Bruno Fernandes", "bruno.fernandes@email.com", "senha123"),
					new Usuario(null, "Juliana Rocha", "juliana.rocha@email.com", "senha123"),
					new Usuario(null, "Felipe Alves", "felipe.alves@email.com", "senha123"),
					new Usuario(null, "Isabela Martins", "isabela.martins@email.com", "senha123"),
					new Usuario(null, "Thiago Ribeiro", "thiago.ribeiro@email.com", "senha123"),
					new Usuario(null, "Camila Cardoso", "camila.cardoso@email.com", "senha123"),
					new Usuario(null, "Diego Mendes", "diego.mendes@email.com", "senha123"),
					new Usuario(null, "Larissa Barbosa", "larissa.barbosa@email.com", "senha123"),
					new Usuario(null, "André Monteiro", "andre.monteiro@email.com", "senha123"),
					new Usuario(null, "Patrícia Moura", "patricia.moura@email.com", "senha123"),
					new Usuario(null, "Renato Castro", "renato.castro@email.com", "senha123"),
					new Usuario(null, "Beatriz Azevedo", "beatriz.azevedo@email.com", "senha123"),
					new Usuario(null, "Eduardo Teixeira", "eduardo.teixeira@email.com", "senha123"),
					new Usuario(null, "Fernanda Batista", "fernanda.batista@email.com", "senha123")
			));


			System.out.println("Usuários iniciais salvos com sucesso!");
		};
	}
}
