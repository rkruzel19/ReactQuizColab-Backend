package com.reactquiz.backend.service.library;

import com.reactquiz.backend.model.Library;
import java.util.List;

public interface LibraryService {

    Library addLibrary(Library library);
    List<Library> getAllLibraries();

}
