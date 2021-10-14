package com.application.app.modules.iphone11prox8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX8Binding
import com.application.app.modules.iphone11prox8.`data`.viewmodel.Iphone11ProX8VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX8Activity :
    BaseActivity<ActivityIphone11ProX8Binding>(R.layout.activity_iphone_11_pro_x_8) {
  private val viewModel: Iphone11ProX8VM by viewModels<Iphone11ProX8VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX8VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
