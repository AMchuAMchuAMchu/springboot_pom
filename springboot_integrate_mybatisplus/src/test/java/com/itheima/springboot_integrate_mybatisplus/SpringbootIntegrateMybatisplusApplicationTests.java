package com.itheima.springboot_integrate_mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.springboot_integrate_mybatisplus.bean.AnimeInfo;
import com.itheima.springboot_integrate_mybatisplus.dao.AnimeInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootIntegrateMybatisplusApplicationTests {


    @Autowired
    private AnimeInfoService animeInfoService;



    @Test
    void contextLoads() {

        List<AnimeInfo> animeInfos = animeInfoService.selectList(null);

        animeInfos.forEach(System.out::println);

    }

}
