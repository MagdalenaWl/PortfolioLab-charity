package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.Collection;

@Controller
@AllArgsConstructor
@RequestMapping("/donation")
public class DonationController {
    private DonationService donationService;
    private InstitutionService institutionService;
    private CategoryService categoryService;

    @ModelAttribute("institutions")
    public Collection<Institution> institutions() {
        return this.institutionService.findAll();
    }

    @ModelAttribute("categories")
    public Collection<Category> categories() {
        return this.categoryService.findAll();
    }
}
