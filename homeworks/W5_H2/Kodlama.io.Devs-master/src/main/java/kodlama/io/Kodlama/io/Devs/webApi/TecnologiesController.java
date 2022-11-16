package kodlama.io.Kodlama.io.Devs.webApi;

import kodlama.io.Kodlama.io.Devs.business.TecnologyService;
import kodlama.io.Kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.response.GetAllTecnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/tecnologies")
public class TecnologiesController {

    private TecnologyService tecnologyService;

    @Autowired
    public TecnologiesController(TecnologyService tecnologyService) {
        this.tecnologyService = tecnologyService;
    }

    @GetMapping ("/findall")
    public List<GetAllTecnologyResponse> findAll() {
        return tecnologyService.findAll();
    }

    @DeleteMapping ("/deleteById/{id}")
    public CreateProgrammingLanguageRequest deleteById(@PathVariable("id") long id) {
        return tecnologyService.deleteById(id);
    }
}
