# ViewModelFactory
Small examples of how to implement ViewModelFactory with the purpose of passing arguments through the viewModel class when instantiating it

## Explanation
The functionality of the application is limited to incrementing a counter by pressing a button and displaying it on the screen.

* In the first example we pass an integer as an argument from the MainActivity when instantiating the view model class.
* In the second example we pass as an argument an instance of a repository class, initialized in the Application(MyApp) class when instantiating the view model from MainActivity.
* In the third example, an instance of the repository class is passed as an argument, but calling it from the MainActivity when the view model class is instantiated.

