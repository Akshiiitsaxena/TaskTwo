package akshit.com.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button butt;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.my_text);
        butt = (Button) findViewById(R.id.my_button);


        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                if (i%2==0)
                {
                    txt.setText("Hello World!");
                }

                else
                {
                    txt.setText("Goodbye World!");
                }
            }
        });



    }
}
