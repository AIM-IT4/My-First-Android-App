package com.application.app.modules.splash.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splash.`data`.model.SplashModel

public class SplashVM : ViewModel() {
  public val splashModel: MutableLiveData<SplashModel> = MutableLiveData(SplashModel())
}
