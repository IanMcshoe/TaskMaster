package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addButton = MainActivity.this.findViewById(R.id.MainActivityAddButton);
        Button allButton = MainActivity.this.findViewById(R.id.MainActivityAllButton);


        addButton.setOnClickListener(view -> {

            Intent goToAddTasksActivity = new Intent(MainActivity.this, AddTask.class);
            startActivity(goToAddTasksActivity);
        });

        allButton.setOnClickListener(view -> {
            Intent goToAllTasksActivity = new Intent(MainActivity.this, AllTasks.class);
            startActivity(goToAllTasksActivity);
        });
    }
}