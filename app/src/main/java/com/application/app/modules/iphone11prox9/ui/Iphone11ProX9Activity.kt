package com.application.app.modules.iphone11prox9.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX9Binding
import com.application.app.modules.iphone11prox9.`data`.viewmodel.Iphone11ProX9VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX9Activity :
    BaseActivity<ActivityIphone11ProX9Binding>(R.layout.activity_iphone_11_pro_x_9) {
  private val viewModel: Iphone11ProX9VM by viewModels<Iphone11ProX9VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX9VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X9ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX9Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
