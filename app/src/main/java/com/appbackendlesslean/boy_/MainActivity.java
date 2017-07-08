package com.appbackendlesslean.boy_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;


public class MainActivity extends AppCompatActivity {
    //เอาจากเว็บมาใส่
    //step 1.2
    public static final String APP_ID = "B2243B95-73AB-DA90-FFEF-3F609A0F5D00";
    public static final String SECRET_KEY = "480CBB60-52FF-370A-FF90-AA31B2C2AE00";
    public static final String VERSION = "v1";

    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 1.1 : init backendless
        Backendless.initApp( this, APP_ID, SECRET_KEY, VERSION );
        BackendlessUser user = new BackendlessUser();
        user.setEmail( "michael@backendless.com" );
        user.setPassword( "my_super_password" );

        Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {


            @Override
                    public void handleResponse(BackendlessUser response) {
                        Log.d(TAG,"Response : "+response.toString());
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Log.d(TAG,"Fault : "+fault.toString());
                    }
                });
//        Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
//        startActivity(intent);
    }
}
