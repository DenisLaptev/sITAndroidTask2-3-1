package ua.a5.numbersystems31;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNumber1;
    EditText etNumber2;
    EditText etNumber3;

    Button btn1;
    Button btn2;
    Button btn3;

    TextView tvBin;
    TextView tvOct;
    TextView tvHex;

    int inputNumber;
    String binNumber;
    String octNumber;
    String hexNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = (EditText) findViewById(R.id.et_number1);
        etNumber2 = (EditText) findViewById(R.id.et_number2);
        etNumber3 = (EditText) findViewById(R.id.et_number3);

        etNumber1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                inputNumber = Integer.parseInt(etNumber1.getText().toString());
                contertToBinOctHex(inputNumber);
                Toast.makeText(getApplicationContext(), "TextWatcher", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etNumber2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                inputNumber = Integer.parseInt(etNumber2.getText().toString());
                contertToBinOctHex(inputNumber);
                Toast.makeText(getApplicationContext(), "TextWatcher", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etNumber3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                inputNumber = Integer.parseInt(etNumber3.getText().toString());
                contertToBinOctHex(inputNumber);
                Toast.makeText(getApplicationContext(), "TextWatcher", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        tvBin = (TextView) findViewById(R.id.tv_bin);
        tvOct = (TextView) findViewById(R.id.tv_oct);
        tvHex = (TextView) findViewById(R.id.tv_hex);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                inputNumber = Integer.parseInt(etNumber1.getText().toString());
                contertToBinOctHex(inputNumber);
                break;

            case R.id.btn2:
                inputNumber = Integer.parseInt(etNumber2.getText().toString());
                contertToBinOctHex(inputNumber);
                break;

            case R.id.btn3:
                inputNumber = Integer.parseInt(etNumber3.getText().toString());
                contertToBinOctHex(inputNumber);
                break;
        }
    }

    private void contertToBinOctHex(int inputNumber) {
        binNumber = Integer.toBinaryString(inputNumber);
        octNumber = Integer.toOctalString(inputNumber);
        hexNumber = Integer.toHexString(inputNumber);

        tvBin.setText(binNumber);
        tvOct.setText(octNumber);
        tvHex.setText(hexNumber);
    }


}
