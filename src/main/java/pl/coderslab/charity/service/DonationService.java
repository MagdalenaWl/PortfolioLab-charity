package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

@Service
@AllArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public int totalQuantity() {
        return donationRepository.sumQuantity();
    }

    public int numberOfDonations() {
        return donationRepository.findAll().size();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }
}
