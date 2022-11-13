package de.htwberlin.webtech.quizapp.web;

import de.htwberlin.webtech.quizapp.web.api.Flashcard;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashcardRestController {
    private List<Flashcard> flashcards;

    public FlashcardRestController(List<Flashcard> flashcards) {
        this.flashcards = flashcards;
        flashcards.add(new Flashcard(1,"test", "test", "test"));
        flashcards.add(new Flashcard(2,"test", "test", "test"));
    }

    @GetMapping(path = "/api/v1/flashcards")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Flashcard> fetchFlashcards(){
        return flashcards;
    }

}
