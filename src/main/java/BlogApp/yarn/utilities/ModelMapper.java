package BlogApp.yarn.utilities;

import BlogApp.yarn.data.models.Post;
import BlogApp.yarn.dtomain.dto.requests.CreatePostRequest;
import BlogApp.yarn.dtomain.dto.response.CreatePostReponse;
import BlogApp.yarn.dtomain.dto.response.FindPostResponse;

import java.time.LocalDateTime;

public class ModelMapper {
    public static Post map(CreatePostRequest createPostRequest){
        Post post=new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        post.setTime(LocalDateTime.now());
        return post;

    }
    public static CreatePostReponse map(Post post){
        CreatePostReponse createPostReponse=new CreatePostReponse();
        createPostReponse.setId(post.getId());
        createPostReponse.setTitle(post.getTitle());
        return createPostReponse;
    }

    public static FindPostResponse mapFindPostResponse(Post post){
    FindPostResponse findPostResponse=new FindPostResponse();
    findPostResponse.setBody(post.getBody());
    findPostResponse.setTitle(post.getTitle());
    findPostResponse.setComment(post.getComments());
    findPostResponse.setTime(post.getTime());
    return findPostResponse;
    }
}
