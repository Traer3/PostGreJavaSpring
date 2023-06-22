package com.traer.PostGreJavaSpring.repo;

import com.traer.PostGreJavaSpring.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
