package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.DonationRepository;

@Service
@AllArgsConstructor
public class DonationService {
    DonationRepository donationRepository;

    public int totalQuantity(){
        return donationRepository.sumQuantity();
    }

    public int numberOfDonations() {
        return donationRepository.findAll().size();
    }
}
