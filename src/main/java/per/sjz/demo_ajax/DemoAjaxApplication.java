package per.sjz.demo_ajax;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("per.sjz.demo_ajax.dao")
public class DemoAjaxApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoAjaxApplication.class, args);
    }

}
