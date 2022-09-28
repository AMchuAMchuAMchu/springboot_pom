package com.itheima.springboot_integrate_mybatisplus02.controller;

import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeInfoService;
import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService02;
import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.controller
 * CreateTime==>2022-09-28 08:03:33
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@RestController
@RequestMapping("/animeInfo")
public class AnimeInfoController {

    @Autowired
    private AnimeInfoService animeInfoService;

    @Autowired
    private AnimeService02 animeService02;


    @GetMapping
    public List<AnimeInfo> testGetAllAnimeInfo(){
        List<AnimeInfo> allAnimeInfo = animeInfoService.getAllAnimeInfo();
        allAnimeInfo.forEach(System.out::println);
        return allAnimeInfo;
    }

    @PutMapping
    public boolean testUpdate(){
        AnimeInfo animeInfo = new AnimeInfo("Lycoris Recoil", 2022, "锦木千束安济知佳", "井之上泷奈若山诗音", 1);
        boolean modify = animeService02.modify(animeInfo);
        System.out.println("testUpdate::"+modify);
        return modify;

    }

    @DeleteMapping
    public boolean testDelete(){

        boolean b = animeInfoService.deleteById(8);
        System.out.println("testDelete::"+b);
        return b;


    }

    @PostMapping
    public boolean testInsert(){

        AnimeInfo animeInfo = new AnimeInfo("魔女之旅", 2020, "伊蕾娜本渡枫", "沙耶黑泽朋世", 14);
        boolean b = animeInfoService.saveAnimeInfo(animeInfo);
        System.out.println("testInsert::"+b);
        return b;
    }





}
