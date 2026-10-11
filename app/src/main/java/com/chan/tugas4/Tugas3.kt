package com.chan.tugas4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.ui.graphics.Color

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
            noTelp = "Nomor telepon tidak ada",
            alamat = stringResource(R.string.alamat1),
            bgCard = colorResource(R.color.card_1_bg)
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
        TemplateCard(
            modifier = Modifier,
            stringResource(R.string.nama4),
            stringResource(R.string.noTelp4),
            stringResource(R.string.alamat4),
            colorResource(R.color.card_4_bg)
        )
        Box(modifier = Modifier.fillMaxSize()){
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}

@Composable
fun TemplateCard(
    modifier: Modifier,
    nama: String,
    noTelp: String,
    alamat: String,
    bgCard: Color,
){
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(10.dp),
        colors = CardDefaults.cardColors(containerColor = bgCard)
    ){
        Row(){
            val gambar = painterResource(R.drawable.logo_umy)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(15.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nama,
                    fontSize = 20.sp,
                    color = colorResource(R.color.white),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 15.dp)
                )
                Text(
                    text = noTelp,
                    fontSize = 10.sp,
                    color = colorResource(R. color.white)
                )
                Text(
                    text = alamat,
                    fontSize = 10.sp,
                    color = colorResource(R.color.white),
                    modifier = Modifier.padding(bottom = 15.dp)
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(15.dp)
            )
        }
    }
}