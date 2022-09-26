package com.itheima.springboot_integrate_ssm.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_ssm.pojo
 * CreateTime==>2022-09-26 13:22:00
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
