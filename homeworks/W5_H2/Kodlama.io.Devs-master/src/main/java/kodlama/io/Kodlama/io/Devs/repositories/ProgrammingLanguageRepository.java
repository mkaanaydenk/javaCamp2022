package kodlama.io.Kodlama.io.Devs.repositories;

import kodlama.io.Kodlama.io.Devs.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}