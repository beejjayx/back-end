package ProjetoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "ProjetoSpring")
@EntityScan("ProjetoSpring.domain")
@EnableJpaRepositories("ProjetoSpring.repository")
public class SpringBootFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstApplication.class, args);
    }
}
