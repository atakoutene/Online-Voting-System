package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.payload.CommentDto;
import com.pacha.onlinevotingsystem.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public List<CommentDto> getAllComments() {
        return null;
    }

    @Override
    public CommentDto getCommentById(long id) {
        return null;
    }

    @Override
    public CommentDto createComment(CommentDto commentDto) {
        return null;
    }

    @Override
    public CommentDto updateComment(long id, CommentDto commentDto) {
        return null;
    }

    @Override
    public void deleteComment(long id) {

    }
}
