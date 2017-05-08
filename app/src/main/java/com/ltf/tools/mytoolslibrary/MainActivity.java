package com.ltf.tools.mytoolslibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ltf.mytoolslibrary.viewbase.base.ActivityTitleBase;
import com.ltf.mytoolslibrary.viewbase.takephoto.TakephotoUtils;
import com.ltf.mytoolslibrary.viewbase.takephoto.bean.ImageItem;
import com.ltf.mytoolslibrary.viewbase.utils.PicassoUtil;
import com.ltf.mytoolslibrary.viewbase.utils.show.L;

import java.util.ArrayList;

/**工具类库
 * 使用用例**/
public class MainActivity extends ActivityTitleBase {

    @Override
    protected void initTitle() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PicassoUtil.getInstantiation().onWidgetImage(this,"https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1487839107&di=934a0f03c91b97da2fbd2774e2a1590c&src=http://pic12.nipic.com/20110213/580124_212334691148_2.jpg", (ImageView) findViewById(R.id.imgs));
    }

    @Override
    public boolean setIsViewStaueColor() {
        return true;
    }

    @Override
    public String setStatusBarTintResource() {
        return "0";
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    public void onClickd(View v){
        TakephotoUtils.getTakephotoUtils().initImagePickerMore(this);
        TakephotoUtils.getTakephotoUtils().startTakePhoto(this, new TakephotoUtils.onUserSelectPicBackLisnner() {
            @Override
            public void onUserSelectPicBack(ArrayList<ImageItem> pic) {
                if(pic !=null&&pic.size()>0)
                L.d("mainActivity",pic.get(0).path);
            }
        });
    }

}
