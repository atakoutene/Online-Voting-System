package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.payload.PersonDto;
import com.pacha.onlinevotingsystem.payload.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPosts();
    PostDto getPostById(long id);

    PostDto createPost(PostDto postDto);

    PostDto updatePost(long id, PostDto postDto);

    void deletePost(long id);
}
