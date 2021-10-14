package com.application.app.modules.iphone11prox2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterEmail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEnterPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIfAlreadyRegs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_already_regs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)

)
