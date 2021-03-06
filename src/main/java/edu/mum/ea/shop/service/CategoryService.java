package edu.mum.ea.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.ea.shop.dao.CategoryDao;
import edu.mum.ea.shop.domain.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Transactional
	public Category add(Category cate){
		return categoryDao.save(cate);
	}
	
	@Transactional
	public Category get(int id){
		return categoryDao.findOne(id);
	}
	
	@Transactional
	public List<Category> getAll(){
		return categoryDao.findAll();
	}
	
	@Transactional
	public void update(Category cate){
		categoryDao.save(cate);
	}
	
	@Transactional
	public void delete(int id){
		categoryDao.delete(id);
	}
	
	
}
