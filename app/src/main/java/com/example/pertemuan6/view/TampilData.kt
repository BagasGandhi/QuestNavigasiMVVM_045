package com.example.pertemuan6.view

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


    }


}