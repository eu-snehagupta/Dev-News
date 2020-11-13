package se.kth.sda8.devNews.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("")
    public List<Article> getAll(@RequestParam(required = false) Long topicId) {
        if (topicId != null) {
            return articleService.getAllByTopicId(topicId);
        } else {
            return articleService.getAll();
        }
    }

    @GetMapping("/sort")
    public List<Article> getAll(@RequestParam String sort) {
        return articleService.getAll_sort(sort);
    }

    @GetMapping("/{id}")
    public Article getById(@PathVariable Long id) {
        return articleService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Article create(@RequestBody Article newArticle) {
        return articleService.create(newArticle);
    }

    @PutMapping("")
    public Article update(@RequestBody Article updateArticle) {
        return articleService.update(updateArticle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        articleService.delete(id);
    }
}
