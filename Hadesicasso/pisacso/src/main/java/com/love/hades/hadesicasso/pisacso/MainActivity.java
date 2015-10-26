package com.love.hades.hadesicasso.pisacso;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;


public class MainActivity extends ActionBarActivity {


    @Bind(R.id.iv_image)
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {
        Picasso.with(this).load("http://www.google.co.jp/imgres?imgurl=http://image.wangchao.net.cn/bt/1281393528203.jpg&imgrefurl=http://m.wangchao.net.cn/bt/pydetail_118169.html&h=450&w=600&tbnid=QB2Y3ahgNA1FrM:&docid=dLCp50uX0v5FPM&ei=0cUtVsTmNsHC0gTf3aXYCg&tbm=isch&client=safari").into(ivImage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
