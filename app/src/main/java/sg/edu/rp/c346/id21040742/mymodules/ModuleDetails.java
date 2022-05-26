package sg.edu.rp.c346.id21040742.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {

    TextView module;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        back = findViewById(R.id.btnBack);
        module = findViewById(R.id.module);

        Intent intentReceived = getIntent();
        if (intentReceived.hasExtra("Module1")) {
            String mod = intentReceived.getStringExtra("Module1");
            String name = intentReceived.getStringExtra("name");
            int year = intentReceived.getIntExtra("year",1);
            int semester = intentReceived.getIntExtra("semester", 1);
            int credit = intentReceived.getIntExtra("credit", 1);
            String venue = intentReceived.getStringExtra("venue");
            String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s",mod,name,year,semester,credit,venue);
            module.setText(display);
        }
        else {
            String mod = intentReceived.getStringExtra("Module2");
            String name = intentReceived.getStringExtra("name");
            int year = intentReceived.getIntExtra("year",1);
            int semester = intentReceived.getIntExtra("semester", 1);
            int credit = intentReceived.getIntExtra("credit", 1);
            String venue = intentReceived.getStringExtra("venue");
            String display = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %d\nSemester: %d\nModule Credit: %d\nVenue: %s",mod,name,year,semester,credit,venue);
            module.setText(display);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetails.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }
}