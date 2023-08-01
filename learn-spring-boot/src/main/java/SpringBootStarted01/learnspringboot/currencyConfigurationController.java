package SpringBootStarted01.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class currencyConfigurationController {
    @Autowired
    private currencyServiceConfig config;
    @RequestMapping ("/currency-Configuration")
    public currencyServiceConfig retrieveALl(){
        return config;
    }
}
