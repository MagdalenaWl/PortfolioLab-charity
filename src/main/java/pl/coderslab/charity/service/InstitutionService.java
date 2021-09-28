package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.InstitutionRepository;

@Service
@AllArgsConstructor
public class InstitutionService {
    InstitutionRepository institutionRepository;
}
