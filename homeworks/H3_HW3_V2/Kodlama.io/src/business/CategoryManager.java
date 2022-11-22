package business;

import core.Logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao;
    List<Category> categories;
    List<Logger>loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories,  List<Logger>loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {

        categoryControl(category.getCategoryName());
        categories.add(category);
        categoryDao.add(category);
        log(category);


    }

    private void categoryControl(String categoryName) throws Exception {

        for (Category category : categories) {
            if (category.getCategoryName().equals(categoryName)) {
                throw new Exception("Böyle bir kategori zaten var");
            }
        }

    }

    private void log(Category category) {
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
