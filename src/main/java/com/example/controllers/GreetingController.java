package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

/**
 * Created by rdev on 28/01/16.
 */

@Controller
public class GreetingController {

    // @RequestMapping("/greeting")
    @RequestMapping(path = "/greeting}", method = RequestMethod.GET)
    public String greetingGet(@RequestParam(value="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(path = "/greeting}", method = RequestMethod.POST)
    public String greetingPost(@RequestParam(value="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
