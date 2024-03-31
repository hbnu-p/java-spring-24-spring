package annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 注解配置类
@ComponentScan(basePackages = "annotation")
public class AppConfig {
}
