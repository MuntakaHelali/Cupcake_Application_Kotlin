package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

private const val PRICE_PER_CUPCAKE = 2.00
private const val PRICE_FOR_SAME_DAY_PICKUP = 3.00

//Shared ViewModel for Order
class OrderViewModel: ViewModel() {

//    Property for quantities of cupcakes
    private val _quantity = MutableLiveData<Int>()
    val quantity: LiveData<Int> = _quantity

//    Property for flavor of cupcakes
    private val _flavor = MutableLiveData<String>()
    val flavor: LiveData<String> = _flavor

//    Property for pick-up date for cupcakes
    private val _date = MutableLiveData<String>()
    val date: LiveData<String> = _date

//    Property for order price of the cupcakes
    private val _price = MutableLiveData<Double>()
    val price: LiveData<String> = Transformations.map(_price){
        NumberFormat.getCurrencyInstance().format(it)
    }

//    Class property for date pickup options
    val dateOptions = getPickupOptions()

//    Setter Method to set quantity of cupcakes selected
    fun setQuantity(numberCupcakes: Int){
        _quantity.value = numberCupcakes
        updatePrice()
    }

//    Setter Method to set flavor of cupcakes selected
    fun setFlavor(desiredFlavor: String){
        _flavor.value = desiredFlavor
    }

//    Setter Method to set pick-up date of cupcakes selected
    fun setDate(pickupDate: String){
        _date.value = pickupDate
        updatePrice()
    }

    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }

    private fun getPickupOptions(): List<String>{
        val options = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()

        // Create a list of dates starting with the current date and the following 3 dates
        repeat(4){
            options.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return options
    }

    fun resetOrder(){
        _quantity.value = 0
        _flavor.value = ""
        _date.value = dateOptions[0]
        _price.value = 0.0
    }

    init{
        resetOrder()
    }

    private fun updatePrice(){
        var calculatedPrice = (_quantity.value?: 0) * PRICE_PER_CUPCAKE
        if(_date.value == dateOptions[0])
        {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        _price.value = calculatedPrice
    }
}