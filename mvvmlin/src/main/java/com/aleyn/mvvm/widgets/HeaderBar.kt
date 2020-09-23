package com.aleyn.mvvm.widgets

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.aleyn.mvvm.R
import kotlinx.android.synthetic.main.widgets_header_bar.view.*


/**
 * @name ShopManageSystem
 * @class name：com.yunbao.loan.widgets
 * @anthor zhangchuang
 * @time 2018/5/9 10:48
 * @change
 * @chang time
 * @class describe
 */
class HeaderBar @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var headerBgColor: Int? = null
    private var backIconType: Int? = -1     //根据此值判断是否应该显示，以及显示哪种图片
    private var leftText: String? = null
    private var leftTextColor: Int? = null
    private var titleText: String? = null
    private var titleTextColor: Int? = null
    private var rightText: String? = null
    private var rightTextColor: Int? = null
    private var rightImage: Int? = -1    //右侧图片显示

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.HeaderBar)
        headerBgColor = typedArray.getColor(R.styleable.HeaderBar_headerBgColor, Color.WHITE)
        backIconType = typedArray.getInteger(R.styleable.HeaderBar_backIconType, -1)
        leftText = typedArray.getString(R.styleable.HeaderBar_leftText)
        titleText = typedArray.getString(R.styleable.HeaderBar_titleText)
        rightText = typedArray.getString(R.styleable.HeaderBar_rightText)
        leftTextColor = typedArray.getColor(R.styleable.HeaderBar_textColor, Color.WHITE)
        titleTextColor = typedArray.getColor(R.styleable.HeaderBar_textColor, Color.WHITE)
        rightTextColor = typedArray.getColor(R.styleable.HeaderBar_textColor, Color.WHITE)
        rightImage = typedArray.getInteger(R.styleable.HeaderBar_rightImage, -1)
        initView()
        typedArray.recycle()
    }

    private fun initView() {
        View.inflate(context, R.layout.widgets_header_bar, this)
        //设置间隔状态栏的高度
        this.setStatusBarPadding()
        //根据backIconType判断是否需要显示返回键
        if (backIconType == 0) {
            leftImageView.visibility = View.VISIBLE
            leftImageView.setImageResource(R.mipmap.ic_back_white)
        } else if (backIconType == 1) {
            leftImageView.visibility = View.VISIBLE
            leftImageView.setImageResource(R.mipmap.ic_back_black)
        } else {
            leftImageView.visibility = View.GONE
        }
        //控制左中右的文字显示
        leftText?.let {
            leftTextView.text = it
            leftTextView.visibility = View.VISIBLE
        }
        rightText?.let {
            rightTextView.text = it
            rightTextView.visibility = View.VISIBLE
        }
        titleText?.let {
            centerTextView.text = it
            centerTextView.visibility = View.VISIBLE
        }
        //控制左中右的颜色
        leftTextColor?.let { leftTextView.setTextColor(it) }
        titleTextColor?.let { centerTextView.setTextColor(it) }
        rightTextColor?.let { rightTextView.setTextColor(it) }
        //控制右侧图片的显示
        if (rightImage != -1) {
            rightImageView.visibility = View.VISIBLE;
            rightImageView.setImageResource(rightImage!!);
        }

        leftImageView.onSingleClick {
            (context as Activity).onBackPressed()
        }
        leftTextView.onSingleClick {
            onHeaderBarItemClickListener?.onLeftTextClick(leftTextView)
        }
        centerTextView.onSingleClick {

        }
        rightTextView.onSingleClick {
            onHeaderBarItemClickListener?.onRightTextClick(rightTextView)
        }
        rightImageView.onSingleClick {
            onHeaderBarItemClickListener?.onRightImageClick(rightImageView)
        }
    }

    /* 获取左侧视图 */
    fun getLeftView(): ImageView {
        return leftImageView
    }

    fun getLeftText(): TextView {
        return leftTextView
    }

    //设置左侧文字
    fun setLeftText(leftText: String): HeaderBar {
        setLeftText(leftText, 0)
        return this;
    }

    fun setLeftText(leftText: String, leftIcon: Int): HeaderBar {
        setLeftText(leftText, leftIcon, 0)
        return this;
    }

    /**
     * iconPosition   图片位置：0 ，1，2，3 对应 左上右下
     */
    fun setLeftText(leftText: String, leftIcon: Int, iconPosition: Int): HeaderBar {
        leftTextView.visibility = View.VISIBLE
        leftTextView.text = leftText
        if (leftIcon != 0) {
            when (iconPosition) {
                0 -> leftTextView.setCompoundDrawablesWithIntrinsicBounds(leftIcon, 0, 0, 0)
                1 -> leftTextView.setCompoundDrawablesWithIntrinsicBounds(0, leftIcon, 0, 0)
                2 -> leftTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, leftIcon, 0)
                3 -> leftTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, leftIcon)
                else -> leftTextView.setCompoundDrawablesWithIntrinsicBounds(leftIcon, 0, 0, 0)
            }
        }
        return this;
    }

    /**
     * 设置右侧文字图标
     */
    fun setRightTextDrawAble(resourceId: Int): HeaderBar {
        getRightView().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, resourceId, 0)
        getRightView().compoundDrawablePadding = 20
        return this
    }

    /* 获取右侧视图 */
    fun getRightView(): TextView {
        return rightTextView
    }

    /* 获取标题视图 */
    fun getTitleView(): TextView {
        return centerTextView
    }

    /* 获取右侧文字 */
    fun getRightText(): TextView {
        return rightTextView
    }

    /*-设置标题-*/
    fun setTitleText(title: String): HeaderBar {
        this.titleText = title
        centerTextView.text = title
        centerTextView.visibility = View.VISIBLE
        return this
    }

    //设置右侧图片
    fun setRightImage(imageResource: Int): HeaderBar {
        rightImageView.visibility = View.VISIBLE
        rightImageView.setImageResource(imageResource)
        return this
    }

    //回调接口
    private var onHeaderBarItemClickListener: OnHeaderBarItemClickListener? = null;

    fun setHeaderBarItemClickListener(onHeaderBarItemClickListener: OnHeaderBarItemClickListener): HeaderBar {
        this.onHeaderBarItemClickListener = onHeaderBarItemClickListener;
        return this
    }

    interface OnHeaderBarItemClickListener {
        fun onLeftTextClick(view: TextView)
        fun onRightTextClick(view: TextView)
        fun onRightImageClick(view: ImageView)
    }

}