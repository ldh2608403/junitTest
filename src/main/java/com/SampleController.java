package com;


import com.dhconfig.SpringContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@RestController
@EnableScheduling
@ServletComponentScan
@SpringBootApplication
//@EnableTransactionManagement
public class SampleController {


    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(SampleController.class);
        application.setRegisterShutdownHook(false);
        application.setBannerMode(Banner.Mode.OFF);
        ApplicationContext applicationContext = application.run(args);
        SpringContextUtil.setApplicationContext(applicationContext);
        LOGGER.info("Service provider started!!!");
    }
}