package com.example.uidesignlivloud

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewAdapter(val context:Context): PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private val images = arrayOf<Int>(R.drawable.ico_tuts1,R.drawable.ico_tuts2,R.drawable.ico_tuts3)



    override fun getCount(): Int {
        return images.size
    }


    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view === obj
    }

    override fun instantiateItem(container: ViewGroup, position: Int): View {
        layoutInflater = context!!.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater!!.inflate(R.layout.item,null)
        val imageView:ImageView=view.findViewById(R.id.image_view)
        imageView.setImageResource(images[position])

        container.addView(view)
        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {

        val view:View =obj as View
        container.removeView(view)
    }

}
