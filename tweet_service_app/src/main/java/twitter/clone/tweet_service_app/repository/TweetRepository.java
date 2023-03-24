package twitter.clone.tweet_service_app.repository;
import org.springframework.data.repository.CrudRepository;
import twitter.clone.tweet_service_app.Entity.Tweet;

// Repository connects with your DB and enable crud operations
public interface TweetRepository extends CrudRepository<Tweet, String> {
}
