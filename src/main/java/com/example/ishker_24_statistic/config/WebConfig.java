//package com.example.ishker_24_statistic.config;
//
//import com.example.ishker_24_statistic.utils.StringToLocalDateTimeConverter;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.format.FormatterRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDateTime;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    private final StringToLocalDateTimeConverter stringToLocalDateTimeConverter;
//
//    public WebConfig(StringToLocalDateTimeConverter stringToLocalDateTimeConverter) {
//        this.stringToLocalDateTimeConverter = stringToLocalDateTimeConverter;
//    }
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(stringToLocalDateTimeConverter);
//    }
//}
