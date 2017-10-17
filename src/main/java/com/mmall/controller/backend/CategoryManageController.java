package com.mmall.controller.backend;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;
import com.mmall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * Created by zhouwx on 2017/10/17
 * intelliJ IDEA
 */
public class CategoryManageController {

    public ServerResponse<Category> addCategoryManage(HttpSession session){
        @Autowired
        private ICategoryService iCategoryService;
    }
}
