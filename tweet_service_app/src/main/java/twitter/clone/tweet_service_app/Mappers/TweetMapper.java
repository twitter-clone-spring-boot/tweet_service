package twitter.clone.tweet_service_app.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import twitter.clone.tweet_service_app.Entity.Tweet;
import twitter.clone.tweet_service_spec.model.TweetDTO;

@Mapper
public interface TweetMapper {
    TweetMapper INSTANCE = Mappers.getMapper( TweetMapper.class );
    TweetDTO toTweetDTO(Tweet tweet);

    Tweet toTweet(TweetDTO tweetDTO);
}
