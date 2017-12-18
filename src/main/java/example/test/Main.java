package example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by wll on 17-12-18.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
