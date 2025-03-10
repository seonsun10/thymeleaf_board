//package com.sw.thymeleafboard.config;
//
//import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.web.servlet.ViewResolver;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring6.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//
//
///**
// * TyhmeleafConfig 설정 파일
// */
//@Configuration
//public class TyhmeleafConfig {
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//        SpringResourceTemplateResolver  templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setPrefix("classpath:/WEB-INF/views/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        templateResolver.setCharacterEncoding("UTF-8");
//        templateResolver.setCacheable(false); // 캐시 사용 X(사용시 html 수정시 서버 재기동)
//        return templateResolver;
//    }
//
//    /**
//     * th:replace, th:insert, th:include 사용을 위한 설정
//     * @return
//     */
//    @Bean
//    public LayoutDialect layoutDialect() {
//        return new LayoutDialect();
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver()); // 앞서 정의한 templateResolver 사용
//        templateEngine.setEnableSpringELCompiler(true); // Spring EL 사용 ${}
//        templateEngine.addDialect(layoutDialect()); // layoutDialect 사용
//        // templateEngine.setTemplateEngineMessageSource(messageSource()); // property 파일의 값(메세지)을 사용할 경우
//        // templateEngine.addDialect(new SpringSecurityDialect());
//
//        return templateEngine;
//    }
//
//    @Bean
//    public ViewResolver thymeleafViewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//        viewResolver.setOrder(1);
//        return viewResolver;
//    }
//}
