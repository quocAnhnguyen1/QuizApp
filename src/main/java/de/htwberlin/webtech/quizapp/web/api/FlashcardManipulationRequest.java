package de.htwberlin.webtech.quizapp.web.api;

public class FlashcardManipulationRequest {
    private String subject;
    private String question;
    private String answer;

    public FlashcardManipulationRequest(String subject, String question, String answer) {
        this.subject = subject;
        this.question = question;
        this.answer = answer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
