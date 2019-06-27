package cn.evun.microservice.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public String getUserString(@PathVariable("id") Integer id){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://PROVIDER/user/" + id, String.class);
        return forEntity.getBody().toString();
    }
}
