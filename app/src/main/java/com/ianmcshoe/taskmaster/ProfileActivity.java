package com.ianmcshoe.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    SharedPreferences preferences;
    public static final String USERNAME_TAG = "username";
    public static final String USERNAME_PHONE_TAG = "userPhone";
    public static final String USERNAME_EMAIL_TAG = "userEmail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        saveSharedPrefs();
    }

    public void saveSharedPrefs() {
        SharedPreferences.Editor preferenceEditor = preferences.edit();
        Button saveButton = ProfileActivity.this.findViewById(R.id.UserSaveButton);
        saveButton.setOnClickListener(view -> {
        String usernameText = ((EditText) findViewById(R.id.UserProfilePersonName)).getText().toString();
        String userEmail = ((EditText) findViewById(R.id.UserProfileEmailAddress)).getText().toString();
        String userPhone = ((EditText) findViewById(R.id.UserProfileTextPhone)).getText().toString();

            preferenceEditor.putString(USERNAME_TAG, usernameText);
            preferenceEditor.putString(USERNAME_PHONE_TAG, userPhone);
            preferenceEditor.putString(USERNAME_EMAIL_TAG, userEmail);
            preferenceEditor.apply();

            Toast.makeText(this, "Settings Saved", Toast.LENGTH_SHORT).show();
        });
    }


}