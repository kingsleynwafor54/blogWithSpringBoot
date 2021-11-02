package BlogApp.yarn.services;

import BlogApp.yarn.data.models.Post;
import BlogApp.yarn.dtomain.dto.requests.CreatePostRequest;
import BlogApp.yarn.dtomain.dto.response.CreatePostReponse;
import BlogApp.yarn.dtomain.dto.response.FindPostResponse;
import BlogApp.yarn.repository.PostRepository;
import BlogApp.yarn.utilities.ModelMapper;

import java.util.Optional;

public class PostServiceImpl implements PostService {
    private final PostRepository repository=new PostRepository();
    @Override
    public CreatePostReponse addPost(CreatePostRequest createPostRequest) {
        Post post= ModelMapper.map(createPostRequest);
        post=repository.save(post);
        return  ModelMapper.map(post);
    }

    @Override
    public FindPostResponse findPostById(Integer id) {
        Optional<Post> post=repository.findById(id);
        if (post.isEmpty())throw new BlogException("post does not exist");
        return  ModelMapper.mapFindPostResponse(post.get());
    }
}
