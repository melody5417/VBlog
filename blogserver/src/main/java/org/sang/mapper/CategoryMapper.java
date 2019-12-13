package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Category;

import java.util.List;

/**
 * Created by sang on 2017/12/19.
 */
@Mapper
public interface CategoryMapper {
    List<Category> getAllCategories();

    List<String> getAllCateNames();

    int deleteCategoryByIds(@Param("ids") String[] ids);

    int updateCategoryById(Category category);

    int addCategory(Category category);
}
