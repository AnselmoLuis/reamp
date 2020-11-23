
import javax.annotation.processing.Generated;

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

    /**
     * @return Coord return the coord
     */
    public Coord getCoord() {
        return coord;
    }

    /**
     * @param coord the coord to set
     */
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    /**
     * @return Weather return the weather
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    /**
     * @return String return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return Main return the main
     */
    public Main getMain() {
        return main;
    }

    /**
     * @param main the main to set
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     * @return Long return the visibility
     */
    public Long getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    /**
     * @return Wind return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * @param wind the wind to set
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * @return Clouds return the clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * @return Long return the dt
     */
    public Long getDt() {
        return dt;
    }

    /**
     * @param dt the dt to set
     */
    public void setDt(Long dt) {
        this.dt = dt;
    }

    /**
     * @return Sys return the sys
     */
    public Sys getSys() {
        return sys;
    }

    /**
     * @param sys the sys to set
     */
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Long return the code
     */
    public Long getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Long code) {
        this.code = code;
    }

}