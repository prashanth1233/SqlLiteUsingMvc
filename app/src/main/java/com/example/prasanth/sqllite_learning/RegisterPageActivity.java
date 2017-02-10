package com.example.prasanth.sqllite_learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterPageActivity extends Activity {
    private Button button;
    private EditText first_Name,last_Name,sweet_Name;
    private String first_Name1,last_Name1;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout1);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_Name=(EditText)findViewById(R.id.name1);
                last_Name=(EditText)findViewById(R.id.name2);
                sweet_Name=(EditText)findViewById(R.id.nickName);
                first_Name1=first_Name.getText().toString();
                last_Name1=last_Name.getText().toString();
                Model model=new Model();
                model.setFirstName(first_Name1);
                model.setLastName(last_Name1);
                model.setNickName(sweet_Name.getText().toString());
                SqlData sqlData=new SqlData(RegisterPageActivity.this);
               long checking= sqlData.insertData(model);
                if(checking==-1) {

                    Toast.makeText(RegisterPageActivity.this, "REGISTRATION FAILED", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(RegisterPageActivity.this,"DATA SUCSSFULLY INSERTED",Toast.LENGTH_SHORT).show();
                    Toast.makeText(RegisterPageActivity.this, "SUCCESSFULLY REGISTERED", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(RegisterPageActivity.this,LoginPageActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
