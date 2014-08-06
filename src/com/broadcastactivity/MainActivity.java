package com.broadcastactivity;

import junit.framework.Test;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button sendButton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sendButton = (Button) findViewById(R.id.sendButton);
		sendButton.setOnClickListener(new sendButtonListener());
	}

	class sendButtonListener implements View.OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			TestReceiver tr = new TestReceiver();
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_EDIT);
			intent.setClass(MainActivity.this, TestReceiver.class);
			MainActivity.this.sendBroadcast(intent);
		}

	}
}
