package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.payload.PostDto;
import com.pacha.onlinevotingsystem.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Override
    public List<PostDto> getAllPosts() {
        return null;
    }

    @Override
    public PostDto getPostById(long id) {
        return null;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public PostDto updatePost(long id, PostDto postDto) {
        return null;
    }

    @Override
    public void deletePost(long id) {

    }
}
