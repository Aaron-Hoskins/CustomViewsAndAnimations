package com.examples.coding.customviewsandanimations

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

class CircleView(context: Context, attributes: AttributeSet?, defStyleAttr : Int)
    : View(context, attributes, defStyleAttr), View.OnClickListener {
    constructor(context: Context)
            : this(context, null)
    constructor(context: Context, attributes: AttributeSet?)
            : this(context, attributes, 0)
    val typedArray = context
        .obtainStyledAttributes(attributes, R.styleable.CircleView)
    init {
        this.setOnClickListener(this)
    }

    var radius = typedArray.getInt(R.styleable.CircleView_radius, 30)
    val fillColor = typedArray.getInt(R.styleable.CircleView_fillColor, 0)
    val xPosition = typedArray.getInt(R.styleable.CircleView_xPosition, 50)
    val yPosition = typedArray.getInt(R.styleable.CircleView_yPosition, 50)
    var isVisable : Boolean  = true


    //Rendering the view dictated by what is define on the canvas
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint = Paint()
        paint.color = fillColor
        if(radius > 500) {
            radius = 500
        }
        canvas?.drawCircle(
            xPosition.toFloat(),
            yPosition.toFloat(),
            radius.toFloat(),
            paint)
    }

    //Making considerations for layout size (screen size)
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onClick(p0: View?) {
       isVisable = isVisable.not()
        if(isVisable) {
            visibility = VISIBLE
        } else {
            visibility = INVISIBLE
        }
    }
}