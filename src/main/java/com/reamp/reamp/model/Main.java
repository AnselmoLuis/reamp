import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Main{
    private Long temp;
    private Long pressure;
    private Long humidity;
    private Long temp_min;
    private Long temp_max;
}