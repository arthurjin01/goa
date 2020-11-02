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
    boolean clearDisplayOnNextDigit = false;
    boolean currentNumberStringHasDecimal = false;
    String previousOperationsDisplay;
    int currentNumberStringLength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Main display
        TextView displayTextView = findViewById(R.id.text_view_display);

        // Operations display
        TextView displayOperations = findViewById(R.id.operations_display);
        String Default_Operations_Display_Value = "0";

        // Buttons
        Button allClearButton = findViewById(R.id.button_all_clear);
        Button changeSignButton = findViewById(R.id.button_change_sign);
        Button backspaceButton = findViewById(R.id.button_backspace);
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

                // Reset all variables
                currentNumberString = "0";
                previousNumber = 0.0;
                pendingOperation = null;
                clearDisplayOnNextDigit = false;
                currentNumberStringHasDecimal = false;
                previousOperationsDisplay = "0";

                // Display current number
                displayTextView.setText(currentNumberString);

                // Display operations
                displayOperations.setText("0");
            }
        });

        // Change Sign Button
        changeSignButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Change sign was tapped");

                // Is current number negative
                if (currentNumberString.startsWith("-")) {
                    // Negative; remove negative
                    currentNumberString = currentNumberString.replace("-", "");
                }
                else {
                    // Positive; make negative
                    currentNumberString = "-" + currentNumberString;
                }
                // Display current number
                displayTextView.setText(currentNumberString);

                // Display in operationsDisplay
                displayOperations.setText(currentNumberString);
            }
        });

        // Backspace Button
        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Backspace was tapped");

                // Delete the right-most digit
                if (currentNumberString.length() <= 1) {
                    // Replace number with 0
                    currentNumberString = currentNumberString.replace(currentNumberString, "0");
                }
                else if (currentNumberString.endsWith("9")) {
                    // Remove one 9
                    currentNumberString = currentNumberString.replaceFirst("9", "");
                }
                else if (currentNumberString.endsWith("8")) {
                    // Remove one 8
                    currentNumberString = currentNumberString.replaceFirst("8", "");
                }
                else if (currentNumberString.endsWith("7")) {
                    // Remove one 7
                    currentNumberString = currentNumberString.replaceFirst("7", "");
                }
                else if (currentNumberString.endsWith("6")) {
                    // Remove one 6
                    currentNumberString = currentNumberString.replaceFirst("6", "");
                }
                else if (currentNumberString.endsWith("5")) {
                    // Remove one 5
                    currentNumberString = currentNumberString.replaceFirst("5", "");
                }
                else if (currentNumberString.endsWith("4")) {
                    // Remove one 4
                    currentNumberString = currentNumberString.replaceFirst("4", "");
                }
                else if (currentNumberString.endsWith("3")) {
                    // Remove one 3
                    currentNumberString = currentNumberString.replaceFirst("3", "");
                }
                else if (currentNumberString.endsWith("2")) {
                    // Remove one 2
                    currentNumberString = currentNumberString.replaceFirst("2", "");
                }
                else if (currentNumberString.endsWith("1")) {
                    // Remove one 1
                    currentNumberString = currentNumberString.replaceFirst("1", "");
                }
                else if (currentNumberString.endsWith("0")) {
                    // Remove one 0
                    currentNumberString = currentNumberString.replaceFirst("0", "");
                }
                else if (currentNumberString.endsWith(".")) {
                    // Remove one .
                    currentNumberString = currentNumberString.replaceFirst(".", "");
                }

                // Display current number
                displayTextView.setText(currentNumberString);
            }
        });

        // Divide button
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Divide was tapped");

                if (pendingOperation != null) {
                    // Convert current number as double
                    double currentNumber = Double.parseDouble(currentNumberString);

                    // Perform pending operation on previous number and current number
                    if (pendingOperation.equals("Add")) {
                        previousNumber += currentNumber;
                    }
                    else if (pendingOperation.equals("Subtract")){
                        previousNumber -= currentNumber;
                    }
                    else if (pendingOperation.equals("Multiply")){
                        previousNumber *= currentNumber;
                    }
                    else if (pendingOperation.equals("Divide")){
                        previousNumber /= currentNumber;
                    }

                    // Replace current number displayed with result
                    currentNumberString = Double.valueOf(previousNumber).toString();

                    // Display current number
                    displayTextView.setText(currentNumberString);
                }

                // Save current number as previous number
                previousNumber = Double.parseDouble(currentNumberString);

                // Remember selected operator as pending operation
                pendingOperation = "Divide";

                // Clear display on next digit input
                clearDisplayOnNextDigit = true;

                // Display in operationsDisplay
                if (pendingOperation.equals("Add")) {
                    displayOperations.setText("+");
                }
                else if (pendingOperation.equals("Subtract")) {
                    displayOperations.setText("-");
                }
                else if (pendingOperation.equals("Multiply")) {
                    displayOperations.setText("x");
                }
                else if (pendingOperation.equals("Divide")) {
                    displayOperations.setText("÷");
                }
            }
        });

        // Multiplication button
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Multiply was tapped");

                if (pendingOperation != null) {
                    // Convert current number as double
                    double currentNumber = Double.parseDouble(currentNumberString);

                    // Perform pending operation on previous number and current number
                    if (pendingOperation.equals("Add")) {
                        previousNumber += currentNumber;
                    }
                    else if (pendingOperation.equals("Subtract")){
                        previousNumber -= currentNumber;
                    }
                    else if (pendingOperation.equals("Multiply")){
                        previousNumber *= currentNumber;
                    }
                    else if (pendingOperation.equals("Divide")){
                        previousNumber /= currentNumber;
                    }

                    // Replace current number displayed with result
                    currentNumberString = Double.valueOf(previousNumber).toString();

                    // Display current number
                    displayTextView.setText(currentNumberString);
                }

                // Save current number as previous number
                previousNumber = Double.parseDouble(currentNumberString);

                // Remember selected operator as pending operation
                pendingOperation = "Multiply";

                // Clear display on next digit input
                clearDisplayOnNextDigit = true;

                // Display in operationsDisplay
                if (pendingOperation.equals("Add")) {
                    displayOperations.setText("+");
                }
                else if (pendingOperation.equals("Subtract")) {
                    displayOperations.setText("-");
                }
                else if (pendingOperation.equals("Multiply")) {
                    displayOperations.setText("x");
                }
                else if (pendingOperation.equals("Divide")) {
                    displayOperations.setText("÷");
                }
            }
        });

        // Subtraction button
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Minus was tapped");

                if (pendingOperation != null) {
                    // Convert current number as double
                    double currentNumber = Double.parseDouble(currentNumberString);

                    // Perform pending operation on previous number and current number
                    if (pendingOperation.equals("Add")) {
                        previousNumber += currentNumber;
                    }
                    else if (pendingOperation.equals("Subtract")){
                        previousNumber -= currentNumber;
                    }
                    else if (pendingOperation.equals("Multiply")){
                        previousNumber *= currentNumber;
                    }
                    else if (pendingOperation.equals("Divide")){
                        previousNumber /= currentNumber;
                    }

                    // Replace current number displayed with result
                    currentNumberString = Double.valueOf(previousNumber).toString();

                    // Display current number
                    displayTextView.setText(currentNumberString);
                }

                // Save current number as previous number
                previousNumber = Double.parseDouble(currentNumberString);

                // Remember selected operator as pending operation
                pendingOperation = "Subtract";

                // Clear display on next digit input
                clearDisplayOnNextDigit = true;

                // Display in operationsDisplay
                if (pendingOperation.equals("Add")) {
                    displayOperations.setText("+");
                }
                else if (pendingOperation.equals("Subtract")) {
                    displayOperations.setText("-");
                }
                else if (pendingOperation.equals("Multiply")) {
                    displayOperations.setText("x");
                }
                else if (pendingOperation.equals("Divide")) {
                    displayOperations.setText("÷");
                }
            }
        });

        // Addition button
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Plus was tapped");

                if (pendingOperation != null) {
                    // Convert current number as double
                    double currentNumber = Double.parseDouble(currentNumberString);

                    // Perform pending operation on previous number and current number
                    if (pendingOperation.equals("Add")) {
                        previousNumber += currentNumber;
                    }
                    else if (pendingOperation.equals("Subtract")){
                        previousNumber -= currentNumber;
                    }
                    else if (pendingOperation.equals("Multiply")){
                        previousNumber *= currentNumber;
                    }
                    else if (pendingOperation.equals("Divide")){
                        previousNumber /= currentNumber;
                    }

                    // Replace current number displayed with result
                    currentNumberString = Double.valueOf(previousNumber).toString();

                    // Display current number
                    displayTextView.setText(currentNumberString);
                }

                // Save current number as previous number
                previousNumber = Double.parseDouble(currentNumberString);

                // Remember selected operator as pending operation
                pendingOperation = "Add";

                // Clear display on next digit input
                clearDisplayOnNextDigit = true;

                // Display in operationsDisplay
                if (pendingOperation.equals("Add")) {
                    displayOperations.setText("+");
                }
                else if (pendingOperation.equals("Subtract")) {
                    displayOperations.setText("-");
                }
                else if (pendingOperation.equals("Multiply")) {
                    displayOperations.setText("x");
                }
                else if (pendingOperation.equals("Divide")) {
                    displayOperations.setText("÷");
                }
            }
        });

        // 9
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Nine was tapped");

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "9";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 9
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "8";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 8
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "7";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 7
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "6";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 6
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "5";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 5
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "4";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 4
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "3";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 3
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "2";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 2
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "1";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 1
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Check if required to clear display on next digit input
                if (clearDisplayOnNextDigit) {
                    currentNumberString = "0";
                    clearDisplayOnNextDigit = false;
                    currentNumberStringHasDecimal = false;
                }

                // Append digit to the right of existing number
                final String enteredDigit = "0";
                if (currentNumberString.equals("0")) {
                    // If display = 0, replace with 0
                    currentNumberString = enteredDigit;
                }
                // Limit to 16 characters
                else if (currentNumberString.length() > 16) {
                    currentNumberString += "";
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

                // Process only if currentNumberString has no decimal yet
                if (!currentNumberStringHasDecimal) {

                    // Check if required to clear display on next digit input
                    if (clearDisplayOnNextDigit) {
                        currentNumberString = "0";
                        clearDisplayOnNextDigit = false;
                    }

                    // Append digit to the right of existing number
                    final String enteredDigit = ".";
                    if (currentNumberString.equals("0")) {
                        // If display = 0, append . to previous enteredDigit
                        currentNumberString += enteredDigit;
                    }
                    // Limit to 16 characters
                    else if (currentNumberString.length() > 16) {
                        currentNumberString += "";
                    }
                    else {
                        // If display != 0, append . to previous enteredDigit
                        currentNumberString += enteredDigit;
                    }

                    // Display current number
                    displayTextView.setText(currentNumberString);

                    // Set flag to indicate currentNumberString already has decimal
                    currentNumberStringHasDecimal = true;
                }
            }
        });

        // Equals button
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code executed when button tapped
                System.out.println("Equals button was tapped");

                if (pendingOperation != null) {
                    // Convert current number as double
                    double currentNumber = Double.parseDouble(currentNumberString);

                    // Perform pending operation on previous number and current number
                    if (pendingOperation.equals("Add")) {
                        previousNumber += currentNumber;
                    }
                    else if (pendingOperation.equals("Subtract")){
                        previousNumber -= currentNumber;
                    }
                    else if (pendingOperation.equals("Multiply")){
                        previousNumber *= currentNumber;
                    }
                    else if (pendingOperation.equals("Divide")){
                        previousNumber /= currentNumber;
                    }

                    // Replace current number displayed with result
                    currentNumberString = Double.valueOf(previousNumber).toString();

                    // Display current number
                    displayTextView.setText(currentNumberString);
                }
                // Clear pending operation
                pendingOperation = null;

                // Clear display on next digit input
                clearDisplayOnNextDigit = true;

                // Display in operationsDisplay
                displayOperations.setText("=");
            }
        });
    }
}