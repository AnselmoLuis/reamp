import lombok.Setter;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Coord{
    private Long lon;
    private Long lat;
}
