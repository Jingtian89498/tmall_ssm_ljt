package com.ljt.tmall.service;

import com.ljt.tmall.pojo.Category;
import com.ljt.tmall.util.Page;

import java.util.List;

public interface CategoryService {
//    List<Category> list();

    int total();

    List<Category> list(Page page);
}

