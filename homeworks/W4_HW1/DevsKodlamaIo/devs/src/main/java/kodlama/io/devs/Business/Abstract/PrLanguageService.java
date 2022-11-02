package kodlama.io.devs.Business.Abstract;

import java.util.List;

import kodlama.io.devs.Entities.PrLanguage;

public interface PrLanguageService {
    List<PrLanguage> getAll();

    void add(PrLanguage prlanguage) throws Exception;

    void delete(PrLanguage prlanguage);


    public void update(String languageName, int id);


}
