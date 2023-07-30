package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.payload.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getAllComments();
    CommentDto getCommentById(long id);

    CommentDto createComment(CommentDto commentDto);

    CommentDto updateComment(long id, CommentDto commentDto);

    void deleteComment(long id);
}
