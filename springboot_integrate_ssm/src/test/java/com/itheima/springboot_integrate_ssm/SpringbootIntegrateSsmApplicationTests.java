package com.itheima.springboot_integrate_ssm;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.springboot_integrate_ssm.dao.AnimeInfoService;
import com.itheima.springboot_integrate_ssm.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateSsmApplicationTests {

    @Autowired
    private AnimeInfoService animeInfoService;



    @Test
    void testPage(){

        Page page = new Page(3, 3);

        Page page1 = animeInfoService.selectPage(page, null);

//        page1.getRecords().forEach(System.out::println);


    }

    @Test
    void insertAnime(){
        AnimeInfo animeInfo01 = new AnimeInfo();
        AnimeInfo animeInfo02 = new AnimeInfo();

        animeInfo01.setName("契约之吻");
        animeInfo01.setReleaseTime(2022);
        animeInfo01.setCharacter01("修");
        animeInfo01.setCharacter02("木更");

        animeInfo02.setName("彻夜之歌");
        animeInfo02.setReleaseTime(2022);
        animeInfo02.setCharacter01("夜守光");
        animeInfo02.setCharacter02("七草荠");

        int insert01 = animeInfoService.insert(animeInfo01);
        int insert02 = animeInfoService.insert(animeInfo02);

        System.out.println(insert01);
        System.out.println(insert02);

    }

    @Test
    void contextLoads() {

        List<AnimeInfo> animeInfos = animeInfoService.selectList(null);
//        animeInfos.forEach(System.out::println);

    }

}
