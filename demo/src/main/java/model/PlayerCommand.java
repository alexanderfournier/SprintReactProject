package model;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * 
 * @author alexander.fournier
 * 
 * @Component is a specialized version of Compenents are @Service and @Repository
 * I could also define @Scope underneath it like @Scope("prototype")
 * All Components are Spring Beans !
 */




@Component
public class PlayerCommand implements CommandLineRunner{

	
	private final PlayerRepository repository;
	
	
	public PlayerCommand(PlayerRepository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public void run(String... strings) throws Exception {
		
		Stream.of("Aaron Gordan","Derek Rose").forEach(name -> repository.save(new Player(name))
				);
		
		
		repository.findAll().forEach(System.out::println);
		
	}

}
