import com.reamp.reamp.model.City;
import com.reamp.reamp.service.OpenWeatherMapService;

@RestController
@AllArgsContructor
@RequestMapping("v1/maping")
public class OpenWeatherMapController {
    private final OpenWeatherMapService openWeatherMapController;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    public City getCity(@PathVariable String city){
        return OpenWeatherMapService.getCity(city);

    }
}