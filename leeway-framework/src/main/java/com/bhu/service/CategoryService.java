package com.bhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bhu.domain.ResponseResult;
import com.bhu.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2024-06-20 18:31:39
 */
public interface CategoryService extends IService<Category> {
    ResponseResult getCategoryList();
}
