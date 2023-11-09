package au.com.softclient.notification1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {
    private NotificationHelper notificationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationHelper = new NotificationHelper(this);

        TextInputLayout txt = findViewById(R.id.textInputLayout2);


        Button btn = findViewById(R.id.sendNotificationButton);

        btn.setOnClickListener(v->{
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
            notificationHelper.sendHighPriorityNotification("Notify Title",
                    "This Notify you that you have clicked Button : "+ txt.getEditText().getText().toString(),
                    MainActivity.class);

        });
    }
}