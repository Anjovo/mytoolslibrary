package com.ltf.tools.mytoolslibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ltf.mytoolslibrary.viewbase.base.ActivityTitleBase;
import com.ltf.mytoolslibrary.viewbase.takephoto.TakephotoUtils;
import com.ltf.mytoolslibrary.viewbase.takephoto.bean.ImageItem;
import com.ltf.mytoolslibrary.viewbase.utils.PicassoUtil;
import com.ltf.mytoolslibrary.viewbase.utils.show.L;
import com.ltf.mytoolslibrary.viewbase.video.TakeVideoUtils;

import java.util.ArrayList;

/**工具类库
 * 使用用例**/
public class MainActivity extends ActivityTitleBase {

    @Override
    protected void initTitle() {
        setUpTitleBack();
        setUpTitleCentreText("中心文字");
    }

    @Override
    public void initisBack() {
        super.initisBack();
        setIsBackUp(false);//设置当前界面不能滑动返回上个界面
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PicassoUtil.getInstantiation().onWidgetImage(this,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1494238909619&di=0e293f376ea537a36ace082e0b659ae8&imgtype=0&src=http%3A%2F%2Fwww.zhlzw.com%2FUploadFiles%2FArticle_UploadFiles%2F201204%2F20120412123906588.jpg", (ImageView) findViewById(R.id.imgs));
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
//        TakephotoUtils.getTakephotoUtils().initImagePickerMore(this);
//        TakephotoUtils.getTakephotoUtils().startTakePhoto(this, new TakephotoUtils.onUserSelectPicBackLisnner() {
//            @Override
//            public void onUserSelectPicBack(ArrayList<ImageItem> pic) {
//                if(pic !=null&&pic.size()>0)
//                L.d("mainActivity",pic.get(0).path);//拍照返回
//            }
//        });
        TakeVideoUtils.getTakeVideoUtils().startTakeVideo(this, false, new TakeVideoUtils.onTakeVideoClickLisnner() {
            @Override
            public void onTakeVideoClickBack(String videoPath) {
                L.d("mainActivity",videoPath);//录制视频返回
            }
        });
    }

}
