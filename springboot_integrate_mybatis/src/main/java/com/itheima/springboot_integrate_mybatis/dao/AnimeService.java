package com.itheima.springboot_integrate_mybatis.dao;

import com.itheima.springboot_integrate_mybatis.bean.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatis.dao
 * CreateTime==>2022-09-25 18:08:43
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Mapper
public interface AnimeService {

    @Select("select * from animeInfo")

    List<AnimeInfo> getAllAnime();

}
