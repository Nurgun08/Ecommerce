package az.itbrains.eccomerce.services.impls;

import az.itbrains.eccomerce.repositories.CategoryRepository;
import az.itbrains.eccomerce.services.CategoryService;
import org.springframework.stereotype.Service;
@Service

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository ;


    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
