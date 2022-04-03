package twitter.clone.tweet_service_app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tweet {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String content;
    private String user_id;
    private Date created_at;
    private Date updated_at;
    private Integer total_likes;
    private Integer total_comments;

    public void setId(String id) {
        this.id = id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getTotal_likes() {
        return total_likes;
    }

    public void setTotal_likes(Integer total_likes) {
        this.total_likes = total_likes;
    }

    public Integer getTotal_comments() {
        return total_comments;
    }

    public void setTotal_comments(Integer total_comments) {
        this.total_comments = total_comments;
    }
}
