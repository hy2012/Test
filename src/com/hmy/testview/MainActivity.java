package com.hmy.testview;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {

	private MyLinearLayout layout;
	private MyView view;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("sss");
        
        layout = (MyLinearLayout) findViewById(R.id.layout);
        view = (MyView) findViewById(R.id.view);
        System.out.println("layout--width" + layout.getMeasuredWidth());
        
        iniBtn();
    }

    private void iniBtn() {
    	RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    	Button bt = new Button(this);
		bt.setText("button");
		bt.setLayoutParams(lp);
		bt.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
		System.out.println(" \r\n°´Å¥¿í£º" + bt.getMeasuredWidth() 
				+ "\r\n¸ß:" + bt.getMeasuredHeight());		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
