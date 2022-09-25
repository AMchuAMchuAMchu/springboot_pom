package com.itheima.springboot_integrate_mybatis;

import com.itheima.springboot_integrate_mybatis.bean.AnimeInfo;
import com.itheima.springboot_integrate_mybatis.dao.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateMybatisApplicationTests {

    @Autowired
    private AnimeService animeService;

    @Test
    void contextLoads() {
        List<AnimeInfo> allAnime = animeService.getAllAnime();

        allAnime.forEach(System.out::println);
    }

}
