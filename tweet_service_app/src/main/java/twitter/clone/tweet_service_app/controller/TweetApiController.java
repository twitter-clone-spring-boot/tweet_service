package twitter.clone.tweet_service_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import twitter.clone.tweet_service_app.Entity.Tweet;
import twitter.clone.tweet_service_app.Mappers.TweetMapper;
import twitter.clone.tweet_service_app.repository.TweetRepository;
import twitter.clone.tweet_service_spec.api.TweetApi;
import twitter.clone.tweet_service_spec.model.TweetDTO;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T12:34:07.575007+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.tweetService.base-path:}")
public class TweetApiController implements TweetApi {

    @Autowired
    TweetRepository tweetRepository;

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TweetApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> postTweet(TweetDTO body) {
        Tweet tweet = TweetMapper.INSTANCE.toTweet(body);
        tweetRepository.save(tweet);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity tweetTweetIdGet(String tweetId) {
        Optional<Tweet> tweet = tweetRepository.findById(tweetId);
        if(tweet.isPresent()) {
            TweetDTO tweetDTO = TweetMapper.INSTANCE.toTweetDTO(tweet.get());
            return new ResponseEntity<TweetDTO>(tweetDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<TweetDTO>(HttpStatus.OK);
        }
    }


}
