package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String showPosts(Model model){
        List<Post> posts = new ArrayList<>();
        Post post = new Post();
        post.setTitle("Here is our first new post");
        post.setBody("This is not going to be a very long blog post");
        post.setId(4L);
        posts.add(post);
        Post post2 = new Post();
        post2.setTitle("Here is our second new post");
        post2.setBody("This is not going to be a very long blog post");
        post2.setId(44L);
        posts.add(post2);

        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable long id, Model model) {
        Post post = new Post();
        post.setId(id);
        post.setTitle("Here is post #" + post.getId());
        post.setBody("This is not going to be a very long blog post");
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForm(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

}
