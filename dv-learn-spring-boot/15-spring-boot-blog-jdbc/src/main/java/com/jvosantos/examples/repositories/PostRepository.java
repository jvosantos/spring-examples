package com.jvosantos.examples.repositories;

import com.jvosantos.examples.domain.Post;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

  private RowMapper<Post> rowMapper = (rs, i) -> {
    Post post = new Post();
    post.setId(rs.getLong("id"));
    post.setTitle(rs.getString("title"));
    post.setTeaser(rs.getString("teaser"));
    post.setBody(rs.getString("body"));
    post.setSlug(rs.getString("slug"));
    post.setPostedOn(rs.getDate("posted_on"));
    post.setAuthor(rs.getLong("author_id"));

    return post;};

  private final JdbcTemplate jdbcTemplate;

  public PostRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Post findFirstByOrderByPostedOnDesc() {
    String sql = "select * from post order by posted_on limit 1";
    return jdbcTemplate.queryForObject(sql, rowMapper);
  }

  public List<Post> findAllByOrderByPostedOnDesc() {
    String sql = "select * from post order by posted_on";
    return jdbcTemplate.query(sql, rowMapper);
  }

  public Post findBySlug(String slug) {
    String sql = "select * from post where slug = ? order by posted_on";
    return jdbcTemplate.queryForObject(sql, new Object[]{slug}, rowMapper);
  }
}
