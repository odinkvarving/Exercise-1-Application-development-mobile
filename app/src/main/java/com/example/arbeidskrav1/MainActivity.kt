package com.example.arbeidskrav1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(meny: Menu): Boolean {
        super.onCreateOptionsMenu(meny)
        meny.add("Odin")
        meny.add("Kvarving")
        Log.d("INFT2501", "meny laget")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        if (item.getTitle().equals("Odin")) {
            Log.w("ADVARSEL","Odin!")
        }else if(item.getTitle().equals("Kvarving")) {
            Log.e("FEILMELDING", "Kvarving")
        }
        return true
    }
}

