package com.example.composequadrant

import android.os.Bundle
import androidx.compose.ui.graphics.Color
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant(title_1="Text composable", title_1_info="Displays text and follows the recommended Material Design guidelines.",
                        title_2="Image composable",title_2_info="Creates a composable that lays out and draws a given Painter class object.",
                        title_3="Row composable",title_3_info="A layout composable that places its children in a horizontal sequence.",
                        title_4="Column composable",title_4_info="A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}


@Composable
fun ComposeQuadrant(title_1:String,title_1_info:String,title_2:String,title_2_info:String,title_3:String,title_3_info:String,title_4:String,title_4_info:String) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            DisplayCard(
                title = title_1,
                description = title_1_info,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            DisplayCard(
                title = title_2,
                description = title_2_info,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            DisplayCard(
                title = title_3,
                description = title_3_info,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            DisplayCard(
                title = title_4,
                description = title_4_info,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun DisplayCard(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    backgroundColor: Color
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant(title_1="Text composable", title_1_info="Displays text and follows the recommended Material Design guidelines.",
            title_2="Image composable",title_2_info="Creates a composable that lays out and draws a given Painter class object.",
            title_3="Row composable",title_3_info="A layout composable that places its children in a horizontal sequence.",
            title_4="Column composable",title_4_info="A layout composable that places its children in a vertical sequence.")
    }
}