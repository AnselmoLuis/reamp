import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public  class Weather{
    private Long id;
    private String main;
    private String description;
    private String icon;
}