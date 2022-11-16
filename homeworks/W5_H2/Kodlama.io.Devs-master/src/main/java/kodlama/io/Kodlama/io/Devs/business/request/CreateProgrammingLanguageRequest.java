package kodlama.io.Kodlama.io.Devs.business.request;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import kodlama.io.Kodlama.io.Devs.entity.Tecnology;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProgrammingLanguageRequest {
    private Long id;
    private String language;
}
