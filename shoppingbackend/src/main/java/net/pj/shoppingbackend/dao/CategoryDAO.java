package net.pj.shoppingbackend.dao;

import java.util.List;

import net.pj.shoppingbackend.dto.Category;

public interface CategoryDAO {
List<Category> list();
Category get(int id);
}
