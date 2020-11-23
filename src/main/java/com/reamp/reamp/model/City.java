import java.io.Serializable;

import javax.annotation.processing.Generated;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
public  class City{
    private Coord coord ;
    private Weather weather;
    private String base;
    private Main main;
    private Long visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private Sys sys;
    private Long id;
    private String name;
    private Long code;
}