package com.dcbrh.projecta

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dcbrh.projecta.data.SampleData
import com.dcbrh.projecta.model.Message
import com.dcbrh.projecta.ui.theme.ProjectATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectATheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages){ message ->
            MessageCard(_content = message)
        }
    }

}


@Composable
fun MessageCard(_content: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = _content.image),
            contentDescription = "Meme",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(
                    1.5.dp,
                    MaterialTheme.colors.secondary,
                    CircleShape
                )
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Text(
                text = _content.subject,
                color = MaterialTheme.colors.secondaryVariant
            )
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = _content.message,
                    modifier = Modifier.padding(4.dp),
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "DarK Mode")
@Composable
fun DefaultPreview() {

    ProjectATheme {
        Conversation(messages = SampleData.sampleConvo)
    }
}