package com.reactquiz.backend.repository.questions;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;
import com.reactquiz.backend.model.Questions.QuestionBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionBase, Long> {
}

