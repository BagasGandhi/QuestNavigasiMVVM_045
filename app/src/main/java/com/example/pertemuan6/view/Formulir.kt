package com.example.pertemuan6.view

import androidx.compose.ui.res.colorResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = list0f("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier = Modifier,
        TopAppBar(
            tittle = {Text(stringResource(id=R.strig.home), color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                colorResource(id = R.color.teal_700))
        ) }
    )}