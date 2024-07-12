package com.cursospringboot.userinformation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simpleproject")
public class controller {


    @GetMapping({"/{name}/{lang}", "/{name}/{lang}/{from}"})
    public String welcome(
            @PathVariable String name,
            @PathVariable String lang,
            @PathVariable(required = false) String from,
            Model model) {

        if (from == null) {
            from = "Unknown";
        }

        model.addAttribute("name", name);
        model.addAttribute("lang", lang);
        model.addAttribute("from", from);


        return "greeting";
    }


}
