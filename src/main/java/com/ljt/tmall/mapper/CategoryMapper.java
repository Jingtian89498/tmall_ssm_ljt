package com.ljt.tmall.mapper;

import com.ljt.tmall.pojo.Category;
import com.ljt.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
//    List<Category> list();
    public List<Category> list(Page page);

    public int total();
}

