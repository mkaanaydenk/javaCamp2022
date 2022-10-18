package business;

import dataAccess.ICategoryDao;
import entities.Category;
import loggers.ILogger;

import java.util.ArrayList;

public class CategoryManager {
    ICategoryDao categoryDao;
    ILogger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    ArrayList<Category> categoryArrayList = new ArrayList<>();

    public void add(Category category) throws Exception {

        for (Category categoryy : categoryArrayList) {
            if (category.getCategoryName().equals(categoryy.getCategoryName())) {
                throw new Exception("Böyle bir kategori zaten var");
            }
        }
        categoryArrayList.add(category);
        categoryDao.add(category);

        for (ILogger logger : loggers) {
            logger.log(category.getCategoryName());
        }

    }

}
