package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("/donation")
public class DonationController {
    private final DonationService donationService;
    private final InstitutionService institutionService;
    private final CategoryService categoryService;

    @ModelAttribute("institutions")
    public Collection<Institution> institutions() {
        return this.institutionService.findAll();
    }

    @ModelAttribute("categories")
    public Collection<Category> categories() {
        return this.categoryService.findAll();
    }

    @RequestMapping("")
    public String donationForm(Model model) {
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @PostMapping("")
    public String checkDonation(@Valid Donation donation, BindingResult result, @RequestParam int[] categories) {
        log.info(donation.toString());
        log.info(Arrays.stream(categories).mapToObj(n -> n + "").collect(Collectors.joining(", ")));
        return "redirect:/";
    }
}
