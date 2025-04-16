package com.example.permissionrequest.utils

sealed class PermissionStatus {
    object Granted : PermissionStatus()
    object Denied : PermissionStatus()
    object PermanentlyDenied : PermissionStatus()
}