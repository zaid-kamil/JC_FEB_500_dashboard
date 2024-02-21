package com.digi.jc_feb_500_dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.digi.jc_feb_500_dashboard.ui.theme.JC_FEB_500_dashboardTheme

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow)
            .padding(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "logo",
                modifier = Modifier.size(40.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "logo",
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        Color.White,
                        shape = CircleShape
                    )
                    .padding(16.dp)
            )
        }
        Text(
            text = "Financial Dashboard",
            style = MaterialTheme.typography.displayLarge,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(8.dp),
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column {
                Text(
                    text = "$10,7k",
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Total Balance",
                    style = MaterialTheme.typography.headlineSmall,
                )
            }
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.ic_link),
                    contentDescription = "link",
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color.White, shape = CircleShape)
                        .padding(28.dp)
                        .rotate(45f)
                )

                Icon(
                    painter = painterResource(id = R.drawable.ic_chart),
                    contentDescription = "chart",
                    modifier = Modifier
                        .offset(x = (-20).dp)
                        .background(Color.Black, shape = CircleShape)
                        .size(80.dp)
                        .padding(28.dp),
                    tint = Color.White
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = Color.White,
                        shape = MaterialTheme.shapes.extraLarge
                    ),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow),
                        contentDescription = "withdraw",
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        text = "Withdraw",
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = Color.White,
                        shape = MaterialTheme.shapes.extraLarge
                    ),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow),
                        contentDescription = "Deposit",
                        modifier = Modifier
                            .size(40.dp)
                            .rotate(180f)
                    )
                    Text(
                        text = "Deposit",
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    JC_FEB_500_dashboardTheme {
        DashboardScreen()
    }
}