[![CI](https://github.com/quocAnhnguyen1/QuizApp/actions/workflows/ci.yml/badge.svg)](https://github.com/quocAnhnguyen1/QuizApp/actions/workflows/ci.yml)
# QuizApp

Flashcard App im Quizstil

Die App soll dafür benutzt werden um Flashcards zu erstellen, zu speichern und dann wiederzugeben.
Flashcards beinhalten auf der Vorderseite eine Frage mit Antwortmöglichkeiten und auf der Rückseite die richtige Antwort
+ eventuelle Erläuterung.
Startet man ein "Quiz", so werden die Flashcards zufällig wiedergegeben.

Vorderseite: Frage

Per Mausklick auf eine der vorhandenen Optionen wird die Antwort dann grün (korrekt) oder rot (falsch).
Nach Anzeige der Farbe wird eine kurze Erläuterung der richtigen Antwort angezeigt.

Ergebnisse werden in einer HashMap gespeichert mit KartenID = key und value = richtige Antwort

Sortieren nach: Erstellungsdatum, richtige Antwort % oder zufällig

Quiz kann über einen Button gestartet werden. Die Flashcards
werden dann in zufälliger Reihenfolge wiedergegeben. Am Ende
wird dann das Ergebnis angezeigt (z.B. 10/12 Fragen richtig beantwortet
/ Prozentsatz)

