package com.application.app.modules.iphone11prox10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX10Binding
import com.application.app.modules.iphone11prox10.`data`.viewmodel.Iphone11ProX10VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX10Activity :
    BaseActivity<ActivityIphone11ProX10Binding>(R.layout.activity_iphone_11_pro_x_10) {
  private val viewModel: Iphone11ProX10VM by viewModels<Iphone11ProX10VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX10VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X10ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
