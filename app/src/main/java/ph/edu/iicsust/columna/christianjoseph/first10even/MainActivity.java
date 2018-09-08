package ph.edu.iicsust.columna.christianjoseph.first10even;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener (new View.OnClickListener() {
        @Override
                public void onClick(View v) {

                TextView text2 = (TextView) findViewById(R.id.text2);
                int x=0;
                int i=1;

                    while(i<11){
                    x += 2;
                    i++;
                    text2.append(x+ ", " );
                    }
                }
        });
    }
}
