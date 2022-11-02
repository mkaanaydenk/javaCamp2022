package kodlama.io.devs.Databases.Abstract;

import java.util.List;

import kodlama.io.devs.Entities.PrLanguage;

public interface PrLanguageRepository {
    List<PrLanguage> getAll();

    void add(PrLanguage prlanguage);

    void delete(PrLanguage prlanguage);


    public void update(String languageName, int id);

    public PrLanguage getById(int id);
}
