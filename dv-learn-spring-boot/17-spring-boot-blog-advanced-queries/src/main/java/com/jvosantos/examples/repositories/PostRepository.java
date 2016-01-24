package com.jvosantos.examples.repositories;

import com.jvosantos.examples.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  // AUTHOR
  List<Post> findAllByAuthorFirstName(String firstName);

  List<Post> findAllByAuthorFirstNameIgnoreCase(String firstName);

  List<Post> findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(String firstName);

  List<Post> findAllByAuthorFirstNameAndAuthorLastName(String firstName, String lastName);

  List<Post> findAllByAuthorFirstNameIgnoreCaseAndAuthorLastNameIgnoreCase(String firstName, String lastName);

  // KEYWORDS
  List<Post> findAllByKeywords(String keyword);

  List<Post> findAllByKeywordsLikeIgnoreCase(String keyword);

  // ACTIVE

  List<Post> findAllByActiveTrue();

  // AUTHOR AND KEYWORD

  List<Post> findAllByAuthorFirstNameAndKeywords(String firstName, String keywords);

  List<Post> findAllByAuthorFirstNameAndKeywordsOrderByPostedOnDesc(String firstName, String keywords);

  // CUSTOM QUERY

  @Query("select p from Post p where p.slug = ?1")
  Post findPostBySlug(String slug);

  @Query("select p from Post p where p.slug = :slug")
  Post findPostBySlugNamedParam(@Param("slug") String slug);

  @Query(value = "select * from Post where slug = :slug", nativeQuery = true)
  Post findPostBySlugNative(@Param("slug") String slug);

}
