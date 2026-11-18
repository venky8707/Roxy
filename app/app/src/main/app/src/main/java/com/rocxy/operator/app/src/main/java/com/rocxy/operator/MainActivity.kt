package com.rocxy.operator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                RocxyHome()
            }
        }
    }
}

@Composable
fun RocxyHome() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "ROCXY",
                style = MaterialTheme.typography.displayMedium
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Mobile Operator",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text("Your personal voice assistant")

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {}) {
                Text("Initialize ROCXY")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text("System Status: Initializing")
        }
    }
}
