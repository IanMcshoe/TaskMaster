package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AllTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tasks);

        Button homeButton = AllTasks.this.findViewById(R.id.AllTaskActivityHome);
        Button addButton = AllTasks.this.findViewById(R.id.newTaskButton);



        homeButton.setOnClickListener(view -> {
            Intent goToMainActivity = new Intent(AllTasks.this, MainActivity.class);
            startActivity(goToMainActivity);
        });

        addButton.setOnClickListener(view -> {
            Intent goToAddTaskActivity = new Intent(AllTasks.this, AddTask.class);
            startActivity(goToAddTaskActivity);
        });
    }
}