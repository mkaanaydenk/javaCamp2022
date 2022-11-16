package kodlama.io.Kodlama.io.Devs.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
 @JsonManagedReference : alt üst nesneleri belirmek ve api kullanımı sırasında jsondan dönen türün
 sonsuz döngüye girmemesi için
 parent ve child nesneleri belirtmemizi sağlar
 @JsonManagedReference : parent nesneyi işaret eder
 @JsonBackReference     : child nesneyi işaret eder

 alternatif olarak dto design pattern da kullanılabilir.
 */
@Entity
@Table(name = "programmingLanguages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String language;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "programmingLanguage")
    private List<Tecnology> tecnologies;
}
