package com.ljt.tmall.mapper;

import com.ljt.tmall.pojo.Category;
import com.ljt.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
//    List<Category> list();
    List<Category> list(Page page);

    int total();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}

