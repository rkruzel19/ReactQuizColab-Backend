package com.reactquiz.backend.controller;

import com.reactquiz.backend.model.Library;
import com.reactquiz.backend.service.library.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/add")
    public String addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
        return "Library was added";
    }

    @GetMapping("/getAll")
    public List<Library> getAllLibraries(){
        return libraryService.getAllLibraries();
    }

}
