package twitter.clone.tweet_service_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import twitter.clone.tweet_service_spec.api.TweetApi;
import twitter.clone.tweet_service_spec.model.Tweet;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T12:34:07.575007+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.tweetService.base-path:}")
public class TweetApiController implements TweetApi {

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
    public ResponseEntity tweetTweetIdGet(Integer tweetId) {
        return new ResponseEntity<Tweet>(HttpStatus.OK);
    }

}
