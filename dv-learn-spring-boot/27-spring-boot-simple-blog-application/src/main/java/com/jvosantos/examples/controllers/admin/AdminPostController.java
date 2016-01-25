package com.jvosantos.examples.controllers.admin;

import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.services.AuthorService;
import com.jvosantos.examples.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AdminPostController {

  private PostService postService;
  private AuthorService authorService;

  @Autowired
  public AdminPostController(PostService postService, AuthorService authorService) {
    this.postService = postService;
    this.authorService = authorService;
  }

  @RequestMapping("/admin/posts")
  public String list(Model model) {
    model.addAttribute("posts", postService.list());

    return "admin/post/list";
  }

  @RequestMapping("/admin/post/{id}")
  public String view(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("post", postService.get(id));

    return "admin/post/view";
  }

  @RequestMapping("/admin/post/create")
  public String create(Model model) {
    model.addAttribute("post", new Post());

    model.addAttribute("authors", authorService.list());

    return "admin/post/postForm";
  }

  @RequestMapping(value = "/admin/post/save", method = RequestMethod.POST)
  public String save(@Valid Post post, BindingResult bindingResult, Model model) {

    if(bindingResult.hasErrors()) {
      model.addAttribute("authors", authorService.list());
      return "admin/post/postForm";
    }

    Post savedPost = postService.save(post);
    return "redirect:/admin/post/" + savedPost.getId();
  }

  @RequestMapping("/admin/post/edit/{id}")
  public String edit(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("post", postService.get(id));
    model.addAttribute("authors", authorService.list());

    return "admin/post/postForm";
  }

  @RequestMapping("/admin/post/delete/{id}")
  public String delete(@PathVariable(value = "id") Long id, RedirectAttributes redirectAttributes) {
    String postTitle = postService.get(id).getTitle();
    postService.delete(id);

    redirectAttributes.addFlashAttribute("message", "Post " + postTitle + " was deleted!");

    return "redirect:/admin/posts";
  }
}
