package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.CategoryRepository;

@Service
@AllArgsConstructor
public class CategoryService {
    CategoryRepository categoryRepository;
}
