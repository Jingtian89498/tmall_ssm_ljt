package com.ljt.tmall.service.impl;

import com.ljt.tmall.mapper.CategoryMapper;
import com.ljt.tmall.pojo.Category;
import com.ljt.tmall.service.CategoryService;
import com.ljt.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
//    public List<Category> list(){
//        return categoryMapper.list();
//    }
    @Override
    public List<Category> list(Page page){
        return categoryMapper.list(page);
    }

    @Override
    public int total(){
        return categoryMapper.total();
    }
}
