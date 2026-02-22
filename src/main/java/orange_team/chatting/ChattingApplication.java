package orange_team.chatting;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import orange_team.chatting.DomainObjects.Poster;
import orange_team.chatting.DomainObjects.Repositorys.PosterRepo;

@SpringBootApplication
@RestController
public class ChattingApplication {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger("ChattingApplication");
	public static void main(String[] args) {
		SpringApplication.run(ChattingApplication.class, args);
	}
	@Bean
	public CommandLineRunner fakeStartup(PosterRepo repo)
	{
		return (args) -> {
			try{

				repo.save(new Poster("Mariano_93", "Mari", "ju1eo3x", "marian@hotmail.com"));
				repo.save(new Poster("Joaquin", "Joaq", "jge113", null));
				repo.save(new Poster("Juliano", "Jumi", "humowenbpo91803", "jul13lc4p0@gmail.com"));
			}catch ( Error e) {
				logger.error("the commited mistake was ".concat(e.getMessage()));
			}
			logger.info("All the posters for now are");
			logger.info("---------------------------");
			 
			repo.findAll().forEach(poster -> {
				logger.info(poster.toString());
			});
			logger.info("");
		};
	}
}
