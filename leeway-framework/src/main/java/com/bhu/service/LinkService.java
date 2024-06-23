package com.bhu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bhu.domain.ResponseResult;
import com.bhu.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2024-06-23 16:58:32
 */
public interface LinkService extends IService<Link> {
    ResponseResult getAllLink();
}
