package com.application.app.modules.iphone11prox5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX5Binding
import com.application.app.modules.iphone11prox10.ui.Iphone11ProX10Activity
import com.application.app.modules.iphone11prox5.`data`.viewmodel.Iphone11ProX5VM
import com.application.app.modules.iphone11prox9.ui.Iphone11ProX9Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX5Activity :
    BaseActivity<ActivityIphone11ProX5Binding>(R.layout.activity_iphone_11_pro_x_5) {
  private val viewModel: Iphone11ProX5VM by viewModels<Iphone11ProX5VM>()

  public override fun setUpClicks(): Unit {
    binding.btnPaytm.setOnClickListener {

      val destIntent = Iphone11ProX9Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear1.setOnClickListener {

      val destIntent = Iphone11ProX10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX5VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X5ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX5Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
