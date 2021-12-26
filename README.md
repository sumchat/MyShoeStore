# MyShoeStore
 This app is my first Android application with Kotlin where I built a multiscreen Android application and implemented a navigation file to take the user through the app. I also used the ArcGIS Runtime API for Android to add a webmap to it. The app is building with four screens:

Login  
Welcome  
Instrucions with map  
Shoe list  
Shoe detail which can be used to update an existing item or add a new item to the list  


![image](https://user-images.githubusercontent.com/6456871/147396303-e790e014-a63b-416d-8808-9005bf9467fc.png)
![image](https://user-images.githubusercontent.com/6456871/147396309-e8f059dc-6120-42a7-ac32-b70ee6710c4a.png)
![image](https://user-images.githubusercontent.com/6456871/147396324-1819ef40-23ea-4f78-90b6-b37e634f921e.png)
![image](https://user-images.githubusercontent.com/6456871/147396334-5ed593e1-74c2-45e6-b3d0-8f212b679a90.png)
![image](https://user-images.githubusercontent.com/6456871/147396348-477dc267-bd31-43a0-ad0e-6fed7ad9e17a.png)
![image](https://user-images.githubusercontent.com/6456871/147396358-ef2c640c-c668-45ea-ae6f-007c751bcdb1.png)
![image](https://user-images.githubusercontent.com/6456871/147396365-17ff024e-dddb-4973-a526-cbdb3fb31988.png)


# About the Code:
It is a single activity architecture with multiple fragments. Each screen is a fragment. It also uses ViewModel and LiveData Lifecycle classes. The login is implemented by using a viewModel scoped to the activity(activityViewModel). Once the user is registered , then the login button can be used to sign in the user if the user signs out from the logout menu in the options menu in the Show list page. A Spinner component is used to display the different shoe sizes in the details page
