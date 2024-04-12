package project1.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    @PostMapping(path = "/insert", consumes="applicatin/json")
    public Medicine getMedicine() 
    
}
