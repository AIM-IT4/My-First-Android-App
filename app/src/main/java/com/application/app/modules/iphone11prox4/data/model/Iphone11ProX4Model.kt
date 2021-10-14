package com.application.app.modules.iphone11prox4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX4Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHeyAmitKJha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hey_amit_k_jha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseAppToS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_app_to_s)

)
