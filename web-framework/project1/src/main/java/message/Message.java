package message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    @GetMapping("/Welcome")
    public String message()
    {
        return "Hello";
    }
    
}
