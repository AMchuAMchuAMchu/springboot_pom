package com.itheima.springboot_integrate_mybatisplus02;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService;
import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateMybatisplus02ApplicationTests {

    @Autowired
    private AnimeService animeService;







//    @Test
//    void testQueryWrapperDynamic(){
//
//        LambdaQueryWrapper<AnimeInfo> ailqw = new LambdaQueryWrapper<>();
//
//        String name = "shadow house";
//
//        ailqw.like(Strings.isNotEmpty(name),AnimeInfo::getName,name);
//
//        List<AnimeInfo> animeInfos = animeService.selectList(ailqw);
//
//        animeInfos.forEach(System.out::println);
//
//    }
//
//
//
//    @Test
//    void testWrapperQueryPage(){
//
//        LambdaQueryWrapper<AnimeInfo> ailqw = new LambdaQueryWrapper<>();
//
////        ailqw.like(AnimeInfo::getName,"Lycoris Recoil");
//
//        ailqw.like(AnimeInfo::getCharacter02,"asuna");
//
//        List<AnimeInfo> animeInfos = animeService.selectList(ailqw);
//
//        animeInfos.forEach(System.out::println);
//
//
//    }
//
//
//    @Test
//    void testQueryWrapper(){
//
//        AnimeInfo animeInfo = animeService.selectById(1);
//        System.out.println(animeInfo);
//
//
//    }
//
//    @Test
//    void testWrapperQuery(){
//        Page<AnimeInfo> animeInfoPage = new Page<>(1, 2);
//        LambdaQueryWrapper<AnimeInfo> ailqw = new LambdaQueryWrapper<>();
//        ailqw.like(AnimeInfo::getName,"之");
//        Page<AnimeInfo> animeInfoPage1 = animeService.selectPage(animeInfoPage, ailqw);
//        animeInfoPage1.getRecords().forEach(System.out::println);
//    }
//
//
//    @Test
//    void testPageOne(){
//
//        Page<AnimeInfo> animeInfoPage = new Page<>(2, 3);
//        Page<AnimeInfo> animeInfoPage1 = animeService.selectPage(animeInfoPage, null);
//        animeInfoPage1.getRecords().forEach(System.out::println);
//
//    }
//
//
//    @Test
//    void testSelectAllAnime(){
//
//        List<AnimeInfo> animeInfos = animeService.selectList(null);
//
//        animeInfos.forEach(System.out::println);
//
//    }
//
//
//
//    @Test
//    void contextLoads() {
//
//
//
//    }

}
