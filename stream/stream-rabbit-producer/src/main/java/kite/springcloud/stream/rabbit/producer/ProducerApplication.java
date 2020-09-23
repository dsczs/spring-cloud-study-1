package kite.springcloud.stream.rabbit.producer;

import kite.springcloud.common.stream.MyProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * ProducerApplication
 *
 * @author fengzheng
 * @date 2018/12/12
 */

@SpringBootApplication
@EnableBinding(value = {MyProcessor.class})
@Slf4j
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
