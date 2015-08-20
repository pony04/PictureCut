package com.holypony.piccut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /***
     * 拍照获取图片
     */
    private ImageView fromcamera;
    /***
     * 图库获取图片
     */
    private ImageView fromgallery;
    /***
     * 文件夹获取图片
     */
    private ImageView fromfolder;

    public static final int xiangji = R.id.fromcamera; //相机
    public static final int tuku = R.id.fromgallery; //图库
    public static final int wenjianjia = R.id.fromfolder; //文件夹

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    /**
     * 初始化所有控件
     */
    private void init() {
        fromcamera = (ImageView) findViewById(R.id.fromcamera);
        fromcamera.setId(xiangji);
        fromcamera.setOnClickListener(this);

        fromgallery = (ImageView) findViewById(R.id.fromgallery);
        fromgallery.setId(tuku);
        fromgallery.setOnClickListener(this);

        fromfolder = (ImageView) findViewById(R.id.fromfolder);
        fromfolder.setId(wenjianjia);
        fromfolder.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case xiangji:
                Toast.makeText(MainActivity.this, "阿迪打开相机，请拍张靓照！", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
                break;
            case tuku:
                Toast.makeText(MainActivity.this, "222", Toast.LENGTH_LONG).show();
                break;
            case wenjianjia:
                Toast.makeText(MainActivity.this, "333", Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }

    }
}