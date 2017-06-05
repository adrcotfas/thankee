package com.example.adrcotfas.thankee;

public class MainPresenter implements IMainPresenter{

    private IMainView mView;

    MainPresenter(IMainView view) {
        this.mView = view;
    }

    @Override
    public void onFabClick() {
        mView.goToAddEditActivity();
    }
}
