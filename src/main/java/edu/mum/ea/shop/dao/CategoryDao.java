package edu.mum.ea.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.ea.shop.domain.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>{
	
	//public Category save(Category cate);
	
	//public List<Category> findAll();
	
	//public void delete(Integer id);

}
