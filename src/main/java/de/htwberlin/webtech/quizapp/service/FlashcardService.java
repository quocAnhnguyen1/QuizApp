package de.htwberlin.webtech.quizapp.service;

import de.htwberlin.webtech.quizapp.persistence.FlashcardEntity;
import de.htwberlin.webtech.quizapp.persistence.FlashcardRepository;
import de.htwberlin.webtech.quizapp.web.api.Flashcard;
import de.htwberlin.webtech.quizapp.web.api.FlashcardManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlashcardService {
    private final FlashcardRepository flashcardRepository;

    public FlashcardService(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public List<Flashcard> findAll(){
        List<FlashcardEntity> flashcards = flashcardRepository.findAll();
        return flashcards.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public Flashcard findById(Long id){
        var flashcardEntity = flashcardRepository.findById(id);
        return flashcardEntity.map(this::transformEntity).orElse(null);
    }

    public Flashcard create(FlashcardManipulationRequest request){
        var flashcardEntity = new FlashcardEntity(request.getSubject(), request.getQuestion(), request.getAnswer());
        flashcardEntity = flashcardRepository.save(flashcardEntity);
        return transformEntity(flashcardEntity);
    }

    public Flashcard update(Long id, FlashcardManipulationRequest request){
        var flashcardEntityOptional = flashcardRepository.findById(id);
        if(flashcardEntityOptional.isEmpty()){
            return null;
        }
        var flashcardEntity = flashcardEntityOptional.get();
        flashcardEntity.setSubject(request.getSubject());
        flashcardEntity.setQuestion(request.getQuestion());
        flashcardEntity.setAnswer(request.getAnswer());
        flashcardEntity = flashcardRepository.save(flashcardEntity);

        return transformEntity(flashcardEntity);
    }

    public boolean deleteById(Long id){
        if(!flashcardRepository.existsById(id)){
            return false;
        }
        flashcardRepository.deleteById(id);
        return true;
    }

    private Flashcard transformEntity(FlashcardEntity flashcardEntity){
        return new Flashcard(
                flashcardEntity.getId(),
                flashcardEntity.getSubject(),
                flashcardEntity.getQuestion(),
                flashcardEntity.getAnswer()
        );
    }
}
