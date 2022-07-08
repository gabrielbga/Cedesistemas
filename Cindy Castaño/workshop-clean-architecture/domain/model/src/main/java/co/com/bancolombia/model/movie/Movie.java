package co.com.bancolombia.model.movie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Movie {
    private String id;
    private String name;
    private String description;
    private Integer duration;
}
