package knoldus.config;

import knoldus.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * The type Repository configuration.
 */
@Configuration
public class RepositoryConfiguration {


    /**
     * Marklogic template home controller . mark logic operations.
     *
     * @param <DatabaseClient> the type parameter
     * @return the home controller . mark logic operations
     */
    @Bean
    public <DatabaseClient> HomeController.MarkLogicOperations marklogicTemplate() {
      DatabaseClient client = newClient("localhost", 8020, new DigestAuthContext("admin", "admin"));
      return new MarkLogicTemplate(client);
        return null;
    }
}
