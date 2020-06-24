package com.nguyenvuluan.notedemo.listener;

import com.nguyenvuluan.notedemo.entity.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
