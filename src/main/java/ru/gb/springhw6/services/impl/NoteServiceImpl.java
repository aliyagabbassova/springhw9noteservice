package ru.gb.springhw6.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.springhw6.NoteRepo;
import ru.gb.springhw6.model.Note;
import ru.gb.springhw6.services.NoteService;

import java.util.List;
@Service
@RequiredArgsConstructor

public class NoteServiceImpl implements NoteService {
    private final NoteRepo noteRepo;
    @Override                               //Создание заметки
    public Note createNote(Note note) {
        return noteRepo.save(note);
    }
    @Override                               //Добавление заметки
    public Note addNote(Note note) {
        return noteRepo.save(note);
    }

    @Override
    public Note updateNote(Long id, Note note) {        //Редактирование заметки
        Note noteById = getNoteById(id);
        noteById.setTitle(note.getTitle());
        noteById.setContent(note.getContent());
        return noteRepo.save(noteById);
    }
    @Override                              // Просмотр всех заметок
    public List<Note> getAllNote() {
        return noteRepo.findAll();
    }




    @Override                                //Получение заметки по id.
    public Note getNoteById(Long id) {
        return noteRepo.findById(id).orElseThrow(null);
    }


    @Override                                //Удаление заметки
    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepo.delete(noteById);
    }
}
