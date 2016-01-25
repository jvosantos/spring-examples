package com.jvosantos.examples.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Teaser", types = {Post.class})
public interface Teaser {

  String getTitle();

  String getSlug();

  String getTeaser();
}
