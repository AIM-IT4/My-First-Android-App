package com.application.app.modules.iphone11prox2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX2Binding
import com.application.app.modules.iphone11prox2.`data`.viewmodel.Iphone11ProX2VM
import com.application.app.modules.iphone11prox3.ui.Iphone11ProX3Activity
import com.application.app.modules.iphone11prox4.ui.Iphone11ProX4Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX2Activity :
    BaseActivity<ActivityIphone11ProX2Binding>(R.layout.activity_iphone_11_pro_x_2) {
  private val viewModel: Iphone11ProX2VM by viewModels<Iphone11ProX2VM>()

  public override fun setUpClicks(): Unit {
    binding.image.setOnClickListener {

              val destIntent = Iphone11ProX4Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.txtSignIn.setOnClickListener {

              val destIntent = Iphone11ProX3Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
