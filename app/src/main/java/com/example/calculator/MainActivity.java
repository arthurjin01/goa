package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        Button allClearButton = findViewById(R.id.button_all_clear);
        Button changeSignButton = findViewById(R.id.button_change_sign);
        Button percentButton = findViewById(R.id.button_percent);
        Button divideButton = findViewById(R.id.button_divide);
        Button multiButton = findViewById(R.id.button_multiply);
        Button minusButton = findViewById(R.id.button_minus);
        Button additionButton = findViewById(R.id.button_plus);
        Button buttonNine = findViewById(R.id.button_nine);
        Button buttonEight = findViewById(R.id.button_eight);
        Button buttonSeven = findViewById(R.id.button_seven);
        Button buttonSix = findViewById(R.id.button_six);
        Button buttonFive = findViewById(R.id.button_five);
        Button buttonFour = findViewById(R.id.button_four);
        Button buttonThree = findViewById(R.id.button_three);
        Button buttonTwo = findViewById(R.id.button_two);
        Button buttonOne = findViewById(R.id.button_one);
        Button buttonZero = findViewById(R.id.button_zero);
        Button decimalButton = findViewById(R.id.button_dot);
        Button equalsButton = findViewById(R.id.button_equals);

        // AC Button
        allClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("All clear was tapped");
            }
        });

        // Change Sign Button
        changeSignButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Change sign was tapped");
            }
        });

        // Percent button
        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Percent was tapped");
            }
        });

        // Divide button
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Divide was tapped");
            }
        });

        // Multiplication button
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Multiply was tapped");
            }
        });

        // Subtraction button
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Minus was tapped");
            }
        });

        // Addition button
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Plus was tapped");
            }
        });

        // 9
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Nine was tapped");
            }
        });

        // 8
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Eight was tapped");
            }
        });

        // 7
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Seven was tapped");

                // Append digit to the right of existing number

                // Display current number
            }
        });

        // 6
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Six was tapped");
            }
        });

        // 5
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Five was tapped");
            }
        });

        // 4
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Four was tapped");
            }
        });

        // 3
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Three was tapped");
            }
        });

        // 2
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Two was tapped");
            }
        });

        // 1
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("One was tapped");
            }
        });

        // 0
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Zero was tapped");
            }
        });

        // Decimal point
        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Decimal point was tapped");
            }
        });

        // Equals button
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Equals button was tapped");
            }
        });

        
    }
}