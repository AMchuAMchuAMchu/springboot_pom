package com.itheima.springboot_integrate_ssm.cfg;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_ssm.cfg
 * CreateTime==>2022-09-26 13:55:10
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Configuration
public class Mpcfg {

    @Bean
    public MybatisPlusInterceptor MpInterceptor(){

        MybatisPlusInterceptor mpInterceptor = new MybatisPlusInterceptor();

        mpInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());

        return mpInterceptor;

    }

}
