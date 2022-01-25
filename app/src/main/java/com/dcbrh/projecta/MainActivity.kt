package com.dcbrh.projecta

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dcbrh.projecta.model.ProductModel
import com.dcbrh.projecta.repo.ProductTestData
import com.dcbrh.projecta.ui.theme.ProjectATheme

class MainActivity : ComponentActivity() {

    lateinit var testProduct: ProductModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testProduct = ProductTestData.productList[0]

        setContent {mainLayout(testProduct)}
    }


}

@Composable
private fun mainLayout(_product: ProductModel) {
    ProjectATheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Product(_product = _product)
        }
    }
}

@Composable
fun Product(_product: ProductModel) {
    Row {
        Image(
            painter = painterResource(id = _product.productImage),
            contentDescription = "Product Image"
        )
        Column() {
            Text(text = "${_product.productBrand}")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "${_product.productName}")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "${_product.productPrice}")
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ProjectATheme {
//    }
//}