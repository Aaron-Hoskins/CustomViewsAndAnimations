package com.examples.coding.customviewsandanimations

import android.content.Context

import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

import kotlinx.android.synthetic.main.compond_view.view.*


class CompoundView : LinearLayout, View.OnClickListener {
    @JvmOverloads
    constructor(
        context: Context?,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
    ) : super(context, attrs, defStyleAttr)
    init {
        View.inflate(context, R.layout.compond_view, this)
        tvLike.setOnClickListener(this)
        tvdislike.setOnClickListener(this)
        tvdislike.text = "0"
        tvLike.text = "0"
    }

    override fun onLayout(
        changed: Boolean,
        l: Int,
        t: Int,
        r: Int,
        b: Int
    ) {
        super.onLayout(changed, l, t, r, b)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.tvLike -> incrementLikes()
            R.id.tvdislike -> incrementDislikes()
        }
    }

    fun incrementLikes() {
      val likes = tvLike.text.toString().toInt() + 1
        tvLike.text = likes.toString()
    }

    fun incrementDislikes() {
        val dislikes = tvdislike.text.toString().toInt() + 1
        tvdislike.text = dislikes.toString()
    }


}