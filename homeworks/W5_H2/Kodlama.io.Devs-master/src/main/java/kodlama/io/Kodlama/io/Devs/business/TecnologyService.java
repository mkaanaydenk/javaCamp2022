package kodlama.io.Kodlama.io.Devs.business;

import kodlama.io.Kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.response.GetAllTecnologyResponse;
import kodlama.io.Kodlama.io.Devs.entity.Tecnology;
import kodlama.io.Kodlama.io.Devs.repositories.TecnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TecnologyService {
    private TecnologyRepository repository;

    @Autowired
    public TecnologyService(TecnologyRepository repository) {
        this.repository = repository;
    }

    public List<GetAllTecnologyResponse> findAll() {

        List<Tecnology> findAll = repository.findAll();

        List<GetAllTecnologyResponse> responseItem = new ArrayList<>();

        for (Tecnology tecnology : findAll) {
            GetAllTecnologyResponse response = new GetAllTecnologyResponse();
            response.setTecnologyId(tecnology.getTecnologyId());
            response.setTecnologyName(tecnology.getTecnologyName());
            /*  response.setProgrammingLanguage(tecnology.getProgrammingLanguage());*/
            responseItem.add(response);
        }

        return responseItem;
    }

    public CreateProgrammingLanguageRequest deleteById(long id) {

        CreateProgrammingLanguageRequest request = new CreateProgrammingLanguageRequest();
        request.setId(id);
        repository.deleteById(request.getId());

        return request;
    }
}
