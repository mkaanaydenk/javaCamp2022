package kodlama.io.Kodlama.io.Devs.repositories;

import kodlama.io.Kodlama.io.Devs.entity.Tecnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologyRepository extends JpaRepository<Tecnology, Long> {
}