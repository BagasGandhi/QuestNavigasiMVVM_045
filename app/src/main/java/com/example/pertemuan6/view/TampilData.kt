package com.example.pertemuan6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Scaffold
import androidx.compose.ui.res.colorResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.Jenis_Kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat),"Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = { Text(text = stringResource(id = "Tampilan Data"), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.teal_700))
            )
        }){ isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,) {
            Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy (
                    dimensionResource(id = R.dimen.padding_small))) {
                items.forEach { item ->
                    Column {
                        Text(text = item.first.uppercase(), fontSize = 16.sp)
                        Text(text = item.second, fontWeight = FontWeight.Bold, fontFamily =
                            FontFamily.Cursive, fontSize = 22)
                    }
                    HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
            }
            Spacer(modifier = Modifier.weight(10.dp))
            Button(
                modifier = Modier.fillMaxWidth(),
                onClick = onBackBtnClick {
                    Text(text = stringResource(id = R.string.back))
                }
            }
        }
    }




