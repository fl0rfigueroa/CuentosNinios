package com.example.cuentosnios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ¡que NO apunte a activity_home!

        Button go = findViewById(R.id.btnLeerAhora);
        go.setOnClickListener(this::onClick);
    }

    private void onClick(View v) {
        Toast.makeText(this, "Click!", Toast.LENGTH_SHORT).show(); // prueba de vida
        startActivity(new Intent(MainActivity.this, Select_book_activity.class));
    }
}


      /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

    }
} */