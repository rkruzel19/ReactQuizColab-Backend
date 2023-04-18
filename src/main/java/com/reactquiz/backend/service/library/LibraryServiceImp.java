package com.reactquiz.backend.service.library;

import com.reactquiz.backend.model.Library;
import com.reactquiz.backend.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImp implements LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public Library addLibrary(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }
}
