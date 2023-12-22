package application;

import java.util.List;

public interface QuestionService {

    int addQuestions(Question newQuestion);
    int removeQuestions( int questionId ) ;

    List<Question> getAllQuestions();
}
