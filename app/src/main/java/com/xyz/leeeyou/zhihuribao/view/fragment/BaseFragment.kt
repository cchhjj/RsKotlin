package com.xyz.leeeyou.zhihuribao.view.fragment

import android.support.v4.app.Fragment

/**
 * @author:         leeeyou
 * @description:    基类
 * @date:           2017/4/26
 */
abstract class BaseFragment : Fragment() {
    abstract fun checkCanDoRefresh(): Boolean
    abstract fun updateData()
}