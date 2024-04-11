package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.CategoryDTO;
import org.acme.service.CategoryService;

import java.util.List;

@Path("/category")
public class CategoryController {

    @Inject
    CategoryService categoryService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        return categoryService.saveCategory(categoryDTO);
    }
}
