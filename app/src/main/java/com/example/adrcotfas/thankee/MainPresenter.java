package com.example.adrcotfas.thankee;

public class MainPresenter implements IMainPresenter{

    private IMainView mView;

    MainPresenter(IMainView view) {
        this.mView = view;
        displayEntries();
    }

    @Override
    public void onFabClick() {
        mView.goToAddEditActivity();
    }

    private void displayEntries() {
        mView.displayEntries();
    }
}
