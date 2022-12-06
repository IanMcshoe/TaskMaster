package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpBttns();
        setupProfileImageBttn();

    }
        public void setUpBttns() {
            Button addButton = MainActivity.this.findViewById(R.id.MainActivityAddButton);
            Button allButton = MainActivity.this.findViewById(R.id.AddActivityAllButton);


            addButton.setOnClickListener(view -> {

                Intent goToAddTasksActivity = new Intent(MainActivity.this, AddTask.class);
                startActivity(goToAddTasksActivity);
            });

            allButton.setOnClickListener(view -> {
                Intent goToAllTasksActivity = new Intent(MainActivity.this, AllTasks.class);
                startActivity(goToAllTasksActivity);
            });
        }

        public void setupProfileImageBttn () {
            ImageView userProfileLink = MainActivity.this.findViewById(R.id.MainProfileImageView);
            userProfileLink.setOnClickListener(view -> {
                Intent goToUserProfile = new Intent(this, ProfileActivity.class);
                startActivity(goToUserProfile);
            });
        }
    }
