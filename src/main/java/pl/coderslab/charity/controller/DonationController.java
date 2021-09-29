package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.DonationService;

@Controller
@AllArgsConstructor
@RequestMapping("/donation")
public class DonationController {
    private DonationService donationService;
}
