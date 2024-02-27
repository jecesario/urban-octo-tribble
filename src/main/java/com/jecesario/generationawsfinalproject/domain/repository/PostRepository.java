package com.jecesario.generationawsfinalproject.domain.repository;

import com.jecesario.generationawsfinalproject.domain.models.Post;
import com.jecesario.generationawsfinalproject.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
