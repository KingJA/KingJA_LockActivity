package kingja.kingja_lockactivity.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import kingja.kingja_lockactivity.activity.ShowActivity;

/**
 * ����
 * 
 * @author xiaoyf
 *
 * @createTime 2016��1��25�� ����11:49:28
 */
public class MyService extends Service {
	private int n = 0;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Thread.sleep(1000);
						n++;
						if (n % 5 == 0) {// 10��֮����ת
							Intent intent = new Intent(MyService.this,
									ShowActivity.class);
							intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
							MyService.this.startActivity(intent);
							break;
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

}
