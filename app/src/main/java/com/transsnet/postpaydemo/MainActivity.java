package com.transsnet.postpaydemo;

import android.app.Activity;
import android.os.Bundle;

import com.transsnet.postpay.PostPayManager;
import com.transsnet.toastutil.ToastUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String postPayPrivateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAPBRD21hcu5N0hVHugi2Y0k0WqRk/1VeBdA+qkat8e7pLJIldK8XgMfY3G9KY+vKy6mmcHM4e/daGDSW1a/loTncxJRX7neH8a7zCzuDJF/4kUwMseChuVTos/TcaL0QAjtwUdfcrTzmTbEt1JlTi+FLOzT7nwQwVGdklZVezUtLAgMBAAECgYB7y0YHMovh9nSiQbCzjEDZFP8ccGqXrzePbriIcFKQn801+9V/3LuaNzxWmBug+3auje6fbBlv8hlF/e1WDxRdmpnTbqQrtey2GtMAUc7+7eEeqwTAnKkQ37tFBXCGmxHbfluTatGNHYtwC2ruO82/YOQYm8/lUeYHAcP58zcFAQJBAP687z6gFKHTnXO53WZckMJRWXgN/lhAHRQ0gxTd/3y9fIYhIcnDgMSkccB9sL05roxN3TZpZDD94i0ID41eDtUCQQDxgdYM/piR+VYcfRUJfqTFalEfp62e0HiNTuCqvtHeyoUKSc/9R3Xj1z+9NfSrOEVRtNqPwtdPFckZ3aGMJkGfAkEAkrJhIHJ1jz/bQ6K8ok8aOh045c9BMrcxR8p51lGF6OMCTAfWemewxw1gSJbZag9Gupu4kbYdsazzTDWBJ0sMRQJARoVUPM0nPhDhzUXVG8WoVaE6+RRchXB4k0LCJfm8jOL0QFHXcy0nxpU3Hogf3tN6omY+IBaUCprg8zWdk7AkHwJBAIS+5UIITN7x3JV6QBaRbxwY3LLdd1AA20rtQiY6iyBBsvkgULaMWpFYORd28Uad2hFC9yGPDAXR9CgLbK8v+yM\u003d";
        String token = "P_1f6defc5_a233_4582_b50c_c59b9570ccec_T_02eb4798_3360_496f_a84b_f91664fb0e18";
        Class sw = App.getClasss();
//        PostPayManager.init(App.mApplication, "L45655939592","0000001",postPayPrivateKey,"NG",sw,"www.baidu.com");
        PostPayManager.init(App.mApplication,"L45655939592","0000001",postPayPrivateKey,"NG",sw,"www/baidu");

        ToastUtils.toast(this,"hhhhh");
    }

}