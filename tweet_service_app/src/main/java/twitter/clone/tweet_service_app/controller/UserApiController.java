package twitter.clone.tweet_service_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import twitter.clone.tweet_service_spec.api.UserApi;
import twitter.clone.tweet_service_spec.model.User;

import java.util.Optional;

@Controller
@RequestMapping
public class UserApiController implements UserApi {

    private final NativeWebRequest request;

    @Autowired
    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<User> getUserByName (String username) {
        User user = new User();
        user.setEmail("ddd");
        user.setFirstName("Jack");

        return ResponseEntity.ok(user);
    }

}
