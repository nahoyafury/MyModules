package sg.edu.rp.c346.id21040742.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btncap;
    Button btncip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncap = findViewById(R.id.btncap);
        btncip = findViewById(R.id.btncip);

        btncap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetails.class);
                intent.putExtra("Module1","C346");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        btncip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleDetails.class);
                intent.putExtra("Module2","C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("year","2020");
                intent.putExtra("semester","1");
                intent.putExtra("credit","4");
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

    }
}