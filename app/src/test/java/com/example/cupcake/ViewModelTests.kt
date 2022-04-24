package com.example.cupcake

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.assertEquals


class ViewModelTests {

//    Specifying LiveData objects to not call on the main thread(UI runs on this thread)
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()


    @Test
    fun quantity_twelve_cupcakes(){
        val viewModel = OrderViewModel()
//        LiveData Objects need to be observed to see the changes
        viewModel.quantity.observeForever{}
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes(){
        val viewModel = OrderViewModel()
        viewModel.price.observeForever{}
        viewModel.setQuantity(12)
        assertEquals("$27.00", viewModel.price.value)
    }

}