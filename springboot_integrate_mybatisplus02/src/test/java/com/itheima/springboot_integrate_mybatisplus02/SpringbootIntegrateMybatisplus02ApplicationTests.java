package com.itheima.springboot_integrate_mybatisplus02;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeInfoService;
import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService;
import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService02;
import com.itheima.springboot_integrate_mybatisplus02.dao.impl.AnimeInfoServiceImpl;
import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateMybatisplus02ApplicationTests {


    @Autowired
    private AnimeService02 animeService02;


    @Test
    void get(){
        AnimeInfo animeInfo = animeService02.get(1);
        System.out.println("get::"+animeInfo);
    }



    @Test
    void modify(){

        AnimeInfo animeInfo = new AnimeInfo("shadow house", 2020, "艾米丽可", "凯特Emilico", 2);
        boolean modify = animeService02.modify(animeInfo);
        System.out.println("modify::"+modify);

    }


    @Test
    void insert(){


        AnimeInfo animeInfo = new AnimeInfo("SPYxFamily", 2022, "约尔福杰", "约尔劳埃德", 13);
        boolean insert = animeService02.insert(animeInfo);

        System.out.println("insert::"+insert);

    }

    @Test
    void delete(){

        boolean delete = animeService02.delete(12);
        System.out.println("delete::"+delete);


    }


//    @Autowired
//    private AnimeInfoService animeInfoService;
//
//
//    @Test
//    void getAnimeInfoByPage(){
//
//        IPage<AnimeInfo> animeInfoByPage = animeInfoService.getAnimeInfoByPage(2, 4);
//
//        System.out.print("getAnimeInfoByPage::");
//
//        List<AnimeInfo> records = animeInfoByPage.getRecords();
//
//        records.forEach(System.out::println);
//
//
//    }
//
//    @Test
//    void getAllAnimeInfo(){
//
//        List<AnimeInfo> allAnimeInfo = animeInfoService.getAllAnimeInfo();
//
//        System.out.print("getAllAnimeInfo::");
//
//        allAnimeInfo.forEach(System.out::println);
//
//    }
//
//
//    @Test
//    void getAnimeInfoById(){
//
//        AnimeInfo animeInfoById = animeInfoService.getAnimeInfoById(1);
//        System.out.println("getAnimeInfoById::"+animeInfoById);
//
//    }
//
//    @Test
//    void updateById(){
//        AnimeInfo animeInfo = new AnimeInfo();
//        animeInfo.setCharacter01("锦木千束LycoReco");
//        boolean b = animeInfoService.updateByAnimeInfo(animeInfo);
//        System.out.println("updateById::"+b);
//
//
//    }
//
//
//    @Test
//    void deleteById(){
//
//        boolean b = animeInfoService.deleteById(10);
//        System.out.println("deleteById::"+b);
//
//    }
//
//
//
//    @Test
//    void saveAnimeInfo(){
//
//        AnimeInfo animeInfo = new AnimeInfo();
//        animeInfo.setName("终末的女武神");
//        animeInfo.setReleaseTime(2021);
//        animeInfo.setCharacter01("布仑希尔德");
//        animeInfo.setCharacter02("格蕾");
//        animeInfo.setId(12);
//
//        boolean b = animeInfoService.saveAnimeInfo(animeInfo);
//
//        System.out.println("saveAnimeInfo::"+b);
//
//
//    }




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
