package com.application.app.modules.iphone11prox3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeBack: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etUsernameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
