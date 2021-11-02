package BlogApp.yarn.controller;


import BlogApp.yarn.services.CommentService;
import BlogApp.yarn.services.CommentServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private final CommentService commentService=new CommentServiceImpl() ;

}
