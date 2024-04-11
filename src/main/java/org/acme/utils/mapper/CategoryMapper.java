package org.acme.utils.mapper;

import org.acme.dto.CategoryDTO;
import org.acme.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDTO toDTO(Category category);

    Category toCategory(CategoryDTO categoryDTO);
}
