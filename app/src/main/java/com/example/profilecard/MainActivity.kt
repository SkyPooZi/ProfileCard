package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                ProfileCard(
                    nama = "Moch Siril Wafa Zidane Feliano",
                    nrp = "5025251041",
                    programStudi = "Rekayasa Perangkat Lunak",
                    email = "zidanefeliano2025@gmail.com",
                    status = "Mahasiswa",
                    angkatan = 2025,
                    semester = 3
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCardTheme {
        ProfileCard(
            nama = "Moch Siril Wafa Zidane Feliano",
            nrp = "5025251041",
            programStudi = "Rekayasa Perangkat Lunak",
            email = "zidanefeliano2025@gmail.com",
            status = "Mahasiswa",
            angkatan = 2025,
            semester = 3
        )
    }
}

@Composable
fun ProfileCard(
    nama: String,
    nrp: String,
    programStudi: String,
    email: String,
    status: String,
    angkatan: Int,
    semester: Int
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF0866D6))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .padding(horizontal = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.its),
                    contentDescription = "Logo ITS",
                    modifier = Modifier.size(80.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(
                    modifier = Modifier.width(16.dp)
                )
                Column {
                    Text(
                        text = "INSTITUT TEKNOLOGI",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "SEPULUH NOPEMBER",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "ITS",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)
                .padding(horizontal = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 24.dp,
                        bottom = 16.dp
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_image),
                    contentDescription = "Foto profil",
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(
                    modifier = Modifier.height(24.dp)
                )
                Text(
                    text = "PROFIL MAHASISWA",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(
                    modifier = Modifier.height(24.dp)
                )
                ProfileItem(
                    icon = Icons.Default.Person,
                    label = "Nama",
                    value = nama
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                ProfileItem(
                    icon = Icons.Default.School,
                    label = "NRP",
                    value = nrp
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                ProfileItem(
                    icon = Icons.AutoMirrored.Filled.MenuBook,
                    label = "Program Studi",
                    value = programStudi
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                ProfileItem(
                    icon = Icons.Default.Email,
                    label = "Email",
                    value = email
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                ProfileItem(
                    icon = Icons.Default.Badge,
                    label = "Angkatan",
                    value = angkatan.toString()
                )
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
                HorizontalDivider()
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ProfileBottomItem(
                        icon = Icons.Default.Groups,
                        text = status,
                        modifier = Modifier.weight(1f)
                    )
                    VerticalDivider(
                        modifier = Modifier.height(28.dp)
                    )
                    ProfileBottomItem(
                        icon = Icons.Default.CalendarMonth,
                        text = "Semester $semester",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileItem(
    icon: ImageVector,
    label: String,
    value: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            tint = Color.Blue,
            contentDescription = null
        )
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = value,
                color = Color.Black,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Composable
fun ProfileBottomItem(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            tint = Color.Blue,
            contentDescription = null
        )
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}