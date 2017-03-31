package com.ltf.tools.mytoolslibrary;

import com.ltf.mytoolslibrary.viewbase.app.ApplicationBase;

/**
 * Created by Administrator on 2017/3/31.
 */

public class application extends ApplicationBase {
    @Override
    protected boolean setIsOpenCrashErrorMessage() {
        return true;
    }

    @Override
    public String setCrashErrorMessageName() {
        return "JiaBao";
    }
}
