package com.example.moveurfiak;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import memory.Memory;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void deconnexion(View view){
        FirebaseAuth.getInstance().signOut(); // Déconnexion de l'utilisateur
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void inscription(View view){
        startActivity(new Intent(getApplicationContext(), Register.class));
        finish();
    }

    public void connexion(View view){
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void memory(View view){
        startActivity(new Intent(getApplicationContext(), Memory.class));
        finish();
    }
}
