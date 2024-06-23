package com.bhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bhu.domain.ResponseResult;
import com.bhu.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
