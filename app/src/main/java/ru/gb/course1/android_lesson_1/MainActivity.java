package ru.gb.course1.android_lesson_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private Button resultButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        resultButton.setOnClickListener(view -> resultTextView.setText(getSumFromView()));
    }

    private String getSumFromView() {
        String firstNumberStr = firstNumberEditText.getText().toString();
        String secondNumberStr = secondNumberEditText.getText().toString();

        String result;

        try {
            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);
            int sum = firstNumber + secondNumber;

            result = String.valueOf(sum);
        } catch (Exception e) {
            e.printStackTrace();
            result = "ОШИБКА";
        }

        return result;
    }

    private void initView() {
        firstNumberEditText = findViewById(R.id.first_number_edit_text);
        secondNumberEditText = findViewById(R.id.second_number_edit_text);
        resultButton = findViewById(R.id.result_button);
        resultTextView = findViewById(R.id.result_text_view);
    }
}