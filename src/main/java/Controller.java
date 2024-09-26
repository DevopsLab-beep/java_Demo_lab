import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lab/home")
public class Controller {

    @GetMapping
    private String home() {
        
        return "This is home page. By Team 43-47";
    }
}
