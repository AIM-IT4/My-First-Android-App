package com.application.app.modules.iphone11prox4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX4Binding
import com.application.app.modules.a41.ui.A41Activity
import com.application.app.modules.iphone11prox4.`data`.viewmodel.Iphone11ProX4VM
import com.application.app.modules.iphone11prox5.ui.Iphone11ProX5Activity
import com.application.app.modules.iphone11prox6.ui.Iphone11ProX6Activity
import com.application.app.modules.iphone11prox7.ui.Iphone11ProX7Activity
import com.application.app.modules.iphone11prox8.ui.Iphone11ProX8Activity
import com.application.app.modules.iphone11prox9.ui.Iphone11ProX9Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX4Activity :
    BaseActivity<ActivityIphone11ProX4Binding>(R.layout.activity_iphone_11_pro_x_4) {
  private val viewModel: Iphone11ProX4VM by viewModels<Iphone11ProX4VM>()

  public override fun setUpClicks(): Unit {
    binding.btnMobikwik.setOnClickListener {

              val destIntent = Iphone11ProX9Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnPhonepe.setOnClickListener {

              val destIntent = Iphone11ProX8Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnAmazonPay.setOnClickListener {

              val destIntent = Iphone11ProX7Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnGooglePay.setOnClickListener {

              val destIntent = Iphone11ProX6Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image.setOnClickListener {

              val destIntent = A41Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnPaytm.setOnClickListener {

              val destIntent = Iphone11ProX5Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
