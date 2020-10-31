package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AC Button
        Button allClearButton = findViewById(R.id.button_all_clear);
        allClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("All clear was tapped");
            }
        });

        // Change Sign Button
        Button changeSignButton = findViewById(R.id.button_change_sign);
        changeSignButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Change sign was tapped");
            }
        });

        // Percent button
        Button percentButton = findViewById(R.id.button_percent);
        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Percent was tapped");
            }
        });

        // Divide button
        Button divideButton = findViewById(R.id.button_divide);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Divide was tapped");
            }
        });

        // 7
        Button buttonSeven = findViewById(R.id.button_seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Seven was tapped");
            }
        });

        // 8
        Button buttonEight = findViewById(R.id.button_eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Eight was tapped");
            }
        });

        // 9
        Button buttonNine = findViewById(R.id.button_nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Nine was tapped");
            }
        });

        // Multiplication button
        Button multiButton = findViewById(R.id.button_x);
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Multiply was tapped");
            }
        });

        // 4
        Button buttonFour = findViewById(R.id.button_four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Four was tapped");
            }
        });

        // 5
        Button buttonFive = findViewById(R.id.button_five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Five was tapped");
            }
        });

        // 6
        Button buttonSix = findViewById(R.id.button_six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Six was tapped");
            }
        });

        // Subtraction button
        Button minusButton = findViewById(R.id.button_minus);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Minus was tapped");
            }
        });

        // 1
        Button buttonOne = findViewById(R.id.button_one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("One was tapped");
            }
        });

        // 2
        Button buttonTwo = findViewById(R.id.button_two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Two was tapped");
            }
        });

        // 3
        Button buttonThree = findViewById(R.id.button_three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Three was tapped");
            }
        });

        // Addition button
        Button additionButton = findViewById(R.id.button_plus);
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Plus was tapped");
            }
        });

        // 0
        Button buttonZero = findViewById(R.id.button_zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Zero was tapped");
            }
        });

        // Decimal point
        Button decimalButton = findViewById(R.id.button_dot);
        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Decimal point was tapped");
            }
        });

        // Equals button
        Button equalsButton = findViewById(R.id.button_equals);
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Equals button was tapped");
            }
        });

        
    }
}