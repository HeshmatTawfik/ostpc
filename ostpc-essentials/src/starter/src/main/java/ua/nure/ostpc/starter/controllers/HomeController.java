package ua.nure.ostpc.starter.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.nure.ostpc.starter.entities.User;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/hello/{parameter1}/{parameter2}", method = RequestMethod.GET)
    public User helloRequest(@PathVariable(name = "parameter1") String mohammad,
                             @PathVariable(name = "parameter2") String ali ) {
        return new User(mohammad, ali);
    }
}
