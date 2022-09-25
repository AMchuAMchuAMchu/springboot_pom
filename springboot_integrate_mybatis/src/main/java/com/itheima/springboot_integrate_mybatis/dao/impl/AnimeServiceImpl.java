package com.itheima.springboot_integrate_mybatis.dao.impl;

import com.itheima.springboot_integrate_mybatis.bean.AnimeInfo;
import com.itheima.springboot_integrate_mybatis.dao.AnimeService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatis.dao.impl
 * CreateTime==>2022-09-25 20:12:16
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Mapper
public class AnimeServiceImpl implements AnimeService {

    @Override
    public List<AnimeInfo> getAllAnime() {
        return null;
    }
}
