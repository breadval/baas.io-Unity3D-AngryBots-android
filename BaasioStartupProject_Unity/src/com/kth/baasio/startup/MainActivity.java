
package com.kth.baasio.startup;

import com.kth.baasio.callback.BaasioCallback;
import com.kth.baasio.entity.entity.BaasioEntity;
import com.kth.baasio.exception.BaasioException;
import com.unity3d.player.UnityPlayerProxyActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends UnityPlayerProxyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BaasioEntity entity = new BaasioEntity("greeting");
        entity.setProperty("greeting",
                getString(R.string.success_baasio) + "\n\n생성시간:" + System.currentTimeMillis());

        entity.saveInBackground(new BaasioCallback<BaasioEntity>() {

            @Override
            public void onResponse(BaasioEntity response) {
                if (response != null) {
                    Log.e("UnityTest", "성공하였습니다.");
                    Toast.makeText(MainActivity.this, "성공하였습니다.", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onException(BaasioException e) {
                Log.e("UnityTest", "실패하였습니다.: " + e.toString());
                Toast.makeText(MainActivity.this, "실패하였습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }

}
