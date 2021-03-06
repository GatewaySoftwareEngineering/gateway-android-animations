package com.gateway.android.animation

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gateway.android.bannerads.util.OnBannerClickListener
import com.gateway.android.bannerads.view.BannerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = ArrayList<String>()
        images.add("https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/all-vehicles/elantra-cn7-hybrid-quater-view-polar-white.png")
        images.add("https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/all-vehicles/accent-hc-quarter-view-silk-silver-pc.png")
        images.add("https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/all-vehicles/azera-ig-fl-quater-view-oxford-blue.png")

        val bannerImage: BannerView = findViewById(R.id.banner_frame_layout)
        bannerImage.imagesUrl = images
        bannerImage.start()
        bannerImage.setOnClickListener(OnBannerClickListener {
            Toast.makeText(this, "$it", Toast.LENGTH_SHORT).show()
        })
        bannerImage.animationsPeriod(
            fadeIn = 500,
            fadeOut = 500,
            displayImage = 3000
        )
//        bannerImage.setanimation()
        bannerImage.setScaleType(ImageView.ScaleType.CENTER)
        bannerImage.onFadeInListener {
            Toast.makeText(this, "$it", Toast.LENGTH_SHORT).show()
        }
    }
}