package com.jhn.mvprecyclerview;

public class MainPresenter implements Contract.IPresenter{
    Contract.IView mView;
    MainData data;

    public MainPresenter(Contract.IView mView) {
        this.mView = mView;
        data = new MainData(this);
    }
}
