import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "OpenWeatherMapService", url = "api.openweathermap.org/data/2.5/weather?q=")
public interface OpenWeatherMapService{
    @RequestMapping("{city}&appid=8364f21edfff8c2278cac289dced1257")
    City getCity(@PathVariable(city) String city);
}