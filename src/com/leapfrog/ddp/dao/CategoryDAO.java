/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ddp.dao;

import com.leapfrog.ddp.entity.Category;
import java.util.List;


/**
 *
 * @author Anil
 */
public interface CategoryDAO {
    int insert(Category c);
    List<Category> getAll();
}
