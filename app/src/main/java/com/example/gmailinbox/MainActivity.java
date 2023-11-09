package com.example.gmailinbox;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Email> emailList = createDummyEmails();
        emailAdapter = new EmailAdapter(emailList);
        recyclerView.setAdapter(emailAdapter);
    }

    private List<Email> createDummyEmails() {
        List<Email> emailList = new ArrayList<>();
        emailList.add(new Email("John Doe", "Hello", "This is a preview of the email.", "2023-11-09 10:30 AM"));
        emailList.add(new Email("Jane Smith", "Meeting Reminder", "Just a reminder about our meeting tomorrow.", "2023-11-10 2:00 PM"));
        emailList.add(new Email("David Johnson", "Important Announcement", "Please read the attached document for an important announcement.", "2023-11-11 9:15 AM"));
        return emailList;
    }
}