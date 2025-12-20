package com.nabinstrivex.journalApp.controller;

import com.nabinstrivex.journalApp.entity.JournalEntry;
//import com.nabinstrivex.journalApp.service.JournalEntryService;
import com.nabinstrivex.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; // Added for better REST handling
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2
{
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll()
    {
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry)
    {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("/id/{myid}")
    // FIX: Using JournalEntry as return type instead of raw Optional, and using correct 'findById' casing.
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myid )
    {
        return journalEntryService.findById(myid).orElse(null);
    }
//    @GetMapping("/id/{myid")

    @DeleteMapping("/id/{myid}")
    public boolean deleteJournalEntryById(@PathVariable ObjectId myid )
    {
        journalEntryService.deleteById(myid); // FIX: Service method is now void, this is correct
        return true;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id , @RequestBody JournalEntry newEntry )
    {
        // FIX: Using correct 'findById' casing
        JournalEntry oldEntry = journalEntryService.findById(id).orElse(null);
        if(oldEntry != null)
        {
            // FIX: Corrected the update logic to check for non-empty/non-null strings
            if (newEntry.getTitle() != null && !newEntry.getTitle().trim().isEmpty()) {
                oldEntry.setTitle(newEntry.getTitle());
            }

            if (newEntry.getContent() != null && !newEntry.getContent().trim().isEmpty()) {
                oldEntry.setContent(newEntry.getContent());
            }

            oldEntry.setDate(LocalDateTime.now()); // Good practice: update date on modification

            journalEntryService.saveEntry(oldEntry);
            return oldEntry;
        }
        return null;
    }
}