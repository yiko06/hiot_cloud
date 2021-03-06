package com.example.hiot_cloud.test.mvptest;


import com.example.hiot_cloud.base.BasePresenter;
import com.example.hiot_cloud.test.mvptest.dagger2test.ThirdObj;
import com.example.hiot_cloud.test.mvptest.model.User;

import javax.inject.Inject;

public class TestPresenter extends BasePresenter<TestView> {

    @Inject
    ThirdObj thirdObj;
    @Inject
    public TestPresenter() {
    }


    public void login(User user){
        thirdObj.thirdAction();
        if ("miaojincheng".equals(user.getUserName()) && "123".equals(user.getPassword())){
            getView().showMessage("登陆成功");
        }else{
            getView().showMessage("登陆失败");
        }
    }


}
