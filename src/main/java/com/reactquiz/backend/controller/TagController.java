package com.reactquiz.backend.controller;

import com.reactquiz.backend.model.Tag;
import com.reactquiz.backend.service.tag.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/add")
    public String addTag(@RequestBody Tag tag){
        tagService.addTag(tag);
        return "Tag was added";
    }

    @GetMapping("/getAll")
    public List<Tag> getAllTags(){
        return tagService.getAllTags();
    }

}
