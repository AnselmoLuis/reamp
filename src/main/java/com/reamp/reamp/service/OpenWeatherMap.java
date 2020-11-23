import com.reamp.reamp.model.City;

@FeignClient(name = "OpenWeatherMap", url="api.openweathermap.org/data/2.5/weather?q=")
public interface OpenWeatherMapService{

    @RequestMapping("{city}&appid=8364f21edfff8c2278cac289dced1257")
    City getCity(@PathVariable(city) String city);
    }
}