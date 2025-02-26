package com.golu.config;

import com.golu.beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.golu"})
public class AppConfig {

    @Bean("cartService1")
    public CartService getCartService() {
        return new CartService();
    }
}
