package com.jbasis.component.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import permissions.dispatcher.RuntimePermissions;

/**
 * @ProjectName: JBasis
 * @Package: com.jbasis.component.base
 * @ClassName: 基础activity 继承android.app.Activity
 * @Description: java类作用描述
 * @Author: www.lijin@foxmail.com
 * @CreateDate: 2020-06-22 15:51
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020-06-22 15:51
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */

@RuntimePermissions
public abstract class BasisActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 加载view控件
     */
    public abstract void initView();

    /**
     * 加载数据
     */
    public abstract void initData();
}
