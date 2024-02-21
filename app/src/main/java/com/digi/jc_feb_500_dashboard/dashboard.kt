@file:OptIn(
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class, ExperimentalFoundationApi::class
)

package com.digi.jc_feb_500_dashboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.digi.jc_feb_500_dashboard.ui.theme.JC_FEB_500_dashboardTheme
import com.digi.jc_feb_500_dashboard.ui.theme.Yellow50

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = (if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else Yellow50)
            )
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
                        color = MaterialTheme.colorScheme.primaryContainer, shape = CircleShape
                    )
                    .padding(16.dp)
            )
        }
        Text(
            text = "Financial Dashboard",
            style = MaterialTheme.typography.displayLarge,
            fontWeight = FontWeight.ExtraLight,
            modifier = Modifier.padding(8.dp),
            fontFamily = FontFamily(
                Font(R.font.domine),
            )
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
            Row(
                horizontalArrangement = Arrangement.spacedBy((-16).dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_link),
                    contentDescription = "link",
                    modifier = Modifier
                        .size(80.dp)
                        .background(
                            color = MaterialTheme.colorScheme.primaryContainer, shape = CircleShape
                        )
                        .padding(28.dp)
                        .rotate(45f)
                )

                Icon(
                    painter = painterResource(id = R.drawable.ic_chart),
                    contentDescription = "chart",
                    modifier = Modifier
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
                .height(220.dp)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.extraLarge)
                    .clickable { }
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = MaterialTheme.colorScheme.primaryContainer,
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
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.extraLarge)
                    .clickable { }
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        color = MaterialTheme.colorScheme.primaryContainer,
                        shape = MaterialTheme.shapes.extraLarge
                    )) {
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
        val pagerState = rememberPagerState(pageCount = {
            12
        })

        val months = listOf(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        )
        Column(
            modifier = Modifier.background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = MaterialTheme.shapes.extraLarge
            ),
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(months.size) { index ->
                    Text(
                        text = months[index],
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier
                            .clickable {

                            }
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .clip(
                                MaterialTheme.shapes.medium
                            )
                    )
                }
            }
            HorizontalPager(
                state = pagerState, modifier = Modifier.fillMaxSize()

            ) { page ->
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(16.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Transactions",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(8.dp)
                        )
                        Text(
                            text = "**** 2390",
                            style = MaterialTheme.typography.headlineSmall,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                text = "32",
                                style = MaterialTheme.typography.displayLarge,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 8.dp),
                                fontFamily = FontFamily(
                                    Font(R.font.domine),
                                )
                            )
                            Text(
                                text = "This Month",
                                style = MaterialTheme.typography.headlineSmall,
                                modifier = Modifier.padding(8.dp)
                            )
                        }
                        OverlappingRow(
                            imageList = listOf(
                                R.drawable.ic_chart, R.drawable.ic_logo, R.drawable.ic_chart
                            ),
                            offset = -20,
                            bg = MaterialTheme.colorScheme.surface,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun OverlappingRow(
    imageList: List<Int>,
    offset: Int,
    bg: Color,
    modifier: Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(offset.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        imageList.forEachIndexed { _, image ->
            Icon(
                painter = painterResource(id = image),
                contentDescription = "chart",
                modifier = Modifier
                    .size(60.dp)
                    .background(bg, shape = CircleShape)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        shape = CircleShape
                    )
                    .padding(16.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
        Text(
            text = "+7",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
                .background(bg, shape = CircleShape)
                .size(60.dp)
                .border(
                    width = 1.dp, color = MaterialTheme.colorScheme.onSurface, shape = CircleShape
                )
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    JC_FEB_500_dashboardTheme {
        DashboardScreen()
    }
}