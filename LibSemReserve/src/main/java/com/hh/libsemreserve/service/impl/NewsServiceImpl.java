package com.hh.libsemreserve.service.impl;

import com.hh.libsemreserve.entity.News;
import com.hh.libsemreserve.mapper.NewsMapper;
import com.hh.libsemreserve.service.NewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
