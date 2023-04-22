package com.reactquiz.backend.repository.questions;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATAQuestionRepository extends JpaRepository<AllThatApplyQuestion, Long> {

}
