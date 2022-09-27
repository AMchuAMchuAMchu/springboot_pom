package com.itheima.springboot_integrate_mybatisplus02;

import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService;
import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateMybatisplus02ApplicationTests {

    @Autowired
    private AnimeService animeService;

    @Test
    void testSelectAllAnime(){

        List<AnimeInfo> animeInfos = animeService.selectList(null);

        animeInfos.forEach(System.out::println);

    }



    @Test
    void contextLoads() {



    }

}
