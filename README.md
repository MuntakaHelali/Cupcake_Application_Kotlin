Cupcake app
=================================

This app contains an order flow for cupcakes with options for quantity, flavor, and pickup date.
The order details get displayed on an order summary screen and can be shared to another app to
send the order. This app demonstrates multiple fragments in an activity, a shared ViewModel across fragments,
data binding, LiveData, and the Jetpack Navigation component. 
<br>
<br>
Looking at the functionality of the application in terms of user experience, the user is presented with 3 choices when the application is launched. The user can decide how many cupcakes they would like to order, either 1, 6, or 12 cupcakes. Then they can select on the button for their choice.
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169676979-b4dd99ce-2057-478e-9f1d-ecbe123bd959.png" width="250">
</p>
<br>
<br>
Lets say the user chooses 6 cupcakes, the user will then be redirected to a screen where they can choose their preferred flavor option. They are also shown the price of all the cupcakes. Once they have clicked on the flavor, they can choose to either cancel the order and start again or move on to the next part of the order process. 
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169677036-79403a5d-441e-417d-b9bd-d9a28d2377f4.png" width="250">
</p>
<br>
<br>
Once they select their flavor (red-velvet in this case) the user is prompted to another screen where they choose what day they would like to pickup the cupcakes. If they choose the same day option (first option) then it will cost $3 more. The change in price will be shown in the subtotal as the user selects on the different dates avaliable for pickup. 
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169677207-d3d5d1ee-0483-43e3-8922-049d45e3f6f8.png" width="250">
  <img src="https://user-images.githubusercontent.com/57158277/169677234-74713585-dbac-4027-8b10-c534eb58fc95.png" width="251">
</p>
<br>
<br>
Finally, the user will be shown the summary of the order they have created, showing the quantity of their choosing, flavor, and the pickup date. They are also shown the total price of their order and the option to send the order to another application(ie. their default email application). If they want to change something with the order they can simply go back to the previous screens, or select the cancel button to start a completly new order.
<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/57158277/169677275-d3e7c696-919d-497c-b838-60cee1fdcaa1.png" width="250">
  <img src="https://user-images.githubusercontent.com/57158277/169677381-eeb522a1-a585-41f4-88b3-f952c2a2ec67.png" width="250">
</p>
<br>
<br>







