package org.example;

import org.example.etc.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileUploadProperties.class
})
public class MyboardApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyboardApplication.class, args);

    }

}
//https://velog.io/@ansalstmd/SPRING-REST-Controller%EB%A5%BC-%ED%86%B5%ED%95%9C-%EA%B2%8C%EC%8B%9C%ED%8C%90-%EA%B8%B0%EB%8A%A5-%EA%B5%AC%ED%98%84#6-%EA%B2%8C%EC%8B%9C%ED%8C%90-%EC%B6%94%EA%B0%80-%EA%B8%B0%EB%8A%A5