package com.example.form

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.*
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.form.ui.theme.FormTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun App(){
    FormTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = with (Modifier){
                    fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(Color(0xFF151F42), Color(0xFF252F4F),Color(0xFF151F42))
                            )
                        )

                })
            {
                // Add more views here!
                PinnedTopAppBar()
                FormLayoutFilled()
            }



        }
    }
}
@Preview
@Composable
fun PreviewApp(){
    App()

}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PinnedTopAppBar() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val cor = listOf(Color(0xFF151F42), Color(0xFF252F4F),Color(0xFF151F42))
    Scaffold(

        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)                    .background(
            brush = Brush.horizontalGradient(
                colors = listOf(Color(0xFF151F42), Color(0xFF252F4F),Color(0xFF151F42))
            )
        ),
        topBar ={
           TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF151F42)
                ),
                title = {
                    Column() {
                        Text(text = "Cadastro", color = Color(0xFF5168D6))
                    }
                },
                navigationIcon = {

                    IconButton(
                        onClick = { /* doSomething() */ }) {
                        Icon(

                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description",
                                    tint = Color.White
                        )
                    }
                },
                actions = {
                    // RowScope here, so these icons will be placed horizontally
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Edit,
                            contentDescription = "Localized description",tint = Color.White
                        )
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.DateRange,
                            contentDescription = "Localized description",tint = Color.White
                        )
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "Localized description",tint = Color.White
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        },
        content = { innerPadding ->
            LazyColumn(

                modifier = with (Modifier){
                    fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(Color(0xFF151F42), Color(0xFF252F4F),Color(0xFF151F42))
                            )
                        )

                },
                contentPadding = innerPadding,
                verticalArrangement = Arrangement.spacedBy(8.dp),

            ) {

                item(

                ){
                    Text(""

                    )
                }
            }
        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun FormLayoutFilled() {
    val focusManager = LocalFocusManager.current
    LazyColumn(

        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(vertical = 24.dp),
                modifier = Modifier.fillMaxWidth().padding(top = 70.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFF151F42), Color(0xFF252F4F),Color(0xFF151F42))
                        )
                        )
    ) {
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)

            ){
                Image(
                    painter = painterResource(id = R.drawable.a1692903180224),
                    contentDescription = stringResource(id = R.string.app_name)
                )
            }}

        item {
            var imageUrl = remember { mutableStateOf<String?>(null) }
            Box(Modifier.fillMaxWidth()) {

            }
        }
        item {
            var text by remember { mutableStateOf("") }
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text("First name") },
                value = text,
                onValueChange = { text = it },
                singleLine = true,
                trailingIcon = {
                    AnimatedVisibility(
                        visible = text.isNotBlank(),
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        IconButton(onClick = { text = "" }) {
                            Icon(Icons.Outlined.Edit, "Clear")
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    capitalization = KeyboardCapitalization.Words
                ),
                keyboardActions = KeyboardActions {
                    focusManager.moveFocus(FocusDirection.Next)
                }
            )

        }
        item { Spacer(Modifier.height(4.dp)) }
        item {
            var text by remember { mutableStateOf("") }
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text("Last name") },
                value = text,
                onValueChange = { text = it },
                singleLine = true,
                trailingIcon = {
                    AnimatedVisibility(
                        visible = text.isNotBlank(),
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        IconButton(onClick = { text = "" }) {
                            Icon(Icons.Outlined.Edit, "Clear")
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next,
                    capitalization = KeyboardCapitalization.Words
                ),
                keyboardActions = KeyboardActions {
                    focusManager.moveFocus(FocusDirection.Next)
                }
            )
        }
        item { Spacer(Modifier.height(4.dp)) }
        item {
            var text by remember { mutableStateOf("") }
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text("Phone number") },
                value = text,
                onValueChange = { text = it },
                trailingIcon = {
                    AnimatedVisibility(
                        visible = text.isNotBlank(),
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        IconButton(onClick = { text = "" }) {
                            Icon(Icons.Outlined.Edit, "Clear")
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions {
                    focusManager.moveFocus(FocusDirection.Next)
                },
                singleLine = true,
            )
        }
        item { Spacer(Modifier.height(4.dp)) }
        item {
            var text by remember { mutableStateOf("") }
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                label = { Text("Email") },
                value = text,
                onValueChange = { text = it },
                trailingIcon = {
                    AnimatedVisibility(
                        visible = text.isNotBlank(),
                        enter = fadeIn(),
                        exit = fadeOut()
                    ) {
                        IconButton(onClick = { text = "" }) {
                            Icon(Icons.Outlined.Edit, "Clear")
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions {
                    focusManager.clearFocus()
                },
                singleLine = true,
            )
        }
        item { Spacer(Modifier.height(4.dp)) }

        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)

            ){
            Button(
            onClick = { /* Do something! */ },


            ) {
            Icon(
                Icons.Filled.Build,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Like")
        } }}


    }
}

@Preview
@Composable
fun ButtonSample() {
    Button(onClick = { /* Do something! */ }) { Text("Button") }
}
@Composable
fun ButtonWithIconSample() {
    Button(
        onClick = { /* Do something! */ },

        ) {
        Icon(
            Icons.Filled.Add,
            contentDescription = "Localized description",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("Cadastrar")
    }
}
