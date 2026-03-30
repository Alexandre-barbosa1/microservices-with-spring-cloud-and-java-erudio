package br.com.erudio.controllers;

import br.com.erudio.PersonService;
import br.com.erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(value = "/{id}")
    public Person findById(@PathVariable("id") String id) {
        return service.findByid(id);
    }
}
