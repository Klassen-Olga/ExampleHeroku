package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@Controller
public class GreetingController {

    /*    @GetMapping("/greeting")
        public String greetingForm(Model model) {
            model.addAttribute("greeting", new Greeting());
            return "greeting";
        }*/
    @GetMapping("/greeting")
    public String greetingForm(Greeting greeting) {
        return "greeting";
    }

    /*    @PostMapping("/greeting")
        public String greetingSubmit(@ModelAttribute Greeting greeting) {
            if(greeting.getId()<1){
                return "greeting";
            }
            return "result";
        }*/
    @PostMapping("/greeting")
    public String greetingSubmit(@Valid Greeting greeting, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "greeting";
        } else {
            return "result";
        }
    }

    @GetMapping("/greetings")
    public String getGreetings(Model model) {
        List<Greeting> greetings = new LinkedList<>();
        Greeting g = new Greeting(1, "Hello");
        Greeting g1 = new Greeting(2, "Noroc");
        Greeting g2 = new Greeting(3, "Privet");
        greetings.add(g);
        greetings.add(g1);
        greetings.add(g2);
        model.addAttribute("greetings", greetings);
        return "greetings";
    }

}