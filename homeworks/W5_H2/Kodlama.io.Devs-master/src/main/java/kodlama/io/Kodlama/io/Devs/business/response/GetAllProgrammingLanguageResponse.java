package kodlama.io.Kodlama.io.Devs.business.response;


import kodlama.io.Kodlama.io.Devs.entity.Tecnology;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllProgrammingLanguageResponse {
    private Long id;
    private String language;

    private List<Tecnology> tecnologies;
}
