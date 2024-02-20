package ru.gb.springhw6.services;

import ru.gb.springhw6.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNote();


    Note getNoteById(Long id);

    Note createNote(Note note);
    Note addNote(Note note);
    Note updateNote (Long id, Note note);

    void deleteNote(Long id);
}
