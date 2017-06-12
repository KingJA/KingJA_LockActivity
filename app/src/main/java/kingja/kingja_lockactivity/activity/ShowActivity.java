package kingja.kingja_lockactivity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import kingja.kingja_lockactivity.R;

/**
 * ����״̬��Ҫ��ʾ��activity
 * 
 * @author xiaoyf
 *
 * @createTime 2016��1��25�� ����11:50:29
 */
public class ShowActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		getWindow().addFlags(
//				WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
//						| WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
//						| WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		getWindow().addFlags(
				WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED|               //这个在锁屏状态下
						WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
						| WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
						| WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.show_layout);

	}

	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.ok:// ȷ��
			Intent intent = new Intent(this, MainActivity.class);
			startActivity(intent);
			finish();
			break;
		case R.id.cancle:// ȡ��
			Toast.makeText(getApplicationContext(), "ȡ����ת", Toast.LENGTH_LONG)
					.show();
			finish();
			break;
		default:
			break;
		}
	}

}
