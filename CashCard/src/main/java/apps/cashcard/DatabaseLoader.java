package apps.cashcard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader {
    public static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase (CashCardRepository cashCardRepository){
        return args -> {

            //Create two cashcards
            CashCard cardOne = new CashCard(20L, 2500.10);
            CashCard cardTwo = new CashCard(21L, 2000.50);


            //Save authorOne to the Author entity
            cashCardRepository.save(cardOne);
            cashCardRepository.save(cardTwo);


            //Log the card entry
            cashCardRepository.findAll().forEach(card -> log.info("Preloaded card: " + card.getId()));
        };
    }

}
