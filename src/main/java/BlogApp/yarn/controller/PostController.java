package BlogApp.yarn.controller;

import BlogApp.yarn.dtomain.dto.requests.CreatePostRequest;
import BlogApp.yarn.dtomain.dto.response.CreatePostReponse;
import BlogApp.yarn.dtomain.dto.response.FindPostResponse;
import BlogApp.yarn.services.PostService;
import BlogApp.yarn.services.PostServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {
    private final PostService postService= new PostServiceImpl();
@PostMapping("/api/post")
    public CreatePostReponse addPost(CreatePostRequest createPostRequest){
        return postService.addPost(createPostRequest);
    }
    @GetMapping("/api/post/{id}")
    public FindPostResponse findPostResponse(Integer id){
        return postService.findPostById(id);
    }
}
