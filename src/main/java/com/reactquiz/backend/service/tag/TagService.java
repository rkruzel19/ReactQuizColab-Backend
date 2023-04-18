package com.reactquiz.backend.service.tag;

import com.reactquiz.backend.model.Tag;
import java.util.List;

public interface TagService {

    Tag addTag(Tag tag);
    List<Tag> getAllTags();

}
