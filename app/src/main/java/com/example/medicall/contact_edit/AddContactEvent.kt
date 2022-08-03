package com.example.medicall.contact_edit

sealed class AddContactEvent{
    data class OnNameChange(var name: String): AddContactEvent()
    data class OnPhoneChange(var phone: String): AddContactEvent()
    object Save: AddContactEvent()
}
