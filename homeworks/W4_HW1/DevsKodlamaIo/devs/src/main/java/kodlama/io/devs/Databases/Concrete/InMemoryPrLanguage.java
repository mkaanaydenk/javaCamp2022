package kodlama.io.devs.Databases.Concrete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.Databases.Abstract.PrLanguageRepository;
import kodlama.io.devs.Entities.PrLanguage;

@Repository
public class InMemoryPrLanguage implements PrLanguageRepository {

    List<PrLanguage> prlanguages;

    public InMemoryPrLanguage() {
        prlanguages = new ArrayList<PrLanguage>();
        prlanguages.add(new PrLanguage(1, "Java"));
        prlanguages.add(new PrLanguage(2, "C#"));
        prlanguages.add(new PrLanguage(3, "R"));
    }


    @Override
    public List<PrLanguage> getAll() {

        return prlanguages;
    }


    @Override
    public void add(PrLanguage prlanguage) {
        prlanguages.add(prlanguage);

    }


    @Override
    public void delete(PrLanguage prlanguage) {
        prlanguages.remove(prlanguage);

    }


    @Override
    public void update(String languageName, int id) {


    }


    @Override
    public PrLanguage getById(int id) {
        for (PrLanguage lang : prlanguages) {
            if (lang.getId() == id) {
                return lang;
            }
        }
        return null;
    }
}



