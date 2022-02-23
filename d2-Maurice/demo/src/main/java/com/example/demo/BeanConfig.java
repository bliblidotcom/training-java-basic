package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//digunakan ketika class contohnya starwarsMovie berasal dari third party
//sehingga tidak dapat dilakukan perubahan pada class tersebut
//perubahan yang dimaksud adalah penambahan @Component pada bagian atas class
@Configuration
public class BeanConfig {

    @Bean
    public StarwarsMovie beanStarwarsMovie(){
        return new StarwarsMovie();
    }
}
