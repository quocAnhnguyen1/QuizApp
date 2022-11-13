package de.htwberlin.webtech.quizapp.web.api;

public class Flashcard {

    private long id;
    private String subject;
    private String question;
    private String answer;

    public Flashcard(long id, String subject, String question, String answer) {
        this.id = id;
        this.subject = subject;
        this.question = question;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
