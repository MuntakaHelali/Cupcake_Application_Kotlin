package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Shared ViewModel for Order
class OrderViewModel: ViewModel() {

//    Property for quantities of cupcakes
    private val _quantity = MutableLiveData<Int>(0)
    val quantity: LiveData<Int> = _quantity

//    Property for flavor of cupcakes
    private val _flavor = MutableLiveData<String>("")
    val flavor: LiveData<String> = _flavor

//    Property for pick-up date for cupcakes
    private val _date = MutableLiveData<String>("")
    val date: LiveData<String> = _date

//    Property for order price of the cupcakes
    private val _price = MutableLiveData<Double>(0.0)
    val price: LiveData<Double> = _price

//    Setter Method to set quantity of cupcakes selected
    fun setQuantity(numberCupcakes: Int){
        _quantity.value = numberCupcakes
    }

//    Setter Method to set flavor of cupcakes selected
    fun setFlavor(desiredFlavor: String){
        _flavor.value = desiredFlavor
    }

//    Setter Method to set pick-up date of cupcakes selected
    fun setDate(pickupDate: String){
        _date.value = pickupDate
    }

    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }

}