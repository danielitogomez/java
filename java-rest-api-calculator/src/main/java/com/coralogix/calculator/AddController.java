package com.coralogix.calculator;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.AddService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddController {

    @Autowired
    private AddService addService;

    @GetMapping(value = "/add/{a}/{b}")
    public Result add(@PathVariable int a, @PathVariable int b) {
        return addService.add(a, b);
    }
}
