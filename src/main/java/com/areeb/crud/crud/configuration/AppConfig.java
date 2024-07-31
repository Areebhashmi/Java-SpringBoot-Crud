package com.areeb.crud.crud.configuration;
import com.areeb.crud.crud.devEnvoirment;
import com.areeb.crud.crud.env;
import com.areeb.crud.crud.prodEviroment;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
 @ConditionalOnProperty(name = "mode", havingValue ="production")
    public env getProdEnviromentBeans(){
    return new prodEviroment();
}
    @Bean
    @ConditionalOnProperty(name = "mode", havingValue ="development")
    public env getDevEnviromentBeans(){
        return new devEnvoirment();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
