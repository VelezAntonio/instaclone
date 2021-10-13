import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.instaclone.R;

public class LoginActivity extends A{
    public static final String TAG = "LoginActivity";
    private EditText etUsername;
    private EditText etPassword;
    private Button etLogin;
}
@Override
protected Void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_activity);

    etUsername=findViewById(R.id.etUsername);
}

    private void setContentView(int login_activity) {
    }