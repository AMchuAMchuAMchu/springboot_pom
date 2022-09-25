package com.itheima.springboot_integrate_mybatis.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatis.bean
 * CreateTime==>2022-09-25 18:11:13
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Component
public class AnimeInfo implements Serializable {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;


    @Override
    public String toString() {
        return "AnimeInfo{" +
                "name='" + name + '\'' +
                ", releaseTime=" + releaseTime +
                ", character01='" + character01 + '\'' +
                ", character02='" + character02 + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCharacter01() {
        return character01;
    }

    public void setCharacter01(String character01) {
        this.character01 = character01;
    }

    public String getCharacter02() {
        return character02;
    }

    public void setCharacter02(String character02) {
        this.character02 = character02;
    }
}
