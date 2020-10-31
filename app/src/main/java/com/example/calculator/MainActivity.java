package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables
    String currentNumberString = "0";
    double previousNumber;
    String pendingOperation = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayTextView = findViewById(R.id.text_view_display);

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

                // Append digit to the right of existing number
                final String enteredDigit = "9";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 9
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 9 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 8
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Eight was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "8";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 8
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 8 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 7
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Seven was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "7";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 7
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 7 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 6
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Six was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "6";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 6
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 6 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 5
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Five was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "5";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 5
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 5 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 4
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Four was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "4";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 4
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 4 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 3
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Three was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "3";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 3
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 3 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 2
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Two was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "2";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 2
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 2 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 1
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("One was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "1";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 1
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 1 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // 0
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Zero was tapped");

                // Append digit to the right of existing number
                final String enteredDigit = "0";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 0
                    currentNumberString = enteredDigit;
                }
                else {
                    // If display != 0, append 0 to previous enteredDigit
                    currentNumberString += enteredDigit;
                }

                // Display current number
                displayTextView.setText(currentNumberString);
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