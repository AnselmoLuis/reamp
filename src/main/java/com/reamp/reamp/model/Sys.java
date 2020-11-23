
public class Sys{
    private Long type;
    private Long id;
    private String message ;
    private String country;
    private Long sunrise;
    private Long sunset;

    /**
     * @return Long return the type
     */
    public Long getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Long type) {
        this.type = type;
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
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return Long return the sunrise
     */
    public Long getSunrise() {
        return sunrise;
    }

    /**
     * @param sunrise the sunrise to set
     */
    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * @return Long return the sunset
     */
    public Long getSunset() {
        return sunset;
    }

    /**
     * @param sunset the sunset to set
     */
    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }

}