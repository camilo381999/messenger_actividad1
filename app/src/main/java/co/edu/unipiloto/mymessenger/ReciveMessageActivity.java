package co.edu.unipiloto.mymessenger;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class ReciveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=(TextView)findViewById(R.id.message);
        messageView.setText(messageText);
    }
}