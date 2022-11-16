package kodlama.io.Kodlama.io.Devs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
   /* @Autowired
    private TecnologyRepository repository;*/
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
   /*     ProgrammingLanguage programmingLanguage = ProgrammingLanguage.builder()
                .language("Java")
                .build();

        Tecnology tecnology  = Tecnology.builder()
                .tecnologyName("Spring Framework")
                .programmingLanguage(programmingLanguage)
                .build();


        repository.save(tecnology);*/


    }
}
