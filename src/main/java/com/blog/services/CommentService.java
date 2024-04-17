package com.blog.services;

import com.blog.payload.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	Void deleteComment(Integer commentId);
	
}
