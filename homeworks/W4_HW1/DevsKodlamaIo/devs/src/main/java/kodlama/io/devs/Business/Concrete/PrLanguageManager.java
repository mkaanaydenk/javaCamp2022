package kodlama.io.devs.Business.Concrete;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.Business.Abstract.PrLanguageService;
import kodlama.io.devs.Databases.Abstract.PrLanguageRepository;
import kodlama.io.devs.Entities.PrLanguage;

@Repository
public class PrLanguageManager implements PrLanguageService {
    private PrLanguageRepository languageRepository;


    public PrLanguageManager(PrLanguageRepository languageRepository) {

        this.languageRepository = languageRepository;
    }

    @Override
    public List<PrLanguage> getAll() {
        // TODO Auto-generated method stub
        return languageRepository.getAll();
    }

    @Override
    public void add(PrLanguage prlanguage) throws Exception {
        if (prlanguage.getName().isEmpty()) {
            throw new Exception("Boş geçilemez");
        }

    }

    @Override
    public void delete(PrLanguage prlanguage) {
        if (languageRepository.getAll().contains(prlanguage)) {
            languageRepository.delete(prlanguage);
        } else {
            languageRepository.add(prlanguage);
        }
        return;

    }

    @Override
    public void update(String languageName, int id) {
        // TODO Auto-generated method stub

    }

}
