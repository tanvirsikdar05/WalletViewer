package com.tanvirsikdar.walletviewer

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

class WalletViewer @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : LinearLayout(context, attrs, defStyle)  {

    private lateinit var see_blance: CardView
    private lateinit var blanceText: TextView
    private lateinit var wrap_lyt: CardView
    private lateinit var currencyImageView: ImageView

    init {
        LayoutInflater.from(context).inflate(R.layout.blance_view, this, true)
        init()
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.WalletViewer, 0, 0)
            val currencyImageResId = typedArray.getResourceId(R.styleable.WalletViewer_currencyImage, 0)
            setCurrencyImage(currencyImageResId)
            typedArray.recycle()
        }
    }

    private fun init() {
        see_blance = findViewById(R.id.cardView)
        blanceText = findViewById(R.id.tv_blance)
        wrap_lyt = findViewById(R.id.wraplyt)
        currencyImageView = findViewById(R.id.currency)
        see_blance.setOnClickListener {
            if (see_blance.isClickable) {
                show()
            }
        }
    }

    fun show() {
        if (see_blance.isClickable) {
            val blance_refresh = AnimationUtils.loadAnimation(
                context, R.anim.out_from_right
            )
            see_blance.isClickable = false
            wrap_lyt.startAnimation(blance_refresh)
            wrap_lyt.visibility = View.GONE
            Handler().postDelayed({
                wrap_lyt.visibility = View.VISIBLE
                see_blance.isClickable = true
            }, 5000)
        }
    }

    fun setCurrentBlance(currentBlance: String = "0") {
        blanceText.text = currentBlance
    }

    fun setCurrencyImage(resId: Int) {
        currencyImageView.setImageResource(resId)
    }
}