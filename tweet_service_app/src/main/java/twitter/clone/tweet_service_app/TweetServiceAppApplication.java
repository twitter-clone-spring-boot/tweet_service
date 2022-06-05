package twitter.clone.tweet_service_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class  TweetServiceAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TweetServiceAppApplication.class, args);
	}

}
