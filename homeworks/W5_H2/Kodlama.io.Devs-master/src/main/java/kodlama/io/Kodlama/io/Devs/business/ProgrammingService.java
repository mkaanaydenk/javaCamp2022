package kodlama.io.Kodlama.io.Devs.business;

import kodlama.io.Kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.entity.ProgrammingLanguage;
import kodlama.io.Kodlama.io.Devs.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgrammingService {
    private ProgrammingLanguageRepository repository;

    @Autowired
    public ProgrammingService(ProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    public List<GetAllProgrammingLanguageResponse> findAll() {

        List<ProgrammingLanguage> findAll = repository.findAll();

        List<GetAllProgrammingLanguageResponse> responseItem = new ArrayList<>();

        for (ProgrammingLanguage language : findAll) {
            GetAllProgrammingLanguageResponse response = new GetAllProgrammingLanguageResponse();
            response.setId(language.getId());
            response.setLanguage(language.getLanguage());
            response.setTecnologies(language.getTecnologies());
            responseItem.add(response);
        }

        return responseItem;
    }

    public CreateProgrammingLanguageRequest save(ProgrammingLanguage programmingLanguage) {

        ProgrammingLanguage save = repository.save(programmingLanguage);

        CreateProgrammingLanguageRequest request = new CreateProgrammingLanguageRequest();

        request.setLanguage(save.getLanguage());

        return request;

    }

    public GetAllProgrammingLanguageResponse findById(long id) {

        Optional<ProgrammingLanguage> findById = repository.findById(id);
        GetAllProgrammingLanguageResponse response = new GetAllProgrammingLanguageResponse();
        if (findById.isPresent()) {
            response.setId(findById.get().getId());
            response.setLanguage(findById.get().getLanguage());
        }

        return response;
    }

    public CreateProgrammingLanguageRequest deleteById(long id) {

        CreateProgrammingLanguageRequest request = new CreateProgrammingLanguageRequest();
        request.setId(id);
        repository.deleteById(request.getId());
        return request;
    }

}
