package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.InstitutionService;

import java.util.Collection;


@Controller
@AllArgsConstructor
public class HomeController {
    private InstitutionService institutionService;

@ModelAttribute("institutions")
public Collection<Institution> institutions(){
    return this.institutionService.findAll();
}
    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }
}
