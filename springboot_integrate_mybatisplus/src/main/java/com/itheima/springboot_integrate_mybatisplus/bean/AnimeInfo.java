package com.itheima.springboot_integrate_mybatisplus.bean;

import lombok.Data;
import lombok.Getter;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus.bean
 * CreateTime==>2022-09-26 12:27:37
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */

@Mapper
@Data
public class AnimeInfo {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;

}
