package net.pj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.pj.shoppingbackend.dao.CategoryDAO;
import net.pj.shoppingbackend.dto.Category;

import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<Category>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDescription("This is a laptop");
		category.setImageURL("abc.png");
		categories.add(category);

		// 2
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a mobile");
		category.setImageURL("abc.png");
		categories.add(category);

		// 3
		category = new Category();
		category.setId(3);
		category.setName("LED");
		category.setDescription("This is a LED TV");
		category.setImageURL("abc.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		// enhanced for loop or forEach loop
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}

		return null;

	}

}
