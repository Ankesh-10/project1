/*Define two classes Car and Model class Car has a private variable carname and class Model has a
private variable Modelname. Write zero argument and parameterized constructors to initialize the
data member and member functions to get, set and display the data member for these classes. In
the result class, write a merge() method which takes the 2 arguments as class Car and class Model
objects and concatenates the data members of these two objects. Write a main function that
creates instances of the classes Car and Model, assigns values to each and concatenates the value
of data member of these objects using the merge() method . Display the objects before and after
concatenation.*/
class Car {
    private String carName;

    // Default constructor
    public Car() {
        this.carName = "Unknown";
    }

    // Parameterized constructor
    public Car(String carName) {
        this.carName = carName;
    }

    // Getter method
    public String getCarName() {
        return carName;
    }

    // Setter method
    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Method to display car name
    public void displayCar() {
        System.out.println("Car Name: " + carName);
    }
}
class Model {
    private String modelName;

    // Default constructor
    public Model() {
        this.modelName = "Unknown";
    }

    // Parameterized constructor
    public Model(String modelName) {
        this.modelName = modelName;
    }

    // Getter method
    public String getModelName() {
        return modelName;
    }

    // Setter method
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
    class Result {
        // Method to merge car and model names
        
        public String merge(Car car, Model model) {
            return car.getCarName() + " " + model.getModelName();
        }
    public static void main(String[] args) {


        // Create instances of Car and Model using parameterized constructors
        Car car = new Car("Toyota");
        Model model = new Model("Corolla");

        // Display car and model names before concatenation
        System.out.println("Before Concatenation:");
        car.displayCar();
        System.out.println("Model Name: " + model.getModelName());

        // Create an instance of Result class
        Result result = new Result();

        // Concatenate car and model names
        String mergedName = result.merge(car, model);

        // Display the concatenated name
        System.out.println("After Concatenation: " + mergedName);
    }
}
