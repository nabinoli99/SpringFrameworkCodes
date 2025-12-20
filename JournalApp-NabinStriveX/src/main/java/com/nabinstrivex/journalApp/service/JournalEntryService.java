package com.nabinstrivex.journalApp.service;

import com.nabinstrivex.journalApp.entity.JournalEntry;
import com.nabinstrivex.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }

    // FIX: Renamed FindById to findById (correct casing)
    public Optional<JournalEntry> findById(ObjectId id)
    {
        return journalEntryRepository.findById(id);
    }

    // FIX: Changed return type from JournalEntry to void (to fix incompatible types error)
    public void deleteById(ObjectId id) {
        journalEntryRepository.deleteById(id);
    }
}