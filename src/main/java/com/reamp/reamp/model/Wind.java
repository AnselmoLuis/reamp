import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Wind{
    private Long speed;
    private Long deg;
}