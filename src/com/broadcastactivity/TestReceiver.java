package com.broadcastactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TestReceiver extends BroadcastReceiver {
	public TestReceiver() {
		System.out.println("TestReceiver");
	}

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		System.out.println("onReceiver");
	}

}
