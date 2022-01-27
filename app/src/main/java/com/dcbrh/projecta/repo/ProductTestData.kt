package com.dcbrh.projecta.repo

import com.dcbrh.projecta.R
import com.dcbrh.projecta.model.ProductModel

object ProductTestData {


    private val productModel = ProductModel(
        1,
        R.mipmap.testbag,
        "Louis Vuitton",
        "Pégase Légère 55 Business",
        "$3,574"
    )

    val productList: List<ProductModel> = listOf(
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel,
        productModel
        )

}