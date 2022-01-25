package com.dcbrh.projecta.repo

import com.dcbrh.projecta.R
import com.dcbrh.projecta.model.ProductModel

object ProductTestData {

    private val productModel = ProductModel(
        1,
        R.mipmap.testbag,
        R.string.testProductName.toString(),
        R.string.testProductInfo.toString(),
        R.string.testProductPrice.toString()
    )

    val productList: List<ProductModel> = listOf(
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel
        )

}