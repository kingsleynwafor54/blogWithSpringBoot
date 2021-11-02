package BlogApp.yarn.services;

import BlogApp.yarn.dtomain.dto.requests.CreatePostRequest;
import BlogApp.yarn.dtomain.dto.response.CreatePostReponse;
import BlogApp.yarn.dtomain.dto.response.FindPostResponse;

public interface PostService {

    CreatePostReponse addPost(CreatePostRequest createPostRequest);

    FindPostResponse findPostById(Integer id);
}
