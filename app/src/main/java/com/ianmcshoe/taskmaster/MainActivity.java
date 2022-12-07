package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public static final String taskTag = "myTask";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpGreeting();
        setUpBttns();
        setupProfileImageBttn();

    }

    @Override
    protected void onResume() {
        super.onResume();


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

    public void setupProfileImageBttn() {
        ImageView userProfileLink = MainActivity.this.findViewById(R.id.MainProfileImageView);
        userProfileLink.setOnClickListener(view -> {
            Intent goToUserProfile = new Intent(this, ProfileActivity.class);
            startActivity(goToUserProfile);
        });
    }


    public void setUpGreeting() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

        String username = preferences.getString(ProfileActivity.USERNAME_TAG, "No Username");
        ((TextView) findViewById(R.id.MainActivityHeroTitle)).setText(username);

    }

}
