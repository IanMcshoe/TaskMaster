package com.ianmcshoe.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.ianmcshoe.taskmaster.R;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button homeButton = AddTask.this.findViewById(R.id.AddTaskActivityHome);
        Button addButton = AddTask.this.findViewById(R.id.newTaskButton);
        Button allButton = AddTask.this.findViewById(R.id.AddActivityAllButton);


        homeButton.setOnClickListener(view -> {

            Intent goToMainActivity = new Intent(AddTask.this, MainActivity.class);
            startActivity(goToMainActivity);
        });

        allButton.setOnClickListener(view -> {

            Intent goToAllTasksActivity = new Intent(AddTask.this, ProfileActivity.AllTasks.class);
            startActivity(goToAllTasksActivity);
        });

        addButton.setOnClickListener(view -> {

        });
    }
}