package com.example.permissionrequest.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.permissionrequest.utils.PermissionStatus

class PermissionViewModel: ViewModel() {
    private val _permissionStatus = mutableStateOf<PermissionStatus?>(null)
    val permissionStatus: State<PermissionStatus?> = _permissionStatus

    fun updatePermissionStatus(status: PermissionStatus) {
        _permissionStatus.value = status
    }
}