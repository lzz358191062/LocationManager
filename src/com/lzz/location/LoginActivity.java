package com.lzz.location;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	private EditText et_name;
	private EditText et_password;
	private Button btn_login;
	private Button btn_register;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		et_name = (EditText) findViewById(R.id.name);
		et_password = (EditText) findViewById(R.id.password);
		btn_login = (Button) findViewById(R.id.button1);
		btn_register = (Button) findViewById(R.id.button2);
	}
}
