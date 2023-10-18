package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int quantity = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        display("");
        TextView a = findViewById(R.id.a);
        TextView b = findViewById(R.id.b);

        String aText = a.getText().toString().trim();
        String bText = b.getText().toString().trim();


        // Check if the input strings are not empty and are valid numbers
        if (!aText.isEmpty() && !bText.isEmpty()) {
            try {
                Double a1 = Double.parseDouble(aText);
                double b1 = Double.parseDouble(bText);


                Double r = a1 + b1;

                // Call the display method with the calculated result
                display(String.valueOf(r));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "One or both inputs are empty. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    // Sample display method implementation


    public void sub(View view) {
        display("");
        TextView a = findViewById(R.id.a);
        TextView b = findViewById(R.id.b);

        String aText = a.getText().toString().trim();
        String bText = b.getText().toString().trim();


        // Check if the input strings are not empty and are valid numbers
        if (!aText.isEmpty() && !bText.isEmpty()) {
            try {
                Double a1 = Double.parseDouble(aText);
                double b1 = Double.parseDouble(bText);


                Double r = a1 - b1;

                // Call the display method with the calculated result
                display(String.valueOf(r));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "One or both inputs are empty. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }



    public void mult(View view) {
        display("");
        TextView a = findViewById(R.id.a);
        TextView b = findViewById(R.id.b);

        String aText = a.getText().toString().trim();
        String bText = b.getText().toString().trim();

        // Check if the input strings are not empty and are valid numbers
        if (!aText.isEmpty() && !bText.isEmpty()) {
            try {
                Double a1 = Double.parseDouble(aText);
                double b1 = Double.parseDouble(bText);


                Double r = a1 * b1;

                // Call the display method with the calculated result
                display(String.valueOf(r));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "One or both inputs are empty. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }

    // Sample display method implementation

    public void div(View view) {
        display("");
        TextView a = findViewById(R.id.a);
        TextView b = findViewById(R.id.b);

        String aText = a.getText().toString().trim();
        String bText = b.getText().toString().trim();

        // Check if the input strings are not empty and are valid numbers
        if (!aText.isEmpty() && !bText.isEmpty()) {
            try {
                Double a1 = Double.parseDouble(aText);
                double b1 = Double.parseDouble(bText);



                if(b1 == 0){
                    Toast.makeText(this, "can't devide on zero", Toast.LENGTH_SHORT).show();
                }else{
                    Double r = a1 / b1;

                    // Call the display method with the calculated result
                    display(String.valueOf(r));
                }


            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "One or both inputs are empty. Please enter valid numbers.", Toast.LENGTH_SHORT).show();
        }
    }



    private void display(String nbr){
        TextView quantityTextview = (TextView) findViewById(R.id.textView2);
        quantityTextview.setText(nbr);

    }
}