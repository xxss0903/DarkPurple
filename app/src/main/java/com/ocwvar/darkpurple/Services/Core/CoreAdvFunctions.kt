package com.ocwvar.darkpurple.Services.Core

/**
 * Project DarkPurple
 * Created by OCWVAR
 * On 2017/05/17 12:12 PM
 * File Location com.ocwvar.darkpurple.Services.Core
 * This file use to :   音频Core高级功能需求接口
 */
interface CoreAdvFunctions : CoreBaseFunctions {

    /**
     * 获取均衡器各个频段参数
     * @return  均衡器参数
     */
    fun getEQParameters(): IntArray

    /**
     * 更改均衡器频段参数
     * @param eqParameter 均衡器参数 -10 ~ 10
     * @param eqIndex     调节位置
     * @return 执行结果
     */
    fun setEQParameters(eqParameter: Int, eqIndex: Int): Boolean

    /**
     * 重置均衡器
     */
    fun resetEQ()

    /**
     * 获取当前频谱数据
     * @return  频谱数据，异常返回 NULL
     */
    fun getSpectrum(): FloatArray?

}