import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sys{
    private Long type;
    private Long id;
    private String message ;
    private String country;
    private Long sunrise;
    private Long sunset;
}