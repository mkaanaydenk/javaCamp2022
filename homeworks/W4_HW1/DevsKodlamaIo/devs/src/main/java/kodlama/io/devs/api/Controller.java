package kodlama.io.devs.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.Business.Abstract.PrLanguageService;
import kodlama.io.devs.Entities.PrLanguage;

@RestController
@RequestMapping("api/prlanguages")
public class Controller {

    private PrLanguageService languageService;

    public Controller(PrLanguageService languageService) {
        super();
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<PrLanguage> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody PrLanguage prlanguage) throws Exception {
        languageService.add(prlanguage);
    }

}
