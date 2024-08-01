package pro.sky.Spring_2_11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.Spring_2_11.domen.Basket;

@Configuration  //По ошибке аннотацию @SessionScope сначала поставил сразу после этой аннотации, что вызвало ошибку в S.-В!!!

public class BasketJavaConfig {
    @Bean
    @SessionScope
    public Basket basketConfig() {
        return new Basket();
    }


}
