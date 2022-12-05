package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AddTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button homeButton = AddTask.this.findViewById(R.id.AddTaskActivityHome);
        Button addButton = AddTask.this.findViewById(R.id.newTaskButton);
        Button allButton = AddTask.this.findViewById(R.id.MainActivityAllButton);


        homeButton.setOnClickListener(view -> {

            Intent goToMainActivity = new Intent(AddTask.this, MainActivity.class);
            startActivity(goToMainActivity);
        });

        allButton.setOnClickListener(view -> {

            Intent goToAllTasksActivity = new Intent(AddTask.this, AllTasks.class);
            startActivity(goToAllTasksActivity);
        });

        addButton.setOnClickListener(view -> {

        });
    }
}