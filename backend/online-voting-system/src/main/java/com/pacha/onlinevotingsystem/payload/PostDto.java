package com.pacha.onlinevotingsystem.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private long postId;

    private byte[] picture;

    private int likes;

    private int dislikes;
}
