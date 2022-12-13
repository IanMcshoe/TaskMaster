package com.ianmcshoe.taskmaster.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ianmcshoe.taskmaster.R;
import com.ianmcshoe.taskmaster.adapter.TaskListRecyclerViewAdapter;
import com.ianmcshoe.taskmaster.models.TaskList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
public static final String TASK_TAG = "myTask";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpGreeting();
        setUpBttns();
        setupProfileImageBttn();
        setupRecyclerView();


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
            Intent goToAllTasksActivity = new Intent(MainActivity.this, ProfileActivity.AllTasks.class);
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
    public void setupRecyclerView() {
        List<TaskList> taskList = new ArrayList<>();
        taskList.add(new TaskList("Trash", "Take the trash out"));
        taskList.add(new TaskList("Meds", "Take your vitamins"));
        taskList.add(new TaskList("Pets Food","Feed all of the beasts"));
        taskList.add(new TaskList("DSA's","Practice Interview Q's"));
        taskList.add(new TaskList("Eat","Remember to take care of me"));
        RecyclerView mainRecycler = findViewById(R.id.MainActivityRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainRecycler.setLayoutManager(layoutManager);

        TaskListRecyclerViewAdapter adapter = new TaskListRecyclerViewAdapter(taskList, this);
        mainRecycler.setAdapter(adapter);
    }



}
