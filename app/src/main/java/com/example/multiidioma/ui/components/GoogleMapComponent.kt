package com.example.multiidioma.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.repository.cIMUS
import com.example.multiidioma.data.repository.cIQUS
import com.example.multiidioma.data.repository.centrosSingulares
import com.example.multiidioma.data.repository.descriptionCimus
import com.example.multiidioma.data.repository.descriptionCiqus
import com.example.multiidioma.data.repository.institutosInvestigacion
import com.example.multiidioma.data.repository.santiago
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.android.gms.maps.model.LatLng
import com.example.multiidioma.data.types.MarkerType
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.compose.MapUiSettings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoogleMapComponent(modifier: Modifier = Modifier, markerType: MarkerType) {

    /*val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(santiago, 13.5f)
    }*/
    val cameraPositionState = rememberCameraPositionState()
    val uiSettings = remember {
        MapUiSettings(
            compassEnabled = true,
            indoorLevelPickerEnabled = true,
            mapToolbarEnabled = true,
            myLocationButtonEnabled = true,
            rotationGesturesEnabled = true,   // 👈 rotación con dos dedos
            scrollGesturesEnabled = true,     // mover el mapa
            scrollGesturesEnabledDuringRotateOrZoom = true,
            tiltGesturesEnabled = true,       // inclinar con dos dedos
            zoomControlsEnabled = true,       // botones +/-
            zoomGesturesEnabled = true        // zoom con los dedos 👈
        )
    }
    // 👇 Esto mueve la cámara automáticamente al entrar en la pantalla
    // 👇 centramos la primera vez
    LaunchedEffect(Unit) {
        cameraPositionState.move(
            CameraUpdateFactory.newLatLngZoom(santiago, 13.5f)
        )
    }
    val markers = when (markerType) {
        MarkerType.CENTROS_SINGULARES -> centrosSingulares
        MarkerType.INSTITUTOS_INVESTIGACION -> institutosInvestigacion
        else -> emptyList()
    }
    var selectedCentro by remember { mutableStateOf<String?>(null) }
    GoogleMap(
        modifier = modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState,
        uiSettings = uiSettings
    ) {
        markers.forEach { centro ->
            Marker(
                state = MarkerState(position = centro.position),
                anchor = Offset(0.2f, 1.0f),
                title = centro.title,
                //snippet = centro.description,
                onClick = {
                    selectedCentro = centro.description // Aquí metes tu descripción
                    false // Devuelve false para que no consuma el evento y se siga mostrando la InfoWindow
                }
            )
        }
    }
    if (selectedCentro != null) {
        androidx.compose.material3.ModalBottomSheet(
            onDismissRequest = { selectedCentro = null }
        ) {
            Text(
                text = selectedCentro!!,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}



