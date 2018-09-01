package iics.elyousef.yousefimad.comparison;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Comparison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        Button CompareButton = (Button) findViewById(R.id.CompareButton);
        CompareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                int firstNum = Integer.parseInt(inputEditText1.getText().toString());
                int secondNum = Integer.parseInt(inputEditText2.getText().toString());
                if (firstNum > secondNum){
                    resultTextView.setText("The first number is higher than the 2nd Number" + firstNum);
                    }
                else if (secondNum > firstNum){
                    resultTextView.setText("The second number is higher than the first number");
                }
                  else
            {
                resultTextView.setText("The Numbers are equal");
            }


            }
        });
    }
}
