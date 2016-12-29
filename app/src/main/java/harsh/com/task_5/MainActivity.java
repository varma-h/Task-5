package harsh.com.task_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6;
    private EditText x,y;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);

        x= (EditText) findViewById(R.id.x);
        y= (EditText) findViewById(R.id.y);

        ans = (TextView) findViewById(R.id.ans);



        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                c = a+b;
                ans.setText(Double.toString(c));
            }
        });
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                c = a-b;
                ans.setText(Double.toString(c));
            }
        });
        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                c = a*b;
                ans.setText(Double.toString(c));
            }
        });
        b4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                if(b==0)
                    ans.setText("Inappropriate Values");
                else{
                    c = a/b;
                    ans.setText(Double.toString(c));}
            }
        });
        b5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                if(b==0)
                    ans.setText("Inappropriate Values");
                else{
                    c = a%b;
                    ans.setText(Double.toString(c));}
            }
        });
        b6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = x.getText().toString();
                double a = Double.parseDouble(s);
                String s2 = y.getText().toString();
                double b = Double.parseDouble(s2);
                double c;
                c = Math.pow(a,b);
                ans.setText(Double.toString(c));
            }
        });
    }
}
