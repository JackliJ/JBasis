package com.jbasis.component;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

/**
 * @ProjectName: JBasis
 * @Package: com.jbasis.component
 * @ClassName: JBasis
 * @Description: 主接口
 * @Author: www.lijin@foxmail.com
 * @CreateDate: 2020-06-22 15:36
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020-06-22 15:36
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class JBasis {


    public static void init(Context mContext) {

    }

    /**
     * 检查权限是否通过
     *
     * @param context     上下文
     * @param permissions 权限组
     */
    public static boolean CheckPerMissionsList(Context context, String[] permissions) {
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(context, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }
}
