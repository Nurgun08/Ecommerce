package az.itbrains.eccomerce.controllers;

import az.itbrains.eccomerce.controllers.CategoryHomeDTO;
import az.itbrains.eccomerce.repositories.CategoryRepository;
import az.itbrains.eccomerce.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

     private final CategoryService categoryService ;

     public CategoryController(CategoryRepository categoryRepository) {
         this.categoryService = categoryService;
     }

    @GetMapping

    public ResponseEntity<List<CategoryHomeDTO>> getAll(){
    List<CategoryHomeDTO> categoryHomeDTOList = new ArrayList<>();

        return new ResponseEntity<>(categoryHomeDTOList,HttpStatus.OK);
     }
}
