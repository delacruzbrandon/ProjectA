package com.dcbrh.projecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dcbrh.projecta.model.ProductModel
import com.dcbrh.projecta.repo.ProductTestData
import com.dcbrh.projecta.ui.theme.ProjectATheme

class MainActivity : ComponentActivity() {

    private lateinit var testProduct: ProductModel
    private lateinit var testProductList: List<ProductModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testProduct = ProductTestData.productList[0]
        testProductList = ProductTestData.productList

        setContent { MainLayout(testProductList) }
    }


}

@Composable
private fun MainLayout(_productList: List<ProductModel>) {
    ProjectATheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            ProductList(_productList = _productList)
        }
    }
}

@Composable
fun ProductList(_productList: List<ProductModel>) {
    LazyColumn {
        items(_productList) { _product ->
            Product(_product = _product)
        }
    }

}

@Composable
fun Product(_product: ProductModel) {

    var isExpanded by remember { mutableStateOf(true) }

    Row(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = _product.productImage),
            contentDescription = "Product Image",
            modifier = Modifier
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = _product.productBrand,
                modifier = if(!isExpanded) Modifier.height(0.dp) else Modifier.fillMaxHeight()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = _product.productName)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = _product.productPrice)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectATheme {
        ProductList(_productList = ProductTestData.productList)
    }
}