package com.chan.tugas4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayoutUtama(modifier: Modifier){
    Column(modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(25.dp))
        TemplateCard(
            modifier = Modifier,
            stringResource(R.string.nama1),
            stringResource(R.string.alamat1),
            colorResource(R.color.card_1_bg)
        )
        TemplateCard(
            modifier = Modifier,
            stringResource(R.string.nama2),
            stringResource(R.string.noTelp2),
            stringResource(R.string.alamat2),
            colorResource(R.color.card_2_bg)
        )
        TemplateCard(
            modifier = Modifier,
            stringResource(R.string.nama3),
            stringResource(R.string.noTelp3),
            stringResource(R.string.alamat3),
            colorResource(R.color.card_3_bg)
        )

    }
}