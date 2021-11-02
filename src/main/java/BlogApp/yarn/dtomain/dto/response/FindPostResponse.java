package BlogApp.yarn.dtomain.dto.response;


import BlogApp.yarn.data.models.Comment;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FindPostResponse {
    private String title;
    private String body;
    private LocalDateTime time;
    private List<Comment> comment;

}
